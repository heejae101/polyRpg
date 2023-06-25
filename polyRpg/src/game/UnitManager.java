package game;

import java.util.ArrayList;

public class UnitManager {
	private ArrayList<Player> playerList = new ArrayList<>();
	private ArrayList<Unit> monsterList = new ArrayList<>();
	
	UnitManager() {
		this.playerList.add(new Player("개척자", 1000, 20));
		this.playerList.add(new Player("은랑", 650, 50));
		this.playerList.add(new Player("제레", 700, 70));
		this.playerList.add(new Player("나찰", 800, 10));
	}
	
	
}
