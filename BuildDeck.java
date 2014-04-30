/** 
Mallory Joy
CS 110
BuildDeck class creates the deck of cards to be used for the game
*/


import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class BuildDeck{
   
   private int rank;
   private int suit;
   private String imageFile;
   
   private ArrayList<Card> deck = new ArrayList<>();
      
   private ArrayList<Card> deckHalfOne = new ArrayList<>();
   private ArrayList<Card> deckHalfTwo = new ArrayList<>();
   
   private ArrayList<Card> nextDeck1,nextDeck2;
   
   Random rand = new Random();
   
  
   public BuildDeck(){
            

      for(int r = 0;r < 13;r++){
      
         for(int s = 0;s < 4;s++){
            
            rank = r+1;
            suit = s+1;
            
            deck.add(new Card(suit,rank));
            
            
         }
         
      }
      
      for(int j = 0;j < deck.size();j++){
         
         String rankStr = "";
         String suitStr = "";
         
         switch(deck.get(j).getRank()){
            case 1:
               rankStr = "ACE";
               break;
            case 11:
               rankStr = "JACK";
               break;
            case 12:
               rankStr = "QUEEN";
               break;
            case 13:
               rankStr = "KING";
               break;
            default: 
               rankStr = "";
               break;
         }
            
         switch(deck.get(j).getSuit()){
            case 1:
               suitStr = "c";
               break;
            case 2:
               suitStr = "d";
               break;
            case 3:
               suitStr = "s";
               break;
            case 4:
               suitStr = "h";
               break;
            
         }
      }
      
   
      
      shuffle(deck);
      
      for(int h = 0; h < deck.size(); h++){
         
         if(h == 0 || h % 2 == 0){
            
            deckHalfOne.add(deck.get(h));
         }
         else{
            deckHalfTwo.add(deck.get(h));
         }

      }
   }
   
   
   public ArrayList<Card> getDeckOne(){
      
      return deckHalfOne;
   }
   
   
  
   public ArrayList<Card> getDeckTwo(){
      
      return deckHalfTwo;
   }


   
   public ArrayList<Card> shuffle(ArrayList<Card> deck){
      
      for(int h = 0; h < deck.size();h++){
      
         int randPos = rand.nextInt(deck.size());
               
         Card temp = deck.get(h);
         
         this.deck.set(h,deck.get(randPos));
         
         this.deck.set(randPos,temp);
      }
      
      return deck;
   }
}