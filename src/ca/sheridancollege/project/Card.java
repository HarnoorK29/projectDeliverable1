/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 * @author by Harnoor Kaur Gill and Mehakdeep Kaur
 * @date 5thApril,2024
 */
package ca.sheridancollege.project;

/**
 * A class is used as the base Card class for the project..
 *
 * 
 * 
 */
public  class Card {
    

    private Value value;
    private Suit suit ;
    public enum Suit{
        HEARTS , CLUBS , DIAMONDS , SPADES 
    }
    public enum Value
    {
          ACE, TWO, THREE, FOUR, FIVE,SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }
    
   public static final int[] RANKS = {1,2, 3, 4,5,6,7,8,9,10};
   
    public Card(Value givenValue, Suit givenSuit)
    {
        value =givenValue;
        suit=givenSuit;
    }

    public  String toString()
    {
        return value + "of" + suit;
    }
  public Value getValue()
  {
      return value ;
      
  }
  public void setValue(Value value)
          
  {
      this.value = value ;
  }
  public Suit getSuit()
  {
      return suit;
  }
  public void setSuit(Suit suit)
  {
      this.suit = suit;
  }
}

