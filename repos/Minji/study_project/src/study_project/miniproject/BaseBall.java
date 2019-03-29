package study_project.miniproject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();	
		
		final int cnt = 3;
		int[] user = new int[3]; //user
		int[] random = new int[3]; //com
		int strike = 0; //스트라이크 개수 
		int ball = 0;
		int out = 0;
//		int[] idx; //배열 인덱스
		int count = 0; 	
		
		
		for(int i = 0; i < random.length; i++) {
			random[i] = ran.nextInt(8)+1; //1~9
			for(int j = 0; j < i; j++) {
				if(random[i] == random[j]) { 
					i--;
				}
			}
		}//for End
		
		System.out.println("[TEST] CHECK : " + Arrays.toString(random));
		
		
		//컴퓨터 배열과 사용자 배열을 서로 비교, 스트라이크, 볼인지 판단
		while(true) {
			
			for(int i = 0; i < cnt; i++) { 
				System.out.print("1~9 숫자 입력 : ");
				user[i] = sc.nextInt();
			}//for End
			System.out.println();
			
			//j for문이 2번 반복되거나 3번 반복됨 - 3번만 반복으로 수정
			//ball이 안됨
			//strike 도 두번째에서는 안됨
			
			//스트라이크 
			for(int i = 0; i < 1; i++) {
				
				for(int j = 0; j < cnt; j++) {
					
					if(user[i] == random[j]/*값*/ && i == j/*위치*/) {
						strike += 1;
						System.out.println("[TEST] strike : " + strike);
						
						if(strike == cnt) {
							System.out.println("홈런!!");
							return;
						}
					}
					
				}//for End
				
			}//for End
			
			for(int i = 0; i < 1; i++) {
				
				for(int j = 0; i < cnt; j++) {
					
					if(user[i] == random[j] && i != j) { //값은 같으나 위치가 다를 경우
						ball += 1;	
						System.out.println("[TEST] ball : " + ball);
					}
					
				}//for End
				
			}//for End
			
			out = cnt - ball - strike;
			
			count++;
			
			System.out.println("Strike : " + strike + ", Ball : " + ball + 
									", Out : " + out + " -> Count : " + count + "\n");
			
			strike = ball = out = 0; 
			
		}//while End
	}//End Main
}//End Class
