package game;

// 1. Manager 클래스는 모두 -> 싱글톤으로 구현
// 2. 모든 클래스는 멤버에 접근제어자를 붙일 것 
// 3. 필드값은 private -> getter 또는 setter를 제공
// 4. UnitManager에 있는 제네릭 클래스를 활용한 -> 인스턴스 생성 부분 적용해보기
// 5. 상속에 대한 개념을 마스터 -> 목표
public class _MainGame {

	public static void main(String[] args) {
		GameManager gameManager = new GameManager();
		boolean run = true;
		while (true) {
			run = gameManager.changeStage();
			if (run == false) {
				break;
			}
		}
		System.out.println("게임오버");
	}
}