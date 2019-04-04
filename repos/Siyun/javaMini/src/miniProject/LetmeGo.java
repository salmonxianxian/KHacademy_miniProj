package miniProject; //�׽�Ʈ Test�ּ� Comment

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LetmeGo {
	private static final StringBuffer HOUR = null;

	public void Letmego() throws ParseException {

		// (1) Calendar��ü�� ��´�.

		Calendar cal = Calendar.getInstance();

		// (2) ��� ���¸� �����ϱ� ���� Formatter�� ��´�.

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy:MM:dd-HH:mm:ss");

		// (3) ������¿� �´� ���ڿ��� ��´�.

		String datetime1 = sdf1.format(cal.getTime());

		System.out.println(datetime1);

		System.out.println("================================");
		System.out.println("           ���� ����;�~~~~~~        ");
		System.out.println("================================");

		// ------------------------------------------------------
		// (4) ���������� ����� �ú����� ���� ���� ���� �ִ�.

		int year = cal.get(Calendar.YEAR);

		int month = cal.get(Calendar.MONTH);

		int day = cal.get(Calendar.DAY_OF_MONTH);

		int hour = cal.get(Calendar.HOUR_OF_DAY); // ���� �ð��� 24�ð� ������ �޾ƿ�

		int hour2 = cal.get(Calendar.HOUR); // ���� �ð��� 12�ð� ������ �ҷ���

//		System.out.println(hour);

		int minute = cal.get(Calendar.MINUTE);

		int second = cal.get(Calendar.SECOND);

		int millisecond = cal.get(Calendar.MILLISECOND);

		// ------------------------------------------------------
		
		int endHour = 13;
		int endMinute = 20;

		System.out.println("SYSTEM TIME :  " + datetime1 + '\n');
		System.out.println("����ð� [" + hour + "]�� [" + minute + "]�� [" + second + "]�� �Դϴ�.");
		System.out.println("����ð� ["+endHour+"]�� ["+endMinute+"]�� �Դϴ�.");

		int home_Hour = endHour - hour;
		int home_Minute = endMinute - minute;

		if (home_Minute < 0) {

			home_Minute += 60;

			home_Hour--;

		}

		if (home_Hour < 0) { // �����ð� ���� �� ��ȸ�� ��
			home_Hour *= (-1);
			System.out.println("���� �ð��� �̹� �������ϴ�... ���� �Ȱ��� ���ϼ���?");
		} else {

			System.out.println("�������� " + home_Hour + "�ð� ���ҽ��ϴ�.");
			System.out.println("�������� " + home_Minute + "�� ���ҽ��ϴ�.");

			System.out.println(home_Hour + "�ð� " + home_Minute + "�� �Ŀ� ���� �� �� �ֽ��ϴ�. ��������!!!!!");

		}

	}
}