package miniProj;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class WannaGoHome2 {

	Scanner sc = new Scanner(System.in);
	
	SimpleDateFormat sdf = new SimpleDateFormat("a hh:mm:ss  yyyy.MM.dd\n");
	SimpleDateFormat timeFormat = new SimpleDateFormat("a hh:mm:ss\n");
	SimpleDateFormat timeStamp = new SimpleDateFormat("hh시간 mm분 ss초");		
	
	Date now = new Date();
	
	long test = 1000*60*60*24; // 24시간
	
	long todayStart = (now.getTime()-(now.getTime()%test)); // 오늘 오전 09시의 밀리초
	// 현재까지의 밀리초 - 현재까지의 밀리초%24
	// 현재까지 흘러온 시간 - 그것을 일 수로 나눈 것의 나머지(오늘의 시작점부터 현재까지 걸린 시간) = 오늘의 시작점

	long endTimemilli = (1000*60*60*6)+(1000*60*20); // 오전 9시부터 오후 3시 20분까지의 밀리초(6시간 20분)
	long endTime = todayStart+endTimemilli; // 오늘 오후 3시 20분의 밀리초

	long hour = (endTime-now.getTime())/3600000; // 수업 끝나는 시간 - 현재 시간 / 시간단위의 몫 = 남은 시간
	
	long minute = ((((endTime-now.getTime())/60000))%60); // 수업 끝나는 시간 - 현재 시간 / 분 단위의 몫 % 시간 단위 = 남은 분
	
	long second = ((((endTime-now.getTime())/1000)%360000)%60000)%60; // 수업 끝나는 시간 - 현재 시간 / 초 단위의 몫 % 시간 단위 % 분 단위 % 초 단위 = 초
	
	public WannaGoHome2() {
		
		System.out.println("# 집에 가고싶어 ..#\n");
		System.out.println("@ 현재 시간 & 날짜");
		System.out.println(sdf.format(now));
		
		System.out.println("@ 수업 종료 시간 ");
		System.out.println(timeFormat.format(endTime));
		
		System.out.println("@ 수업 종료까지 남은 시간");
		
		if(now.getTime()<=endTime) {
			
			System.out.print(hour + "시간 ");
			System.out.print(minute + "분 ");
			System.out.println(second + "초\n");
		} else {
			System.out.println("@ 오늘은 수업이 끝났습니다.\n");
		}
		while(true) {
			System.out.println("[0] 돌아가기");
			System.out.print(">> ");
			String str = sc.nextLine();
			System.out.println("");
			
			if(str.equals("0")) {
				System.out.println("");
				return;
			}
		}
	}

}
