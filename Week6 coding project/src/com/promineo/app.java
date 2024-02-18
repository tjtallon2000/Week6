package com.promineo;

public class app {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		System.out.println("New Deck created");
		System.out.println("---------------");
		
		deck.describe();
		
		System.out.println("\nShuffled Deck!");
		System.out.println("-------------");
		deck.shuffle();
		
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		player1.setName("Player1");
		player2.setName("Player2");
		
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				player1.draw(deck);
				
			} else {
				player2.draw(deck);
			}
		}
		
		System.out.println("\n" + player1.getName() + "has these cards" + player1.getHand());
		System.out.println("\n" + player2.getName() + "has these cards" + player2.getHand());
		
		
		int round = 1;
		
		for(int i = 0; i < 26; i++) {
			System.out.println("\n----- Round" + round + "of 26 -----");
			round++;
			Card cardOne = player1.flipCard();
			Card cardTwo = player2.flipCard();
			
			System.out.println(player1.getName() + " plays: ");
			cardOne.describe();
			System.out.println(player2.getName() + " plays: ");
			cardTwo.describe();
			
			
			if(cardOne.getValue() > cardTwo.getValue()) {
				player1.incrementScore();
				System.out.println("\n" + player1.getName() + " Wins this round ");
			} else if (cardTwo.getValue() > cardOne.getValue()) {
				player2.incrementScore();
			    System.out.println("\n" + player2.getName() + " Wins this round");
		}else {
			System.out.println("It's a draw");
			}
		System.out.println("Current Score: Player1- " + player1.getScore() + " Current Score: PLayer2-" + player2.getScore());
			}
			  int playerOneScore = player1.getScore();
		        int playerTwoScore = player2.getScore();
        System.out.println("Final Score of Player1: " + playerOneScore);
        System.out.println("Final Score of Player2: " + player2.getScore());
	
     if( playerOneScore > playerTwoScore) {
    	 System.out.println("Player1 Wins!");
     } else if 
       (playerTwoScore > playerOneScore) {
    	 System.out.println("Player2 Wins!");
     } else if 
       (playerOneScore == playerTwoScore) {
    	 System.out.println("It's a draw!");
    	 
     }
	}
	}
