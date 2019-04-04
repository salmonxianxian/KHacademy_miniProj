package pro1;

import java.util.Date;
import java.util.Scanner;

// 현재시간을 입력하면 집에 갈때까지 남은 수업시간을 계산해줍니다
// 시간,분,초 입력 받을때 String으로 받은 이유는 int형으로 입력 받을시
// 숫자 이외의 값을 입력하면 프로그램이 오류가 발생하면서 종료 됩니다
// 그래서 String으로 받고 char에 저장해서 아스키코드로 숫자를 판별한 후
// 다시 String으로 저장 하는 식으로 만들었습니다

// 시간 계산 만들기는 했는데 오류가 발생할수도 있습니다
// 오류 발생하면 알려주세요

public class time {

	private Scanner sc = new Scanner(System.in);
	
	private int[] sumtime = new int[3];
	private int endtime[] = {15, 20, 0};
	private String str[] = {"시","분","초"};
	private char input1 = '\0';
	private char input2 = '\0';
	
	private String[] save = new String[3];

	private String scan = null;
	
	private int hour=0;
	private int min=0;
	private int sec=0;
	private char input_ch = '\0';
	private String choice = null;
	public static void main(String[] args) {	
		new time();
	}
	
	public time( ) {
		System.out.println("수업까지 남은시간 계산하기");
		System.out.println("1. 현재시간 [자동]입력");
		System.out.println("2. 현재시간 [직접]입력");
		System.out.print("\n\t선택해주세요!! >>");
		while(input_ch<49 || input_ch > 50) {
			choice = sc.nextLine();
			if( choice.length() ==1) {
				input_ch = choice.charAt(0);
				if(input_ch<49 || input_ch > 50) 
					System.out.println("\n\t>>다시입력!!");	
			} else System.out.println("\n\t>>다시입력!!");
		}
		switch(Integer.parseInt(choice)) {
		case 1:	
			Date dt = new Date();

			hour=(dt.getHours());
			min=(dt.getMinutes());
			sec=(dt.getSeconds());
			
			time_calculate();
			break;
		case 2:
			System.out.println();
			h_set();
			if(Integer.parseInt(save[0])==24) {
				System.out.println();
			} else {
				m_s_set();
			}
			hour=Integer.parseInt(save[0]);
			min=Integer.parseInt(save[1]);
			sec=Integer.parseInt(save[2]);
			time_calculate();

			break;
		}
	}
	
	//-------------시간,분,초 계산---------------
	public void time_calculate() {
		
		for(int i=0; i<=1; i++) {
			if(min==60) {
				min=0;
				hour++;
			}
			if(sec==60) {
				sec=0;
				min++;
			}
		}
		
		System.out.print("\n현제 시간 : ");
		System.out.print(hour+str[0]+" ");
		System.out.print(min+str[1]+" ");
		System.out.print(sec+str[2]);
		
		System.out.print("\n끝나는 시간 : ");
		for(int j=0; j<3; j++) {
			System.out.print(endtime[j]+str[j]+" ");
		}
		//------- 시간-분-초 계산 ----------
		if(hour==15 && min>=20) {
			sumtime[0] = endtime[0] - hour;
			sumtime[1] = min - endtime[1];
			sumtime[2] = sec;
		} else if(hour<=15) {
			if(min<=20) {
				sumtime[0] = endtime[0] - hour;
				sumtime[1] = endtime[1] - min;
				if(sec==0)
					sumtime[2] = sec;
				else {
					sumtime[2] = 60 - sec;
					if(sumtime[1]==0) {
						sumtime[1]=60;
						sumtime[0]--;
					}
					sumtime[1]--;
				}
			} else {
				sumtime[0] = endtime[0] - hour;
				if(hour==15) {
					sumtime[1] = min - endtime[1] ;
				} else {
					sumtime[1] = 60 - min + endtime[1];
					sumtime[0]--;
				}	
				if(sec==0)
					sumtime[2] = endtime[2] - sec;
				else {
					sumtime[2] = 60 - sec;
					sumtime[1]--;
				}
			}
			
		} else {
			if(min<=20) {
				sumtime[0] = hour - endtime[0];
				if(min==20) 
					sumtime[1] = endtime[1] - min;
				else {
					sumtime[1] = 60 - endtime[1] + min;
					sumtime[0]--;
				}
			} else {
				sumtime[0] = hour - endtime[0];
				sumtime[1] = min - endtime[1];
			}
			sumtime[2] = sec;
		}
		//---------위에서 계산한 결과 출력------------
		if(hour==15 && min==20 && sec==0) {
			System.out.println("\n\n수업 끝!! 집에 가자~~");
		} else if(hour==15) {
			if(min>=20) {
				System.out.print("\n\n수업 끝나고 지나간 시간 : ");

			} else if(min<20) {
				System.out.print("\n\n앞으로 남은 시간 : ");
			}
			for(int j=0; j<3; j++) {
				System.out.print(sumtime[j]+str[j]+" ");
			}
		} else if(hour>=16) {
			System.out.print("\n\n수업 끝난고 지나간 시간 : ");
			for(int j=0; j<3; j++) {
				System.out.print(sumtime[j]+str[j]+" ");
			}
		} else if(hour<15) {
			System.out.print("\n\n앞으로 남은 시간 : ");
			for(int j=0; j<3; j++) {
				System.out.print(sumtime[j]+str[j]+" ");
			}
		}
		System.out.println("\n");
	}
	
	//-------------------시간입력-------------------------
	public void h_set() {
		while(true) {
			System.out.print("시간을 입력해 주세요!!>> ");
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
					} else {
						if(input2==52) {
							save[1]="0";
							save[2]="0";
						}
						break;
					}

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
	
	//------------------분,초 입력-----------------------
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