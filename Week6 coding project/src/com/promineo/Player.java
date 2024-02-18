package com.promineo;

import java.util.ArrayList;
import java.util.List;

public class Player {

	String name;
	int score;
	List<Card> hand = new ArrayList<Card>();
	
	public Player() {
}
	
	public Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = 0;
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public Card flipCard() {
		return hand.remove(0);
	}
	
	public void incrementScore() {
		score++;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	 
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public List<Card> getHand() {
		return hand;
	}
	
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
}