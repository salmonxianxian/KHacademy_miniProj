package proj03;

import java.util.Random;

import java.util.Scanner;
import proj02.landingEffect;
import proj03.baseball;

public class intro {
	
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	
	landingEffect  ld = new landingEffect();
	baseball b = new baseball();
	
	
	public void manual() {
		
		// 메뉴얼 문구 배열에 저장 
		String[] manual = new String[5];
		manual[0] = "베이스볼은 상대방의 숫자를 맞추는 게임이야.";
		manual[1] = "그리고 상대방의 수와 내가 예측한 수가 얼마나 비슷한지룰 야구 규칙으로 추리해나가는 게임이야.";
		manual[2] = "예를 들면, 상대방의 숫자가 \'237\'인데, 내가 \'283\'을 외쳤다며느 1S(Strike), 1B(Ball)이라고 해.";
		manual[3] = "왜냐하면, 앞 자리 수가 정확히 맞았기 때문에 1S\n두번째 수 3을 자릿수는 틀렸지만, 예측했기 때문에 1B이지.";
		manual[4] = "어때? 이제 좀 알겠어? 그럼 시작할까?";
		
		// 배열에 저장된 문장 배열, delay 적용해서 출력 
		for(int i=0; i<manual.length; i++) {
			System.out.println(manual[i]);
			ld.delay(15000);
		}
		
		// 게임 실행 클래스로 이동 
		b.gametype();
	}
	
	
	public void tutorials() {
    	// 게임 룰을 알려줄지 말지에 대한 질문 
    	System.out.println("안녕 지금부터 베이스볼 게임을 할 거야.\n혹시 규칙을 아니? (Y/N) ");
    	char tutorials = ' ';   // Y면 룰을 알려주고, N이면 바로 게임 진
    	do {
    		System.out.print("아니, Y랑 N 둘 중 하나 입력하라고.... 아.. ");
    		tutorials = sc.next().charAt(0);
    	} while(!(tutorials=='Y'||tutorials=='N'));
    	
    	// 사용자 입력 값에 따른 진행 
    	if(tutorials=='Y') {
    		manual();    // 게임 룰 소개 
    	} else if(tutorials=='N') {
    		b.gametype();   // 게임 튜토리얼 필요없으면 바로 게임 실행 
    	}

    }
}
