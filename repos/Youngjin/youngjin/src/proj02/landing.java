package proj02;

import java.util.concurrent.TimeUnit;

public class landing {
	
	public void delay(int num) {
		try {
			TimeUnit.MICROSECONDS.sleep(num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void intro() {
		String[] intro = new String[5];
		intro[0] = "이상형 월드컵 방식의 좋아하는 음식을 고르는 게임이야.";
		intro[1] = "리스트에 넣을 음식의 가짓수를 먼저 고른 후,";
		intro[2] = "토너먼트 방식으로 각각의 음식을 매칭하여 더 좋아하는 음식을 선택해서";
		intro[3] = "최종적으로 가장 좋아하는 음식을 고르는 게임이야.";
		intro[4] = "시작하자!";
		
		for(int i=0; i<intro.length; i++) {
			System.out.println(intro[i]);
			int j = 750000;
			j -= 75000;   // 점점 빠르게 출력하는 효과 
			delay(j);
		}
	}
	
}
