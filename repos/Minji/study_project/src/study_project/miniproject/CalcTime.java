package study_project.miniproject;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalcTime {
	public static void main(String[] args) {
		//��ǻ�� ���� �ð��� �޾ƿͼ� ����ð������� �ð� ���ϱ�
		
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
		
		System.out.print("���α׷� ����?(y/n) ");
		an = sc.nextLine();
		if( an.equals(str) ) {
			return;
		} //End if
			
		System.out.println(endTime_H + ":" + endTime_M + ":" + endTime_S);
		System.out.println(curHour + ":" + curMin + ":" + curSec);
		
		if(curHour > endTime_H && curMin > endTime_M && curSec > endTime_S) { //������
			System.out.println("���� ����");
			return;
		}
		else {
			System.out.print(endTime_H - curHour - 1 + "�ð� "); //�ð� Ȯ��
			System.out.print(time_m - curMin + endTime_M + "�� ");
			System.out.println(time_m - curSec + "�� ���ҽ��ϴ�");
		} //End if
	}
}
