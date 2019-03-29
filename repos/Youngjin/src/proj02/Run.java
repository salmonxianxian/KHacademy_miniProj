package proj02;

public class Run {
	
	public static void main(String[] args) {
		foodList fd = new foodList();
		gamestartEffect gs = new gamestartEffect();
		
		// 프로그램 랜딩 페이지 출력 
		landingEffect ld = new landingEffect();
		ld.landing();
		
		// 음식리스트 입력받고, 출력할 클래스 호출
		fd.tournament();
		
		// -- 여기에서 에러 발생 중..
		
		// 게임 이펙트 
		gs.loading();
		
		
	}
}
