package miniProj;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class WannaGoHome2 {

	Scanner sc = new Scanner(System.in);
	
	SimpleDateFormat sdf = new SimpleDateFormat("a hh:mm:ss yyyy.MM.dd\n");
	SimpleDateFormat timeFormat = new SimpleDateFormat("a hh:mm:ss\n");
	SimpleDateFormat timeStamp = new SimpleDateFormat("hh시간 mm분 ss초");		
	
	Date now = new Date();
	
	long test = 1000*60*60*24; // 24시간
	
	long todayStart = (now.getTime()-(now.getTime()%test)); // 오늘 오전 09시의 밀리초
	// 현재까지의 밀리초 - 현재까지의 밀리초%24
	// 현재까지 흘러온 시간 - 그것을 일 수로 나눈 것의 나머지(오늘의 시작점부터 현재까지 걸린 시간) = 오늘의 시작점

	long endTimemilli = (1000*60*60*6)+(1000*60*20); // 오전 9시부터 오후 3시 20분까지의 밀리초(6시간 20분)
	long endTime = todayStart+endTimemilli; // 오늘 오후 3시 20분의 밀리초

	
	public WannaGoHome2() {
		
		System.out.println("# 집에 가고싶어 ..#\n");
		System.out.println("@ 현재 날짜 & 시간");
		System.out.println(sdf.format(now));
		
		System.out.println("@ 수업 종료 시간 ");
		System.out.println(timeFormat.format(endTime));
		
		System.out.println("@ 수업 종료까지 남은 시간");
		
		if(now.getTime()<=endTime) {
			System.out.println(timeStamp.format(endTime-now.getTime()));
		} else {
			System.out.println("@ 오늘은 수업이 끝났습니다.");
		}
			
	}
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * SimpleDateFormat sdf = new SimpleDateFormat("a hh:mm:ss yyyy.MM.dd\n");
	 * SimpleDateFormat timeFormat = new SimpleDateFormat("a hh:mm:ss\n");
	 * SimpleDateFormat timeStamp = new SimpleDateFormat("hh시간 mm분 ss초");
	 * 
	 * Date now = new Date();
	 * 
	 * long test = 1000*60*60*24; // 24시간
	 * 
	 * long todayStart = (now.getTime()-(now.getTime()%test)); // 오늘 오전 00시의 밀리초 //
	 * 현재까지의 밀리초 - 현재까지의 밀리초%24 // 현재까지 흘러온 시간 - 그것을 일 수로 나눈 것의 나머지(오늘의 시작점부터 현재까지
	 * 걸린 시간) = 오늘의 시작점
	 * 
	 * long endTimemilli = (1000*60*60*6)+(1000*60*20); // 오전 9시부터 오후 3시 20분까지의
	 * 밀리초(6시간 20분) long endTime = todayStart+endTimemilli; // 오늘 오후 3시 20분의 밀리초
	 * 
	 * System.out.println("# 현재 날짜 & 시간 #"); System.out.println(sdf.format(now));
	 * 
	 * System.out.println("@ 수업 종료 시간 "); //
	 * System.out.println(sdf.format(now.setTime(endTime)));
	 * System.out.println(timeFormat.format(endTime));
	 * 
	 * System.out.println("@ 수업 종료까지 남은 시간");
	 * System.out.println(timeStamp.format(endTime-now.getTime()));
	 * 
	 * 
	 * // sdf.format(obj);
	 * 
	 * System.out.println(todayStart);
	 * 
	 * System.out.println("오전 9시부터 오후 3시 20분까지의 밀리초 : "+endTimemilli);
	 * 
	 * System.out.println("현재까지의 밀리초 : " + now.getTime());
	 * System.out.println("현재까지의 일 수 : " + now.getTime()/test);
	 * 
	 * System.out.println("오늘 오전 9시까지의 밀리초 : " + todayStart);
	 * 
	 * System.out.println("test, 현재까지 밀리초 - 오늘 오전 9시까지의 밀리초 : " + (now.getTime() -
	 * (17989*test)));
	 * 
	 * System.out.println("오늘 오후 3시 20분(수업 종료 시간)의 밀리초 : " +
	 * ((todayStart)+22800000));
	 * 
	 * System.out.println(endTime);
	 * 
	 * 
	 * }
	 */	
}
