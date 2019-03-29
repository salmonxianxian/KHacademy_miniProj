package proj02;

import java.util.Random;
import java.util.Scanner;

public class foodList {
	
	landingEffect ld = new landingEffect();
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	gamestartEffect ge = new gamestartEffect();
	
	
	public void checkError(String method) {
		System.out.println("no error untill "+method);
	}
	
	public int units() {
		
		// 음식 리스트 입력받을 배열 생성 
		System.out.println("음식 대전에 참여할 음식의 가짓 수를 정하세요.\n1: 4가지   2.8가지   3.16가지");
		int inputNum = sc.nextInt();
				
		int num = 0;   // 프로그램 내부에서 사용할 음식 가짓 수 변수 
				
		switch(inputNum) {
			case 1: num=4; break;
			case 2: num=8; break;
			case 3: num=16; break;
			default:
				do {
					if(inputNum!=1&&inputNum!=2&&inputNum!=3) {
						System.out.println("이걸 못해서 오타를 내냐..ㅉㅉ");
					}
					System.out.println("다시 잘 보고 입력해봐 임마.\n1: 4가지   2.8가지   3.16가지");
					inputNum = sc.nextInt();
				} while (inputNum!=1&&inputNum!=2&&inputNum!=3);
			break;
			}
		
		return num; 
	}
	
	public String[] inputCand() {
		
		// 입력받은 음식의 가짓수를 사용할 변수 num에 대입 
		int num = units();
		
		
		String[] input = new String[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("\n음식대전에 넣을 기호 "+(i+1)+"번 음식을 입력해주세요.\n: ");
			input[i] = sc.next();
		}
		
		// 음식 리스트 출력해서 보여주기 
		System.out.println("\n** 리스트 후보 입니다. **");
		for(int i=0; i<input.length; i++) {
			System.out.println("기호 "+(i+1)+"번 음식 : "+input[i]);
			ld.delay(20000);
		}
		
		return input;
	}
	
	
	public void tournament() {
		String[] candidates = inputCand();
		
		ge.loading();
		
		// candidates[] = 음식리스트 입력받은 배열 
		// randInt[] = 난수 생성하여 저장한 배열, candidates[]의 인덱스를 shuffle하는데 사용 
		// tourn[] = 토너먼트에서 사용할 배열

		
		// 음식리스트 배열의 인덱스를 무작위로 바꿔줄 임시 배열 
		int[] randInt = new int[candidates.length];
		
		for(int i=0; i<randInt.length; i++) {
			randInt[i] = rand.nextInt(candidates.length);
			if(i>0) {
				for(int j=i; j>=0; j--) {
					if(randInt[j]==randInt[i]) {
						i--;
					}
				}
			}
		}
		
		String[] tourn = new String[candidates.length];
		
		
		// 난수로 푸드리스트 shuffle, 최종 배열에 대입 
		for(int i=0; i<candidates.length; i++) {
			tourn[randInt[i]]=candidates[i];
		}
		
		
		/*
		 *  토너먼트 시작 
		 *  
		 *  음식 개체 수에 따라 라운드 수를 분류하여
		 *  각각의 라운드에 따라 배열을 생성,
		 *  이전 라운드에서 사용자로부터 선택받은 음식들을
		 *  다음 라운드로 넘긴다.
		 */
		
		// 첫번째 라운드 배열에 난수를 인덱스로 받은 음식 리스트 후보 배열을 대입 
		String[] round1 = new String[candidates.length];
		for(int i=0; i<candidates.length; i++) {
			round1[i] = candidates[i];
		}
		
		
		// 입력받은 음식 개체 수에 따라 라운드 별 배열 생성  
		if(candidates.length>=4) {
			String[] round2 = new String[round1.length/2];
			if(candidates.length>=8) {
				String[] round3 = new String[round2.length/2];
				if(candidates.length>=16) {
					String[] round4 = new String[round3.length/2];
				}
			}
		}
		
		System.out.println("");
		System.out.println("왼쪽 음식이 마음에 들면 L, \n오른쪽 음식이 마음에 들면 R\n을 입력하세요.");
		
		char choice = ' ';
		
		//if(candidates.length<8)
//		for(int i=0; i<(int)(round1.length)/2; i=i+2) {
//			do {
//				System.out.print("L : "+round1[i]+"\t vs \t R : "+round1[i+1]);
//				choice = sc.next().charAt(0);
//				if(choice=='L') {
//					round2[i] = round1[i];
//				} else {
//					round2[i] = round1[i+1];
//				}
//			} while(choice=='L'||choice=='R');
//		}
		
		checkError("tournament-bottom");
	}
	
}
