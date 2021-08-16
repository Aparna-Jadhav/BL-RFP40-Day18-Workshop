package deckCard;

import java.util.ArrayList;

public class Card {
	
	 ArrayList<String> deck = new ArrayList<String>();
	 String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs" };
	 String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	 String[] player1 = new	String[9];
	 String[] player2 = new	String[9];
	 int totalCards=51;
	 
	 //create the card from combination of suits-values and add into arraylist  
	 public void formDeck()
     {
		 for (int s = 0; s < suits.length; s++)
		 {
  			for (int v = 0; v < values.length; v++) 
			{
  				deck.add(suits[s]+ " of "+values[v]);
			}
		}
	}
	 
	 //distribute cards for player1 and player2 using random number
	 public void distribute()
	 {
		 for (int i = 0; i < player1.length; i++) 
		 {
			 var random = (int) Math.floor(Math.random() * totalCards--);
			 
			 //get the random card for player1
			player1[i]=deck.get(random);
			 deck.remove(random);
				 
		 }
		 
		 for (int i = 0; i < player2.length; i++) 
		 {
			 var random = (int) Math.floor(Math.random() * totalCards--);
			
			//get the random card for player2
			player2[i]=deck.get(random);
			 deck.remove(random);
				 
		 }
		 
		 
	 }
	 
	 //printing the card
	 public void printDeck()
	 {
		//convert arraylist into array for print the card
		 var res = deck.toArray();
		 for (int i = 0; i < deck.size(); i++)
		 {
			 System.out.println(res[i]);
		 }
		 System.out.println();
	 }

	 
	 //printing the player1 and player2
	 public void printPlayers()
     {
		 
		 //print card of player1
		 System.out.println("\nFirst player cards : ");
		 
		 for (int j = 0; j < player1.length; j++)
		 {
			 System.out.println(player1[j]);
		 }
		 
		 //print cards of player2
		 System.out.println("\nSecond player card : ");
		 
		 for (int j = 0; j < player2.length; j++)
		 {
			 System.out.println(player2[j]);
		 }     
		
     }
	 
}
