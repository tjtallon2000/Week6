package com.promineo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>();
	String[] suits = {"Spade" , "Hearts", "Clubs", "Diamonds"};
	
	Deck()
	{
		int[] numbers = {2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		for(String suit :suits) {
			int count = 2;
			for(Integer numberName : numbers) {
				cards.add(new Card(numberName, suit));
				count++;
			}
		}
	}
	public List<Card> getCards(){
		return cards;
	}
	
	public void describe() {
		for(Card card : this.cards) {
			card.describe();
		}
	}
	public Card draw() {
		Card card = cards.remove(0);
		return card;
	}
	public void shuffle() {
		Collections.shuffle(cards);
		
		
	}
}
