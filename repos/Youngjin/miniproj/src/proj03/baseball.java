package proj03;

import java.util.Random;
import java.util.Scanner;

import proj02.gamestartEffect;
import proj02.landing;

public class baseball {
	
	// 객체 집합 
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    
    landing ld = new landing();
    gamestartEffect ge = new gamestartEffect();
    result re = new result();
    
    
    // 베이스볼 숫자 갯수 정하기 
    public int gametype() {
    	System.out.println("지금부터 게임을 할거야.\n숫자와 숫자의 자릿수를 맞추는 게임이야.\n숫자와 자릿수가 모두 맞으면 strike, 숫자만 맞추면 ball, 모두 틀리면 out이야.");
    	ld.delay(3000000);
    	System.out.println("3자릿수 게임을 진행하려면 3을, 4자릿수 게임을 진행하려면 4를 입력해.");
    	int type = sc.nextInt();
    
		if(!(type==3||type==4)) {
			do {
				System.out.println("3, 4 중 다시 입력해봐.");
				type = sc.nextInt();
			} while(!(type==3||type==4));
		}
	
		return type;
    }
    
    
    // 베이스볼에 사용할 난수 생성 
    public int[] numbers(int num) {
    	
	    	// 컴퓨터가 게임에서 사용할 수를 담을 배열 
	    	int[] comNum = new int[num];
        
	    for(int i=0; i<num; i++) {
	    		comNum[i] = rand.nextInt();
	    		for(int j=0; j<i; j++) {
	    			if(comNum[j]==comNum[i]) {
	    				i--;
	    			}
	    		}
	    	}
	    
	    return comNum;
    }
    
    

    // 같은 숫자 + 같은 자릿수(index) = Strike
    // 같은 숫자					 = Ball
    // 안맞음						 = Out
    
    int strike = 0;
    int ball = 0;
    int out = 0;
    
    
    // 사용자로부터 입력받은 값과 생성된 난수 배열과 매칭하여 분별 
    public void recog(int[] arr) {
    	
    		// 컴퓨터가 생성한 난수 배열 
    		int[] comNum;
    		comNum = arr;
    		int num = comNum.length;  // 베이스볼 자릿 수 
    		
    		
    		// 사용자로부터 입력받은 수를 저장할 배열
    		int[] userNum = new int[num];
    		
    		System.out.println("10번 안에 숫자를 맞추면 돼. 이제 시작한다!");
    		
    		// 게임 효과 
    		ge.loading();
    		
    		
    		// Game On!!!
    		
    		String result = null;   // result 값 대입 
    		
    		do {
    			for(int l=0; l<10; l++) {
    				
	    			// 사용자로부터 입력받기 
	    	    		System.out.print("Game On!\n"+num+"자리 수 입력해서 맞춰봐.\n : ");
	    	   		String input = sc.next();
    	    		
    	   		
	    	   		// String으로 입력받은 수를 char[]형으로 변환하기 
	    	    		char[] str2ch = input.toCharArray();
	    	    		
	    	    		for(int i=0; i<str2ch.length; i++) {
	    	    			System.out.println(str2ch[i]);
	    	    		}
	    	    		
	    	    		
	    	    		// char형을 int형으로 변환하기 
	    	    		for(int i=0; i<num; i++) {
	    	    			userNum[i] = (int)str2ch[i]-48;
	    	    		}
    	    		
    	    		
	    	    		// strike/ball/out 판별
	    	    		for(int i=0; i<num; i++) {
	    	    			for(int j=0; j<num; j++) {
	    	    				if(userNum[j]==comNum[i]) {
	    	    					if(i==j) {
	    	    						strike++;
	    	    					} else {
	    	    						ball++;
	    	    					}
	    	    				} else {
	    	    					out++;
	    	    				}
	    	    			}
	    	    		}
    	    		
    	    		
	    	    		// 결과 출력 
	    	    		System.out.print("**********\n"+(l+1)+"R : ");
	    	    		for(int i=0; i<num; i++) {
	    	    			System.out.print(userNum[i]);
	    	    		}
	    	    		
	    	    		// strike 3개 맞으면 결과값 반환.
	    	    		if(strike==3) {
	    	    			result = "user";
    				}
	    	    		
	    	    		// 카운트 초기화
	    	    		strike = 0; ball=0; out=0;
	    	    		
	    		} result = "computer";   // for문 끝나면(=10R끝나면,) 결과값 반환. 
    		} while(result!=null);
    		
    		
    		// 결과값에 따라 게임 결과 출력 
    		if(result=="user") { 
    			re.user(result);  
    		} else {
    			re.computer(result);
    		}
    		
    		
    }
    
    
}