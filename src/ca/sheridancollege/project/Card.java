/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 * @author Harnoor Kaur Gill and Mehakdeep Kaur
 * @date 18th february 2024
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public  class Card {
    
     private Value value ;
    private Suit suit;
    
    public enum Suit 
    {
        HEARTS,CLUBS ,SPADES ,DIAMONDS
    }
    public enum Value
    {
        ACE , TWO, THREE,FOUR,FIVE, SIX,SEVEN,EIGHT,NINE , TEN , JACK , QUEEN ,KING 
    }
    
    
     /**
     *@param givenValue
     **/
    /** adding getters and setters for value and suit   * 
     * 
     * 
     * @param givenValue
     * @param givenSuit 
     */
    public Card(Value givenValue , Suit givenSuit)
    {
        value =givenValue ;
        suit= givenSuit;
        
    }

    public Value getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
    
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public  String toString()
            
    {return suit.toString() + " - " + suit.toString();
   }
    

}
