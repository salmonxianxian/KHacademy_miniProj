package pro1;

import java.util.Random;
import java.util.Scanner;

public class foodChoice {
	public foodChoice() {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int round=1;
		//32�� ���� ����. �ؿ� ���� �Լ��� ȣ��
		String str[] = {"Į����", "��ġ��", "����", "LA����", "����", "���ø�", "����ø�", "���κ�", "������", "�ᱹ��",
			    	    "������ũ", "���", "������", "���İ�Ƽ", "���θ�", "�ʹ�", "ȸ", "�ֵ���", "������ġ", "�ܹ���",
				        "������","����","������","�����","����","����","������","��ǳ��","¥���","«��","�쵿","������"};
		
		int rank_round = 16;
		String[] str1 = new String[rank_round];
		String[] str2 = new String[rank_round/2];
		char ch = '\0';
		String sch = null;
		
		int[] arr = new int[rank_round];
		
		System.out.println("----���� ������----\n");
		
		while(true) {
			int n=0;
			//���� �Ȱ�ġ�� �Ѹ��� 
			for(int i=0; i<rank_round; i++) {
				arr[i] = ran.nextInt(rank_round);
				for(int j=0; j<i; j++) {
					if(arr[i]==arr[j]) {
						i--;
					}
				}
			}
			for(int i=0; i<rank_round; i++) {
				if(rank_round==16) {
					//ó�� 16�������� 
					str1[i] = str[arr[i]];
				} else {
					//8��~��±���
					str1[i] = str2[arr[i]];
				}
			}
			
			//ȭ�鿡 �� ���� ���
			if(rank_round==16)	System.out.println("-------["+rank_round+"��]-------");
			else if(rank_round==8)	System.out.println("-------["+rank_round+"��]-------");
			else if(rank_round==4)	System.out.println("-------[�ذ��]-------");
			else if(rank_round==2)	System.out.println("-------[���]-------");
			
			round=1;
			for(int i=0; i<rank_round; i++) {
				if(rank_round==2)	System.out.println("[FINAL]");
				else	System.out.println("[Round"+round+"]");
				
				System.out.println("1."+str1[i] + " VS "+ "2."+ str1[i+1]);
				//int���� �Ἥ �Է� �������� ������ int�� ���� �����̿��� ���� �Է½�
				//������ ���鼭 ���ᰡ�ȴ�. �׷��� string�� ���ؼ� ó�� �Է°��� �ް�
				//string�� ���̰� 1�϶��� char�� �־� 
				//�ƽ�Ű�ڵ�� �Է°��� 1~2�� �ɶ����� �Է¹޴´�
				while(ch<49 || ch>50) {
					System.out.print("���ļ��� (1 or 2): ");
					sch = sc.nextLine();	//char���ٴ� string�� ���°� �� ���� ������ �޾��ټ� �־ ���
					if(sch.length()==1) {	//1,2�� �Է� ���� �Ŵ� string ���̰� 1���� ũ�� �ٽ� �Է�
						ch = sch.charAt(0); //string���̰� 1�Ͻ� char�� ������ �� ���� 49(1), 50(2)�� �ƴϸ� �ٽ� �Է�
						if(ch<49 || ch>50) System.out.println("\t>>�ٽ��Է�!!");
					}
					else System.out.println("\t>>�ٽ��Է�!!");
				}
				if(ch==49) {//�Է°��� 1�� ���
					str2[n]= str1[i];
					System.out.println("\t>>["+str1[i]+"]�� ����!!\n");
				} else if(ch==50) {//�Է°��� 2�� ���
					str2[n]= str1[i+1];
					System.out.println("\t>>["+str1[i+1]+"]�� ����!!\n");
				}
				i++;
				n++;
				ch=0; //�ʱ�ȭ
				round++;
			}
			
			rank_round /= 2;
			if(rank_round<2) {
				System.out.println("\n\t>>��� : "+str2[0]+"\n");
				break;
			}
		}
	}	
}