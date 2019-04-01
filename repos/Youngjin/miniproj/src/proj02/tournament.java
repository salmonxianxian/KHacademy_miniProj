package proj02;

import java.util.Scanner;

public class tournament {
	Scanner sc = new Scanner(System.in);
	
	// 토너먼트 배열 생성 
	String[] quarterFinal = new String[8]; 
	String[] semiFinal = new String[4];
	String[] Final = new String[2];
	
	// 최종 우승 음식 저장할 변수 
	String champion = "";
	
	
	// 토너먼트에서 사용할 라운드별 메서드 
	
	// 16강전
	public String[] advanced_to_quarterfinal(String[] arr) {
		
		String[] list;
		list = arr;
		
		for(int i=0; i<list.length-1; i=i+2) {
			System.out.println("왼쪽 음식이 더 좋으면 L, 오른쪽 음식이 더 좋으면 R을 선택해.");
			System.out.println(list[i]+" : "+list[i+1]);  // 토너먼트 시작
			char choice = sc.next().charAt(0);  // 사용자 선택 입력 받기 
			
			// 사용자 선택에 따라 다음라운드로 보낼 음식 결정
			if(choice == 'L') {
				quarterFinal[i/2] = list[i];
			} else {
				quarterFinal[i/2] = list[i+1];
			}
		}
		
		return quarterFinal;
	}
	
	
	// 8강전
	public String[] advanced_to_semifinal(String[] arr) {
		
		String[] quarterFinal;
		quarterFinal = arr;
		
		for(int i=0; i<quarterFinal.length-1; i=i+2) {
			System.out.println("왼쪽 음식이 더 좋으면 L, 오른쪽 음식이 더 좋으면 R을 선택해.");
			System.out.println(quarterFinal[i]+" : "+quarterFinal[i+1]);  // 토너먼트 시작
			char choice = sc.next().charAt(0);  // 사용자 선택 입력 받기 
			
			// 사용자 선택에 따라 다음라운드로 보낼 음식 결정
			if(choice == 'L') {
				semiFinal[i/2] = quarterFinal[i];
			} else {
				semiFinal[i/2] = quarterFinal[i+1];
			}
		}
		
		return semiFinal;
	}
	
	
	// 4강전
	public String[] advanced_to_final(String[] arr) {
		
		String[] semiFinal;
		semiFinal = arr;
		
		for(int i=0; i<semiFinal.length-1; i=i+2) {
			System.out.println("왼쪽 음식이 더 좋으면 L, 오른쪽 음식이 더 좋으면 R을 선택해.");
			System.out.println(semiFinal[i]+" : "+semiFinal[i+1]);  // 토너먼트 시작
			char choice = sc.next().charAt(0);  // 사용자 선택 입력 받기 
			
			// 사용자 선택에 따라 다음라운드로 보낼 음식 결정
			if(choice == 'L') {
				Final[i/2] = semiFinal[i];
			} else {
				Final[i/2] = semiFinal[i+1];
			}
		}
		
		return Final;
	}
	
	
	// 결승
	public String Final(String[] arr) {
		
		String[] Final;
		Final = arr;
		
		System.out.println("왼쪽 음식이 더 좋으면 L, 오른쪽 음식이 더 좋으면 R을 선택해.");
		System.out.println(Final[0]+" : "+Final[1]);
		char choice = sc.next().charAt(0);
		
		if(choice=='L') {
			champion = Final[0];
		} else {
			champion = Final[1];
		}
		
		return champion;
	}
	
	
	
	public void game(String[] arr) {
		
		String[] list;
		list = arr;
		
		if(list.length==4) {   // 음식 가짓 수가 4개일 때.
			champion = Final(advanced_to_final(list));
			
		} else if(list.length==8) { //음식 가짓 수가 8개일 때.
			champion = Final(advanced_to_final(advanced_to_semifinal(list)));
		} else {   // 음식 가짓수가 16개일 때
			champion = Final(advanced_to_final(advanced_to_semifinal(advanced_to_quarterfinal(list))));
		}
		
		System.out.println("네가 가장 좋아하는 음식은 "+champion+"이구나!");
	}
}
