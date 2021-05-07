package designpatterns.observer;


public class Enemy implements Observer {
	private String nickname;	
	private String playerMovedMessage;
	private String goodByeMessage;
	
	public Enemy(String nickname, String playerMovedMessage, String goodByeMessage) {
		this.nickname = nickname;
		this.playerMovedMessage = playerMovedMessage;
		this.goodByeMessage = goodByeMessage;
	}
	
	@Override
	public void update(String playerNickname, int playerX, int playerY) {
		System.out.printf("Enemy %s says: %s. %s has moved to [x, y] = [%d, %d].\n", nickname, playerMovedMessage, playerNickname, playerX, playerY);
	}

	public String sayGoodbye() {
		return goodByeMessage;
	}
	
	public String getNickname() {
		return nickname;
	}
}
