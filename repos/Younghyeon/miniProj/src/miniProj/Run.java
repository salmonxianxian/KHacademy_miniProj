package miniProj;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("~*~*~*~*~*~*~*~*~*~");
			System.out.println("# M a i n M e n u #\n");
			System.out.println("[1] 밥집 추천 프로그램");
			System.out.println("[2] 이상형월드컵");
			System.out.println("[3] 숫자야구 게임");
			System.out.println("\n[0] 프로그램 종료\n");
			System.out.println("~*~*~*~*~*~*~*~*~*~");
			
			System.out.print(">> ");
			String str = sc.next();
		
			System.out.println("");
		
			switch(str) {
		
			case "1" : new MenuRecommend();
				break;
			case "2" : new WorldCup();
				break;
			case "3" : new BaseBall();
				break;
			case "0" : System.out.println("@ 프로그램을 종료합니다.");
				return;
			default : System.out.println("정확히 좀 입력하세요;\n");
				break;
		
			}
		}
	}
}
