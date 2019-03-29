package proj02;

import java.util.concurrent.TimeUnit;

public class landingEffect {
	
	public void delay(int num) {
		try {
			TimeUnit.MICROSECONDS.sleep(num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void landing() {
		String[] funny = new String[17];
		
		funny[0] = "                  ___";
		funny[1] = "                 |===|";
		funny[2] = "             =============";
		funny[3] = "               \\/ 0 0 \\/";
		funny[4] = "   ________ooo__\\__ㅁ__/_______________";
		funny[5] = "  /                                    \\";
		funny[6] = "  |      이상형 월드컵 방식의 최애 음식 대전!   |";
		funny[7] = "  |       좋아하는 음식 8가지를 입력하고,      |";
		funny[8] = "  | 나도 몰랐던 내가 제일 좋아하는 음식을 찾아보자!|";
		funny[9] = "  |                                     |";
		funny[10] = "  \\_______________________ooo__________/";
		funny[11] = "                 |  |  |";
		funny[12] = "                 |_ | _|";
		funny[13] = "                 |  |  |";
		funny[14] = "                 |__|__|";
		funny[15] = "                 /-'Y'-\\";
		funny[16] = "                (__/ \\__)\n";
	
		
		// print funny text
		for(int i=0; i<funny.length; i++) {
			System.out.println(funny[i]);
			delay(100000);   // delay to printout for 150000 micro seconds
		}
	
	}
	
}
