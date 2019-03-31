package proj02;

public class Run {
	
	// Run()에서 어느 부분이 error 발생하는지 체크하기 위한 메서드 
	public void checkError(String method) {
		System.out.println("no error untill "+method);
	}
	
	
//                           ___";
//                          |===|";
//                     =============";
//                       \\/ 0 0 \\/";
//           ________ooo__\\__ㅁ__/_______________";
//          /                                    \\";
//          |                                     |";
//          |           코드 리뷰 해주세요.           |";
//          |                                     |";
//          |                                     |";
//          \\_______________________ooo__________/";
//                         |  |  |";
//                         |_ | _|";
//                         |  |  |";
//                         |__|__|";
//                         /-'Y'-\\";
//                        (__/ \\__)\n";
	
	
	public static void main(String[] args) {
		// 객체 집합 
		landing ld = new landing();
		gamestartEffect gs = new gamestartEffect();
		game game = new game();
		
		// 프로그램 랜딩 페이지 출력 
		ld.intro();
		
		// 음식리스트 입력받고, 출력할 클래스 호출
		game.game();
		
	}
}
