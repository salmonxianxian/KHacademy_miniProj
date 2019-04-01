package proj02;
//characterset to UTF-8 한글
public class gamestartEffect {
	landing ld = new landing();
	
	public void loading() {
		
		String[] load = new String[100];
		
		// 몇 퍼센트 진행중인지 보여주는 메세지
		for(int i=0; i<10; i++) {
			if(i==0) {
				load[i] = "\n진행중   "+(i+1)*10+"% ";
			} else if(i==9) {
				load[i] = "진행중  "+(i+1)*10+"% ";
			} else {
				load[i] = "진행중   "+(i+1)*10+"% ";
			}
			switch(i) {
			case 0: load[i] += "#"; break;
			case 1: load[i] += "##"; break;
			case 2: load[i] += "###"; break;
			case 3: load[i] += "####"; break;
			case 4: load[i] += "#####"; break;
			case 5: load[i] += "######"; break;
			case 6: load[i] += "#######"; break;
			case 7: load[i] += "########"; break;
			case 8: load[i] += "#########"; break;
			case 9: load[i] += "##########"; break;
			}
		}
		
		
		// 토너먼트 진행 예고
		String[] intro = new String[3];
		intro[0] = "";
		intro[1] = "토너먼트를 시작합니다.";
		intro[2] = "조편성중..";
		
		for(int i=0; i<intro.length; i++) {
			System.out.println(intro[i]);
			ld.delay(1000000);
		}
		
		
		// 진행률 출력 
		for(int i=0; i<10; i++) {
			System.out.println(load[i]);
			ld.delay(120000);
		}
	}
	
}
