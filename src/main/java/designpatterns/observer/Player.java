package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;


public class Player implements Observable {
	private String nickname;
	private int x;
	private int y;
	private List<Observer> observers = new ArrayList<Observer>();

	public Player(String nickname, int x, int y) {
		this.nickname = nickname;
		this.x = x;
		this.y = y;
	}

	public void goTo(int newX, int newY) {
		this.x = newX;
		this.y = newY;
		notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		if (observers.contains(observer)) {
			observers.remove(observer);			
		}
	}

	@Override
	public void notifyObservers() {
		System.out.println("Player " + nickname + " has moved to position: [x, y] = [" + x + ", " + y + "].");
		for (Observer observer : observers) {
			observer.update(this.nickname, this.x, this.y);
		}
	}
	
}
