package pro1;

import java.util.Random;
import java.util.Scanner;

public class foodChoice {
	public foodChoice() {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int round=1;
		//32개 음식 저장. 밑에 렌덤 함수로 호출
		String str[] = {"칼국수", "김치찜", "수육", "LA갈비", "삼겹살", "물냉면", "비빔냉면", "순두부", "비지장", "콩국수",
			    	    "스테이크", "돈까스", "갈비탕", "스파게티", "돈부리", "초밥", "회", "핫도그", "샌드위치", "햄버거",
				        "볶음밥","전골","동태찜","고등어구이","국밥","순대","탕수육","깐풍기","짜장면","짬뽕","우동","깐쇼새우"};
		
		int rank_round = 16;
		String[] str1 = new String[rank_round];
		String[] str2 = new String[rank_round/2];
		char ch = '\0';
		String sch = null;
		
		int[] arr = new int[rank_round];
		
		System.out.println("----음식 월드컵----\n");
		
		while(true) {
			int n=0;
			//렌덤 안겹치게 뿌리기 
			for(int i=0; i<rank_round; i++) {
				arr[i] = ran.nextInt(rank_round);
				for(int j=0; j<i; j++) {
					if(arr[i]==arr[j]) {
						i--;
					}
				}
			}
			for(int i=0; i<rank_round; i++) {
				if(rank_round==16) {
					//처음 16강에서만 
					str1[i] = str[arr[i]];
				} else {
					//8강~결승까지
					str1[i] = str2[arr[i]];
				}
			}
			
			//화면에 매 라운드 출력
			if(rank_round==16)	System.out.println("-------["+rank_round+"강]-------");
			else if(rank_round==8)	System.out.println("-------["+rank_round+"강]-------");
			else if(rank_round==4)	System.out.println("-------[준결승]-------");
			else if(rank_round==2)	System.out.println("-------[결승]-------");
			
			round=1;
			for(int i=0; i<rank_round; i++) {
				if(rank_round==2)	System.out.println("[FINAL]");
				else	System.out.println("[Round"+round+"]");
				
				System.out.println("1."+str1[i] + " VS "+ "2."+ str1[i+1]);
				//int형을 써서 입력 받을수도 있지만 int형 사용시 숫자이외의 값을 입력시
				//오류가 나면서 종료가된다. 그래서 string을 통해서 처음 입력값을 받고
				//string의 길이가 1일때만 char에 넣어 
				//아스키코드로 입력값이 1~2가 될때까지 입력받는다
				while(ch<49 || ch>50) {
					System.out.print("음식선택 (1 or 2): ");
					sch = sc.nextLine();	//char보다는 string을 쓰는게 더 많은 범위를 받아줄수 있어서 사용
					if(sch.length()==1) {	//1,2만 입력 받을 거니 string 길이가 1보다 크면 다시 입력
						ch = sch.charAt(0); //string길이가 1일시 char에 저장후 그 값이 49(1), 50(2)가 아니면 다시 입력
						if(ch<49 || ch>50) System.out.println("\t>>다시입력!!");
					}
					else System.out.println("\t>>다시입력!!");
				}
				if(ch==49) {//입력값이 1일 경우
					str2[n]= str1[i];
					System.out.println("\t>>["+str1[i]+"]을 선택!!\n");
				} else if(ch==50) {//입력값이 2일 경우
					str2[n]= str1[i+1];
					System.out.println("\t>>["+str1[i+1]+"]을 선택!!\n");
				}
				i++;
				n++;
				ch=0; //초기화
				round++;
			}
			
			rank_round /= 2;
			if(rank_round<2) {
				System.out.println("\n\t>>우승 : "+str2[0]+"\n");
				break;
			}
		}
	}	
}