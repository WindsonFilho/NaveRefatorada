package br.com.mariojp.game;

public interface Subject {

	 void addObserver(Observer observer);
	 void removeObserver(Observer observer);
	 void notifyObservers(String message);
	 void notifyObservers(String message, int x);
}
