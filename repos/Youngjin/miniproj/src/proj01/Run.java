package proj01;

import java.util.Scanner;
import java.util.Random;

class randomPick {
	public void korean(int num) {
		switch(num) {
		case 0:  
			System.out.println("칼국수"); break;
		case 1:
			System.out.println("김치찌개"); break;
		case 2:
			System.out.println("갈비탕"); break;
		case 3:
			System.out.println("순대국"); break;
		}
	}
	
	public void japanese(int num) {
		switch(num) {
		case 0:
			System.out.println("초밥"); break;
		case 1:
			System.out.println("라멘"); break;
		case 2:
			System.out.println("유부초밥"); break;
		case 3:
			System.out.println("튀김우동"); break;
		}
	}
	
	public void chinese(int num) {
		switch(num) {
		case 0:
			System.out.println("자장면"); break;
		case 1:
			System.out.println("짬뽕"); break;
		case 2:
			System.out.println("탕수육"); break;
		}
	}
	
	public void english(int num) {
		switch(num) {
		case 0:
			System.out.println("서브웨이"); break;
		case 1:
			System.out.println("맥도날드"); break;
		case 2:
			System.out.println("스타벅스"); break;
		}
	}
	
	public void convenient(int num) {
		switch(num) {
		case 0:
			System.out.println("도시락"); break;
		case 1:
			System.out.println("컵라면"); break;
		case 2:
			System.out.println("삼각김밥"); break;
		case 3:
			System.out.println("초콜렛"); break;
		}
	}
}

class category {
	public void category(int cate) {
		randomPick rp = new randomPick();
		Random ran = new Random();
		int pick;
		
		switch(cate) {
			case 0:
		    	   	System.out.println("한식을 골랐구나");
		    	   	pick = ran.nextInt(3);
		    	   	rp.korean(pick);
		    	   	break;
			case 1:
		    	   	System.out.println("일식을 골랐구나");
		    	   	pick = ran.nextInt(3);
		    	   	rp.japanese(pick);
		    	   	break;
			case 2:
		    	   	System.out.println("중식을 골랐구나");
		    	   	pick = ran.nextInt(2);
		    	   	rp.chinese(pick);
		    	   	break;
			case 3:
		    	   	System.out.println("양식을 골랐구나");
		    	   	pick = ran.nextInt(2);
		    	   	rp.english(pick);
		    	   	break;
			case 4:
		    	   	System.out.println("편의점을 골랐구나");
		    	   	pick = ran.nextInt(3);
		    	   	rp.convenient(pick);
		    	   	break;
		}
	}
}

// for storing methods
class box {
	public void landing() {
		System.out.println("기다리고 기다리던 점심시간이다. 밥묵어야지?\n추천해줄테니까 일단 종류부터 골라봐.");
		System.out.println("(숫자를 입력하시오)\n0. 한식\n1. 일식\n2. 중식\n3. 양식\n4. 편의점\n5. 공복");
		Scanner sc = new Scanner(System.in);
		int cate = sc.nextInt();
		
		if(cate==5) {
			System.out.println("임마, 굶을거면 이걸 왜 하고있냐..!!");
		}
		
		category c = new category();
		c.category(cate);
	}
}

// main class
public class Run {
	public static void main(String[] args) {
		box b = new box();
		b.landing();
	}
}
