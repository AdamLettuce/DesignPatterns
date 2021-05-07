package designpatterns.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Game {
	private static final int NUMBER_OF_MOVES = 1;
	private static final int MAX_X = 100;
	private static final int MAX_Y = 100;

	private Player player;		
	private Enemy euzebiusz;
	private Enemy roman;
	private Enemy zofia;
	private Enemy marcelina;		
	private Enemy zbychu;
	private Enemy franek;
	private List<Enemy> enemies;
	
	public void play() {
		initGame();
		startWatching(player, enemies);		
		play(player, NUMBER_OF_MOVES);
		stopWatching(player, zbychu);
		stopWatching(player, marcelina);		
		play(player, NUMBER_OF_MOVES);
	}
	
	private void initGame() {
		player = new Player("Eustachy", 0, 0);		
		euzebiusz = new Enemy("Euzebiusz", "Die! Die! Die! I know where you are.", "Sayonara");
		roman = new Enemy("Roman", "Come to your daddy!", "Hasta la vista, baby!");
		zofia = new Enemy("Zofia", "This spoon isn't hard enough to kill you.","It's hard to stop watching you :(");
		marcelina = new Enemy("Marcelina", "Come here my little sweety.", "E.T. go home.");		
		zbychu = new Enemy("Zbychu", "Sooner or later I'll get you.", "Nice watching you was.");
		franek = new Enemy("Franek", "Arghhhhhhhhh!", "No, I don't want to go home :(");
		enemies = new ArrayList<Enemy>(Arrays.asList(euzebiusz, roman, zofia, marcelina, zbychu, franek));
	}
	
	private void startWatching(Player player, List<Enemy> enemies) {
		for (Enemy enemy : enemies) {
			player.registerObserver(enemy);
		}
	}
	
	private static void stopWatching(Player player, Enemy enemy) {
		System.out.println(enemy.getNickname() + " is leaving game, saying: " + enemy.sayGoodbye());
		player.unregisterObserver(enemy);
	}

	private static void play(Player player, int numberOfMoves) {
		for (int move = 0, seed = 0; move < numberOfMoves; ++move, ++seed) {
			Random random = new Random(seed);
			int randomX = random.nextInt(MAX_X);
			int randomY = random.nextInt(MAX_Y);
			player.goTo(randomX, randomY);
		}
	}
}
