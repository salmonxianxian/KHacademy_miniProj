package pro1;

import java.util.Date;
import java.util.Scanner;

// ����ð��� �Է��ϸ� ���� �������� ���� �����ð��� ������ݴϴ�
// �ð�,��,�� �Է� ������ String���� ���� ������ int������ �Է� ������
// ���� �̿��� ���� �Է��ϸ� ���α׷��� ������ �߻��ϸ鼭 ���� �˴ϴ�
// �׷��� String���� �ް� char�� �����ؼ� �ƽ�Ű�ڵ�� ���ڸ� �Ǻ��� ��
// �ٽ� String���� ���� �ϴ� ������ ��������ϴ�

// �ð� ��� ������ �ߴµ� ������ �߻��Ҽ��� �ֽ��ϴ�
// ���� �߻��ϸ� �˷��ּ���

public class time {

	private Scanner sc = new Scanner(System.in);
	
	private int[] sumtime = new int[3];
	private int endtime[] = {15, 20, 0};
	private String str[] = {"��","��","��"};
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
		System.out.println("�������� �����ð� ����ϱ�");
		System.out.println("1. ����ð� [�ڵ�]�Է�");
		System.out.println("2. ����ð� [����]�Է�");
		System.out.print("\n\t�������ּ���!! >>");
		while(input_ch<49 || input_ch > 50) {
			choice = sc.nextLine();
			if( choice.length() ==1) {
				input_ch = choice.charAt(0);
				if(input_ch<49 || input_ch > 50) 
					System.out.println("\n\t>>�ٽ��Է�!!");	
			} else System.out.println("\n\t>>�ٽ��Է�!!");
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
	
	//-------------�ð�,��,�� ���---------------
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
		
		System.out.print("\n���� �ð� : ");
		System.out.print(hour+str[0]+" ");
		System.out.print(min+str[1]+" ");
		System.out.print(sec+str[2]);
		
		System.out.print("\n������ �ð� : ");
		for(int j=0; j<3; j++) {
			System.out.print(endtime[j]+str[j]+" ");
		}
		//------- �ð�-��-�� ��� ----------
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
		//---------������ ����� ��� ���------------
		if(hour==15 && min==20 && sec==0) {
			System.out.println("\n\n���� ��!! ���� ����~~");
		} else if(hour==15) {
			if(min>=20) {
				System.out.print("\n\n���� ������ ������ �ð� : ");

			} else if(min<20) {
				System.out.print("\n\n������ ���� �ð� : ");
			}
			for(int j=0; j<3; j++) {
				System.out.print(sumtime[j]+str[j]+" ");
			}
		} else if(hour>=16) {
			System.out.print("\n\n���� ������ ������ �ð� : ");
			for(int j=0; j<3; j++) {
				System.out.print(sumtime[j]+str[j]+" ");
			}
		} else if(hour<15) {
			System.out.print("\n\n������ ���� �ð� : ");
			for(int j=0; j<3; j++) {
				System.out.print(sumtime[j]+str[j]+" ");
			}
		}
		System.out.println("\n");
	}
	
	//-------------------�ð��Է�-------------------------
	public void h_set() {
		while(true) {
			System.out.print("�ð��� �Է��� �ּ���!!>> ");
			scan = sc.nextLine();

			if(scan.length()==1) {
				input1 = scan.charAt(0);
				if(input1<48 || input1>57) {
					System.out.println("\n\t�ٽ� �Է��� �ּ��� !!");
				} else break;

			} else if(scan.length()==2) {
				input1 = scan.charAt(0);
				if(input1<48 || input1>50){
					System.out.println("\n\t�ٽ� �Է����ּ���!!");
					continue;

				} else if(input1==50) {
					input2 = scan.charAt(1);
					if(input2<48 || input2>52) { 
						System.out.println("\n\t�ٽ� �Է����ּ���!!");
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
						System.out.println("\n\t�ٽ� �Է����ּ���!!");
					} else break;	
				} 

			}else {
				System.out.println("\n\t�ٽ� �Է����ּ���!!");
			}
		} //while end
		save[0] = scan;
	}
	
	//------------------��,�� �Է�-----------------------
	public void m_s_set() {
		int i=1;
		while(i!=3) {
			System.out.print(str[i]+"�� �Է��� �ּ���!! >> ");
			scan = sc.nextLine();

			if(scan.length()==1) { //1�ڸ� �� �Է�
				input1 = scan.charAt(0);
				if(input1<48 || input1>57) { //0~9
					System.out.println("\n\t�ٽ� �Է��� �ּ��� !!");
					continue;
				}

			} else if(scan.length()==2) { //2�ڸ� �� �Է�
				input1 = scan.charAt(0);
				if(input1<48 || input1>57){ //0~9���� �Է�
					System.out.println("\n\t�ٽ� �Է����ּ���!!");
					continue;

				} else if(input1==54) {
					input2 = scan.charAt(1);
					if(input2!=48) { 
						System.out.println("\n\t�ٽ� �Է����ּ���!!");
						continue;
					}

				} else if(input1>=48 || input1<=53) {
					input2 = scan.charAt(1);
					if(input2<48 || input2>57) {
						System.out.println("\n\t�ٽ� �Է����ּ���!!");
						continue;
					}	
				} 

			}else {
				System.out.println("\n\t�ٽ� �Է����ּ���!!");
				continue;
			}
			save[i] = scan;
			i++;
		} //while end
	}
}