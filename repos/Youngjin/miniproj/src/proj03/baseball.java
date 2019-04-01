package proj03;
//characterset to UTF-8 한글
import java.util.Random;
import java.util.Scanner;

public class baseball {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    
    
    public int gametype() {
	    	System.out.println("게임을 할 건데, 자릿수를 정할게.\n3자릿수 게임을 진행하려면 3을, 4자릿수 게임을 진행하려면 4를 입력해.");
	    	int type = sc.nextInt();
	    
	    	if(!(type==3||type==4)) {
	    		do {
	        		System.out.print("잘 보고 다시 입력해봐 임마. ");
	        		type = sc.nextInt();
	        	} while(!(type==3||type==4));
	    	}
    	
    		return type;
    }
    
    
    public void game(int num) {
    	
    	// gametype()에서 사용자로부터 입력받은 자릿수를 대입받는 int형 변수 
    	// num = gametype();
    	
    	// 컴퓨터가 게임에서 사용할 수를 담을 배열 
    	int[] comNum = new int[num];
        
        for(int i=0; i<comNum.length; i++) {
        		comNum[i] = rand.nextInt();
        }
        
    }
    
    
}