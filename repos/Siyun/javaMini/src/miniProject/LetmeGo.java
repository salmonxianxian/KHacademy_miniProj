package miniProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LetmeGo {
	public void Letmego() throws ParseException {
		

		// (1) Calendar객체를 얻는다.

		Calendar cal = Calendar.getInstance();

		// (2) 출력 형태를 지정하기 위해 Formatter를 얻는다.

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy:MM:dd-hh:mm:ss");

		// (3) 출력형태에 맞는 문자열을 얻는다.

		String datetime1 = sdf1.format(cal.getTime());

		System.out.println("================================");
		System.out.println("           집에 가고싶어~~~~~~        ");
		System.out.println("================================");

		//------------------------------------------------------
		// (4) 개별적으로 년월일 시분초의 값을 얻을 수도 있다.

		int year = cal.get(Calendar.YEAR);

		int month = cal.get(Calendar.MONTH);

		int day = cal.get(Calendar.DAY_OF_MONTH);

		int hour = cal.get(Calendar.HOUR);
		
//		System.out.println(hour);

		int minute = cal.get(Calendar.MINUTE);
		
		int second = cal.get(Calendar.SECOND);

		int millisecond = cal.get(Calendar.MILLISECOND);
		
		//------------------------------------------------------

		System.out.println("SYSTEM TIME :  " + datetime1+'\n');
		System.out.println("현재시간 "+hour+"시 "+minute+"분 "+second+"초 입니다.");
		
		int endHour = 3;
		int endMinute = 20;
		
		int home_Hour=0;
		int home_Minute = 0;
		
		if(endHour<hour) {
			
			home_Hour = hour-endHour;
			home_Minute = minute-endMinute;
			System.out.println("집가려면 "+home_Hour+"시간 남았습니다.");
			
		}else { //endHour>hour 이거나 같은경우
 
			home_Hour = endHour-hour;
			System.out.println("집가려면 "+home_Hour+"시간 남았습니다.");
			
		}
		
		if(endMinute<minute) {
			home_Minute = endMinute-minute;
			System.out.println("집가려면 "+home_Minute+"분 남았습니다.");
		}else if (endMinute>minute) {
			home_Minute = minute - endMinute;
			System.out.println("집가려면 "+home_Minute+"분 남았습니다.");
		}
		
		
		System.out.println(home_Hour+"시간 "+home_Minute+"분 후에 집에 갈 수 있습니다. 힘내세요!!!!!");


		
	}
} 