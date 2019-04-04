package study_project.miniproject;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalcTime {
	public static void main(String[] args) {
		//컴퓨터 현재 시간을 받아와서 종료시간까지의 시간 구하기
		
		Scanner sc = new Scanner(System.in);
		GregorianCalendar cal = new GregorianCalendar();
//		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		
		final int time_m = 60;
		
		final int endTime_H = 3; //15 
		final int endTime_M = 20;
		final int endTime_S = 00;
	
		int curHour = cal.get(Calendar.HOUR);
		int curMin = cal.get(Calendar.MINUTE);
		int curSec = cal.get(Calendar.SECOND);
//		int cur = cal.get(Calendar.AM_PM); //int
		
		String an;
		String str = "n";
		
		System.out.print("프로그램 시작?(y/n) ");
		an = sc.nextLine();
		if( an.equals(str) ) {
			return;
		} //End if
			
		System.out.println(endTime_H + ":" + endTime_M + ":" + endTime_S);
		System.out.println(curHour + ":" + curMin + ":" + curSec);
		
		if(curHour > endTime_H && curMin > endTime_M && curSec > endTime_S) { //연산자
			System.out.println("수업 종료");
			return;
		}
		else {
			System.out.print(endTime_H - curHour - 1 + "시간 "); //시간 확인
			System.out.print(time_m - curMin + endTime_M + "분 ");
			System.out.println(time_m - curSec + "초 남았습니다");
		} //End if
	}
}
