package pro1;

import java.util.Random;
import java.util.Scanner;

public class baseBall {
	public baseBall() {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		String input_str = null;
		char input_ch='\0';
		
		
		System.out.println("\n\t>> [숫자 야구 게임 START!!]");
		
		while(input_ch<51 || input_ch > 57) {
			//int형을 써서 입력 받을수도 있지만 int형 사용시 숫자이외의 값을 입력시
			//오류가 나면서 종료가되서 string을 통해서 처음 입력값을 받고
			//string의 길이가 1일때만 char에 넣어 
			//아스키코드로 입력값이 3~9가 될때까지 입력받는다
			System.out.println("\n[3~9 까지 가능] ");
			System.out.print("몇개의 공을 치시겠습니까?");
			input_str = sc.nextLine();
			if( input_str.length() ==1) {
				input_ch = input_str.charAt(0);
				if(input_ch<51 || input_ch > 57) 
					System.out.println("\n\t>>다시입력!!");	
			} else System.out.println("\n\t>>다시입력!!");
		}
		
		// max : 입력받을수 있는 숫자의 횟수, max만큼 렌덤숫자 생성
		// 위에서 입력받은 숫자 만큼 max값 맞춰주기
		int max = 0;
		for(int i=49; i<=(int)input_ch; i++)	
			max++;
			
		int[] com_num = new int[max];	//컴퓨터가 생성한 랜덤값 저장
		int[] user_num = new int[max];	//사용자가 입력할 숫자 저장
		int[] strike_num = new int[max];//사용자가 입력한 값이 strike인 경우 저장해서 게임중에 보여주기 위해 사용

		int strike =0;
		int ball = 0;
		int out = 0;
		int round=1;
		
		//숫자 랜덤 생성후 com_num배열에 저장
		for(int i=0; i<max; i++) {
			com_num[i] = ran.nextInt(9)+1;
			for(int j=0; j<i; j++) {
				if(com_num[i]==com_num[j]) {
					i--;
				}
			}
		}
		
		System.out.println("\n\n------------- 게임 규칙 -------------");
		System.out.println("스트라이크(STRIKE): 숫자와 위치가 모두 맞음");
		System.out.println("볼(BALL): 숫자는 맞지만 위치가 틀림");
		System.out.println("아웃(OUT): 숫자와 위치가 모두 틀림");
		System.out.println("홈런(HOMERUN): 수비팀의 숫자를 정확히 맞힘");
		System.out.println("--------------------------------");
		
		while(true) {
			System.out.println("\n\n[ROUND"+round+"]");
			System.out.println("1~9까지의 숫자를 "+max+"번 입력해 주세요");
			for(int i=0; i<max; i++) {
				input_ch='\0';
				while(input_ch<49 || input_ch>57) {
					//int형을 써서 입력 받을수도 있지만 int형 사용시 숫자이외의 값을 입력시
					//오류가 나면서 종료가되서 string을 통해서 처음 입력값을 받고
					//string의 길이가 1일때만 char에 넣어 
					//아스키코드로 입력값이 1~max가 될때까지 입력받는다
					System.out.print((i+1)+"번째 수 입력 >> ");
					input_str=sc.nextLine();
					if(input_str.length()==1) {
						input_ch = input_str.charAt(0);
						if(input_ch<49 || input_ch>57)	System.out.println("\n\t>>다시 입력!!\n");
					} else System.out.println("\n\t>>다시 입력!!\n");
				}
				//위에서 입력받은 수가 String이므로 정수형으로 바꿔서 user_num에 입력한다
				user_num[i] = Integer.parseInt(input_str);
			}
			//strike체크
			for(int i=0; i<max; i++) {
				for(int j=0; j<max; j++) {
					if(com_num[i] == user_num[j]) {
						//strike인 경우
						if(i==j) {
							strike++;
							//사용자가 입력한 값이 strike인 경우 
							//strike_num 배열에저장
							strike_num[i] = user_num[j]; 
							if( strike == max) {
								System.out.println("\n\t>>"+round+"라운드 홈런~~\n");
								return;
							}
						}
						//ball인 경우
						else ball++;
					}
				}
			}
			//out 값 구하는 부분
			out = max-ball-strike;
			
			//사용자가 입력한 값을 판단하여 출력
			System.out.println("\n[Round"+round+"결과]");
			System.out.println("[STRIKE : " + strike+"\tBALL   : " + ball+"\tOUT    : " + out+"]");
			
			//사용자가 입력한 값중 Strike가 있다면 
			//위에서 strike_num 배열에 저장한 값을 호출해서
			//Strike인 수를 보여준다
			System.out.println("\n\n[지금까지 맞힌 숫자와 자리]");
			System.out.print("[");
			for(int i=0; i<max; i++) {
				System.out.print((i+1)+". "+strike_num[i]);
				if(i<max-1) System.out.print("\t");
			}
			System.out.println("]");
			
			round++;
			strike = 0;
			ball = 0;
			out = 0;
		}
	}
}