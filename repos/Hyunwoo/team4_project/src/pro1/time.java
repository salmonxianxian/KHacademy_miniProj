package pro1;

import java.util.Scanner;

//- 현재시간을 입력하면 집에 갈때까지 남은 수업시간과 쉬는시간을 계산해줌

public class time {

	private Scanner sc = new Scanner(System.in);
	
	private int[] sumtime = new int[3];
	private int endtime[] = {15, 20, 0};
	private String str[] = {"시","분","초"};
	private char input1 = '\0';
	private char input2 = '\0';
	
	private String[] save = new String[3];

	private String scan = null;

	public time( ) {
		h_set();
		m_s_set();
		
		int time=0;
		int min=0;
		int sec=0;
		
		time=Integer.parseInt(save[0]);
		min=Integer.parseInt(save[1]);
		sec=Integer.parseInt(save[2]);
		
		System.out.print("현제 시간 : ");
		for(int j=0; j<3; j++) {
			System.out.print(save[j]+str[j]+" ");
		}

		System.out.print("\n끝나는 시간 : ");
		for(int j=0; j<3; j++) {
			System.out.print(endtime[j]+str[j]+" ");
		}
		
		if(time<=15 && min<=20) {
			sumtime[0] = endtime[0] - time;
			sumtime[1] = endtime[1] - min;
			sumtime[2] = endtime[2] - sec;
		}
		
		
		System.out.print("\n수업이 끝나기 까지 남은 시간 : ");
		for(int j=0; j<3; j++) {
			System.out.print(sumtime[j]+str[j]+" ");
		}
		
		
	}

	public static void main(String[] args) {	
		new time();
	}

	public void h_set() {
		while(true) {
			System.out.print("시간을 입력해 주세요>> ");
			scan = sc.nextLine();

			if(scan.length()==1) {
				input1 = scan.charAt(0);
				if(input1<48 || input1>57) {
					System.out.println("\n\t다시 입력해 주세요 !!");
				} else break;

			} else if(scan.length()==2) {
				input1 = scan.charAt(0);
				if(input1<48 || input1>50){
					System.out.println("\n\t다시 입력해주세요!!");
					continue;

				} else if(input1==50) {
					input2 = scan.charAt(1);
					if(input2<48 || input2>52) { 
						System.out.println("\n\t다시 입력해주세요!!");
					} else break;

				} else if(input1>=48 || input1<=49) {
					input2 = scan.charAt(1);
					if(input2<48 || input2>57) {
						System.out.println("\n\t다시 입력해주세요!!");
					} else break;	
				} 


			}else {
				System.out.println("\n\t다시 입력해주세요!!");
			}
		} //while end
		save[0] = scan;
	}

	public void m_s_set() {
		int i=1;
		while(i!=3) {
			System.out.print(str[i]+"을 입력해 주세요!! >> ");
			scan = sc.nextLine();

			if(scan.length()==1) { //1자리 수 입력
				input1 = scan.charAt(0);
				if(input1<48 || input1>57) { //0~9
					System.out.println("\n\t다시 입력해 주세요 !!");
					continue;
				}

			} else if(scan.length()==2) { //2자리 수 입력
				input1 = scan.charAt(0);
				if(input1<48 || input1>57){ //0~9까지 입력
					System.out.println("\n\t다시 입력해주세요!!");
					continue;

				} else if(input1==54) {
					input2 = scan.charAt(1);
					if(input2!=48) { 
						System.out.println("\n\t다시 입력해주세요!!");
						continue;
					}

				} else if(input1>=48 || input1<=53) {
					input2 = scan.charAt(1);
					if(input2<48 || input2>57) {
						System.out.println("\n\t다시 입력해주세요!!");
						continue;
					}	
				} 


			}else {
				System.out.println("\n\t다시 입력해주세요!!");
				continue;
			}
			save[i] = scan;
			i++;
		} //while end	
	}
}
