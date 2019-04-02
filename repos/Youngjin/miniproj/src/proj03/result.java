package proj03;

import proj02.landing;

public class result {
	
	landing ld = new landing();

	public void computer(String result) {
		String[] bye = new String[10];
			bye[0] ="     OO    OO    OO   OO             OOOOOOO         OO";
			bye[1] ="     OO    OO    OO   OO            OO     OO   OOOOOOO";
			bye[2] ="     OO    OO    OO   OO           OO       OO       OO";
			bye[3] ="     OO    OO    OO   OO           OO       OO       OO";
			bye[4] ="     OOOOOOOOOOOOOO   OOOOOO        OO     OO   OOOOOOO";
			bye[5] ="     OOOOOOOOOOOOOO   OOOOOO         OOOOOOO         OO";
			bye[6] ="     OO    OO    OO   OO";
			bye[7] ="     OO    OO    OO   OO               OOOOOOOOOOOOOOO";
			bye[8] ="     OOOOOOOOOOOOOO   OO               OO           OO";
			bye[9] ="     OOOOOOOOOOOOOO   OO               OOOOOOOOOOOOOOO";
			
		System.out.println("YOU LOSE~! LOL");
		for(int i=0; i<bye.length; i++) {
			System.out.println(bye[i]);
			ld.delay(90000);
		}
	}
	
	public void user(String result) {
		System.out.println("YOU WIN~! \n운좋네 ㅋ");
	}
}
