package pro1;

import java.util.Scanner;

//- ����ð��� �Է��ϸ� ���� �������� ���� �����ð��� ���½ð��� �������

public class time {

	private Scanner sc = new Scanner(System.in);
	
	private int[] sumtime = new int[3];
	private int endtime[] = {15, 20, 0};
	private String str[] = {"��","��","��"};
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
		
		System.out.print("���� �ð� : ");
		for(int j=0; j<3; j++) {
			System.out.print(save[j]+str[j]+" ");
		}

		System.out.print("\n������ �ð� : ");
		for(int j=0; j<3; j++) {
			System.out.print(endtime[j]+str[j]+" ");
		}
		
		if(time<=15 && min<=20) {
			sumtime[0] = endtime[0] - time;
			sumtime[1] = endtime[1] - min;
			sumtime[2] = endtime[2] - sec;
		}
		
		
		System.out.print("\n������ ������ ���� ���� �ð� : ");
		for(int j=0; j<3; j++) {
			System.out.print(sumtime[j]+str[j]+" ");
		}
		
		
	}

	public static void main(String[] args) {	
		new time();
	}

	public void h_set() {
		while(true) {
			System.out.print("�ð��� �Է��� �ּ���>> ");
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
					} else break;

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
