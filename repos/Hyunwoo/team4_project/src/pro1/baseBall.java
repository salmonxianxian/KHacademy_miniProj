package pro1;

import java.util.Random;
import java.util.Scanner;

public class baseBall {
	public baseBall() {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		String input_str = null;
		char input_ch='\0';
		
		
		System.out.println("\n\t>> [���� �߱� ���� START!!]");
		
		while(input_ch<51 || input_ch > 57) {
			//int���� �Ἥ �Է� �������� ������ int�� ���� �����̿��� ���� �Է½�
			//������ ���鼭 ���ᰡ�Ǽ� string�� ���ؼ� ó�� �Է°��� �ް�
			//string�� ���̰� 1�϶��� char�� �־� 
			//�ƽ�Ű�ڵ�� �Է°��� 3~9�� �ɶ����� �Է¹޴´�
			System.out.println("\n[3~9 ���� ����] ");
			System.out.print("��� ���� ġ�ðڽ��ϱ�?");
			input_str = sc.nextLine();
			if( input_str.length() ==1) {
				input_ch = input_str.charAt(0);
				if(input_ch<51 || input_ch > 57) 
					System.out.println("\n\t>>�ٽ��Է�!!");	
			} else System.out.println("\n\t>>�ٽ��Է�!!");
		}
		
		// max : �Է¹����� �ִ� ������ Ƚ��, max��ŭ �������� ����
		// ������ �Է¹��� ���� ��ŭ max�� �����ֱ�
		int max = 0;
		for(int i=49; i<=(int)input_ch; i++)	
			max++;
			
		int[] com_num = new int[max];	//��ǻ�Ͱ� ������ ������ ����
		int[] user_num = new int[max];	//����ڰ� �Է��� ���� ����
		int[] strike_num = new int[max];//����ڰ� �Է��� ���� strike�� ��� �����ؼ� �����߿� �����ֱ� ���� ���

		int strike =0;
		int ball = 0;
		int out = 0;
		int round=1;
		
		//���� ���� ������ com_num�迭�� ����
		for(int i=0; i<max; i++) {
			com_num[i] = ran.nextInt(9)+1;
			for(int j=0; j<i; j++) {
				if(com_num[i]==com_num[j]) {
					i--;
				}
			}
		}
		
		System.out.println("\n\n------------- ���� ��Ģ -------------");
		System.out.println("��Ʈ����ũ(STRIKE): ���ڿ� ��ġ�� ��� ����");
		System.out.println("��(BALL): ���ڴ� ������ ��ġ�� Ʋ��");
		System.out.println("�ƿ�(OUT): ���ڿ� ��ġ�� ��� Ʋ��");
		System.out.println("Ȩ��(HOMERUN): �������� ���ڸ� ��Ȯ�� ����");
		System.out.println("--------------------------------");
		
		while(true) {
			System.out.println("\n\n[ROUND"+round+"]");
			System.out.println("1~9������ ���ڸ� "+max+"�� �Է��� �ּ���");
			for(int i=0; i<max; i++) {
				input_ch='\0';
				while(input_ch<49 || input_ch>57) {
					//int���� �Ἥ �Է� �������� ������ int�� ���� �����̿��� ���� �Է½�
					//������ ���鼭 ���ᰡ�Ǽ� string�� ���ؼ� ó�� �Է°��� �ް�
					//string�� ���̰� 1�϶��� char�� �־� 
					//�ƽ�Ű�ڵ�� �Է°��� 1~max�� �ɶ����� �Է¹޴´�
					System.out.print((i+1)+"��° �� �Է� >> ");
					input_str=sc.nextLine();
					if(input_str.length()==1) {
						input_ch = input_str.charAt(0);
						if(input_ch<49 || input_ch>57)	System.out.println("\n\t>>�ٽ� �Է�!!\n");
					} else System.out.println("\n\t>>�ٽ� �Է�!!\n");
				}
				//������ �Է¹��� ���� String�̹Ƿ� ���������� �ٲ㼭 user_num�� �Է��Ѵ�
				user_num[i] = Integer.parseInt(input_str);
			}
			//strikeüũ
			for(int i=0; i<max; i++) {
				for(int j=0; j<max; j++) {
					if(com_num[i] == user_num[j]) {
						//strike�� ���
						if(i==j) {
							strike++;
							//����ڰ� �Է��� ���� strike�� ��� 
							//strike_num �迭������
							strike_num[i] = user_num[j]; 
							if( strike == max) {
								System.out.println("\n\t>>"+round+"���� Ȩ��~~\n");
								return;
							}
						}
						//ball�� ���
						else ball++;
					}
				}
			}
			//out �� ���ϴ� �κ�
			out = max-ball-strike;
			
			//����ڰ� �Է��� ���� �Ǵ��Ͽ� ���
			System.out.println("\n[Round"+round+"���]");
			System.out.println("[STRIKE : " + strike+"\tBALL   : " + ball+"\tOUT    : " + out+"]");
			
			//����ڰ� �Է��� ���� Strike�� �ִٸ� 
			//������ strike_num �迭�� ������ ���� ȣ���ؼ�
			//Strike�� ���� �����ش�
			System.out.println("\n\n[���ݱ��� ���� ���ڿ� �ڸ�]");
			System.out.print("[");
			for(int i=0; i<max; i++) {
				System.out.print((i+1)+". "+strike_num[i]);
				if(i<max-1) System.out.print("\t");
			}
			System.out.println("]");
			
			round++;
			strike = 0;
			ball = 0;
			out = 0;
		}
	}
}