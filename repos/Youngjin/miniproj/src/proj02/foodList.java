package proj02;
//characterset to UTF-8 한글
import java.util.Random;
import java.util.Scanner;

public class foodList {
	landing ld = new landing();
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	gamestartEffect ge = new gamestartEffect();
	Run run = new Run();
	
	
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
	public String[] inputlist(int num) {
		System.out.println("\n토너먼트에 넣을 음식을 입력해.");
		String[] foodArr = new String[num];
		for(int i=0; i<num; i++) {
			System.out.print((i+1)+"/"+(num)+" 번 음식 : ");
			foodArr[i] = sc.next();
		}
		
		ge.loading();
		
		return foodArr;
	}
	
	
	// 음식 리스트 배열을 무작위로 재배열할 메서드 
	public String[] shuffle(String[] foodArr) {
		
		String[] temp;
		temp = foodArr;  
		
		
		// 인덱스 재배열 
		int[] shuf = new int[temp.length];
		for(int i=0; i<temp.length; i++) {
			shuf[i] = rand.nextInt(temp.length);
			for(int j=0; j<i; j++) {
				if(shuf[i]==shuf[j]) {
					i--;
				}
			}
		}
		// 영현이 도움으로 해결.

		// 내가 작성했던 코드
		// 무한루프로 돌면서 return안함
		// 원인모름..
//			for(int i=0; i<num; i++) {
//				shuf[i] = rand.nextInt(num);
//				if(i>0) {
//					for(int j=i; j>=0; j--) {
//						if(shuf[j]==shuf[i]) {
//							i--;
//						}
//					}
//				}
//			}

		
		
		// 랜덤 인덱스를 받는 배열 생성
		// 랜덤 인덱스에 해당하는 요소에 foodList()에서 받은리스트 대입 
		String[] finalList = new String[temp.length];
		for(int i=0; i<temp.length; i++) {
			finalList[shuf[i]] = temp[i];
		}
		
		return finalList;
	}
	
}
