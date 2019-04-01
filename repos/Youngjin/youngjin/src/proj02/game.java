package proj02;
//characterset to UTF-8 한글
import java.util.Random;
import java.util.Scanner;

public class game {
	landing ld = new landing();
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	gamestartEffect ge = new gamestartEffect();
	
	public void game() {
		test(shuffle(units()));
	}
	
	
	// 음식 가짓 수 입력받기 
	public int units() {
		
		System.out.println("토너먼트에 넣을 음식의 가짓 수를 입력해줘. (4/8/16)");
		int num = sc.nextInt();
		
		if(!(num==4||num==8||num==16)) {
			do {
				System.out.println("4, 8, 16 중 다시 입력해봐.");
				num = sc.nextInt();
			} while(!(num==4||num==8||num==16));
		}
		
		return num;
	}
	
	
	// 음식 리스트 입력받기 
	public void foodlist(int num) {
		System.out.println("토너먼트에 넣을 음식을 입력해.");
		String[] foodArr = new String[num];
		for(int i=0; i<foodArr.length; i++) {
			foodArr[i] = sc.next();
		}
		
		ge.loading();
	}
	
	
	// 음식 리스트 배열을 무작위로 재배열할 메서드 
	public int[] shuffle(int num) {
		int[] shuf = new int[num];
		
		for(int i=0; i<num; i++) {
			shuf[i] = rand.nextInt(num);
			if(i>0) {
				for(int j=i; j>=0; j--) {
					if(shuf[j]==shuf[i]) {
						i--;
					}
				}
			}
			
		}
		
		return shuf;
	}
	
	
	public void test(int[] shuf) {
		for(int i=0; i<shuf.length; i++) {
			System.out.println(shuf[i]);
		}
	}
	
}
