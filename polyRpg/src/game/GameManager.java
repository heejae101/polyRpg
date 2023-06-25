package game;

import java.util.Random;
import java.util.Scanner;

public class GameManager {
	private String name = "";
	private Random ran = new Random();
	private static Scanner scan = new Scanner(System.in);
	private static String nextStage = "";
	private String curStage = "";
	
	GameManager(String name){
		this.name = name;
	}
	
	public boolean changeStage() {
		
	}
	
}
