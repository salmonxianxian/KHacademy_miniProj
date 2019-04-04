package miniProject; //테스트 Test주석 Comment

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LetmeGo {
	private static final StringBuffer HOUR = null;

	public void Letmego() throws ParseException {

		// (1) Calendar객체를 얻는다.

		Calendar cal = Calendar.getInstance();

		// (2) 출력 형태를 지정하기 위해 Formatter를 얻는다.

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy:MM:dd-HH:mm:ss");

		// (3) 출력형태에 맞는 문자열을 얻는다.

		String datetime1 = sdf1.format(cal.getTime());

		System.out.println(datetime1);

		System.out.println("================================");
		System.out.println("           집에 가고싶어~~~~~~        ");
		System.out.println("================================");

		// ------------------------------------------------------
		// (4) 개별적으로 년월일 시분초의 값을 얻을 수도 있다.

		int year = cal.get(Calendar.YEAR);

		int month = cal.get(Calendar.MONTH);

		int day = cal.get(Calendar.DAY_OF_MONTH);

		int hour = cal.get(Calendar.HOUR_OF_DAY); // 현재 시간을 24시간 단위로 받아옴

		int hour2 = cal.get(Calendar.HOUR); // 현재 시간을 12시간 단위로 불러옴

//		System.out.println(hour);

		int minute = cal.get(Calendar.MINUTE);

		int second = cal.get(Calendar.SECOND);

		int millisecond = cal.get(Calendar.MILLISECOND);

		// ------------------------------------------------------
		
		int endHour = 13;
		int endMinute = 20;

		System.out.println("SYSTEM TIME :  " + datetime1 + '\n');
		System.out.println("현재시간 [" + hour + "]시 [" + minute + "]분 [" + second + "]초 입니다.");
		System.out.println("종료시간 ["+endHour+"]시 ["+endMinute+"]분 입니다.");

		int home_Hour = endHour - hour;
		int home_Minute = endMinute - minute;

		if (home_Minute < 0) {

			home_Minute += 60;

			home_Hour--;

		}

		if (home_Hour < 0) { // 집갈시간 지난 후 조회할 때
			home_Hour *= (-1);
			System.out.println("집갈 시간이 이미 지났습니다... 집에 안가고 뭐하세요?");
		} else {

			System.out.println("집가려면 " + home_Hour + "시간 남았습니다.");
			System.out.println("집가려면 " + home_Minute + "분 남았습니다.");

			System.out.println(home_Hour + "시간 " + home_Minute + "분 후에 집에 갈 수 있습니다. 힘내세요!!!!!");

		}

	}
}