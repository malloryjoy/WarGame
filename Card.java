/**
 * Representation of a single playing card (from a standard 52 card deck). 
 * A card consists of a suit value and a rank value.  Once instantiated, the
 * Card object cannot change.
 *
 * Mallory Joy
 */
 
 
import java.util.Random;

public class Card implements CardInterface{
   
   private Random rand;
   
   private int rank,suit;

   private String fileRank,fileSuit, fileString;
   
   
   
   public Card(int suitIn, int rankIn){
      
      suit = suitIn;
      rank = rankIn;
      
   }
   
 
   public int getSuit(){
      
      return suit;
   }
   
   
   public int getRank(){

      return rank;
   }
   
  
   public String toString(){
      
      String outputString = "";
      String rankString = "";
      String suitString = "";
      
      switch(rank){
         case 1:
            rankString = "Ace";
            break;
         case 2:
            rankString = "Two";
            break;
         case 3:
            rankString = "Three";
            break;           
         case 4:
            rankString = "Four";
            break;
         case 5:
            rankString = "Five";
            break;
         case 6:
            rankString = "Six";
            break;
         case 7:
            rankString = "Seven";
            break;                        
         case 8:
            rankString = "Eight";
            break;
         case 9:
            rankString = "Nine";
            break;
         case 10:
            rankString = "Ten";
            break;
         case 11:
            rankString = "Jack";
            break;
         case 12:
            rankString = "Queen";
            break;
         case 13:
            rankString = "King";
            break;                                                            
         default:
            break;
      }
            
      switch(suit){
         case 1:
            suitString = "Clubs";
            break;
         case 2:
            suitString = "Diamonds";
            break;
         case 3:
            suitString = "Spades";
            break;
         case 4:
            suitString = "Hearts";
            break;
         default:
            break;
      }
      
      
      outputString = rankString + " of " + suitString;
      
      return outputString;   
   }
   
  
   public boolean equals(Card otherCard){
      
      if(otherCard.rank == this.rank){
         return true;
      }
      else
         return false;
   }  
   

   public boolean lessThan(Card otherCard){
      
      if(otherCard.rank > this.rank){
         return true;
      }
      else
         return false;
   }
   

   public boolean greaterThan(Card otherCard){
      
      if(otherCard.rank < this.rank)
         return true;
      else
         return false;
   }
   
   
   
   public String getCardFile(){
      
      switch(rank){
         case 1:
            fileRank = "ace";
            break;
         case 2:
            fileRank = "2";
            break;
         case 3:
            fileRank = "3";
            break;           
         case 4:
            fileRank = "4";
            break;
         case 5:
            fileRank = "5";
            break;
         case 6:
            fileRank = "6";
            break;
         case 7:
            fileRank = "7";
            break;                        
         case 8:
            fileRank = "8";
            break;
         case 9:
            fileRank = "9";
            break;
         case 10:
            fileRank = "10";
            break;
         case 11:
            fileRank = "jack";
            break;
         case 12:
            fileRank = "queen";
            break;
         case 13:
            fileRank = "king";
            break;  
        case 14:
            fileRank = "ace";
            break;                                                          
         default:
            break;
      }
            
      switch(suit){
         case 1:
            fileSuit = "c";
            break;
         case 2:
            fileSuit = "d";
            break;
         case 3:
            fileSuit = "s";
            break;
         case 4:
            fileSuit = "h";
            break;
         default:
            break;
      }
      
      fileString = "ImageFiles//" + fileRank + fileSuit + ".jpg";
      
      return fileString;
      
   }
}