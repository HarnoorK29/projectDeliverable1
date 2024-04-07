/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 * @author by Harnoor Kaur Gill and Mehakdeep Kaur
 * @date 5thApril,2024
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. 
 *
 * 
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    public ArrayList<Card> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }

    public GroupOfCards()
    {
        this.cards = new ArrayList<>();
        generateGroupOfCards();
        
    }
    /**  generating the deck of 52 cards**/ 
    public void generateGroupOfCards()
    {
        for (Card.Suit suitCard : Card.Suit.values())
        {
            for ( Card.Value cardValue : Card.Value.values()){
                this.cards.add(new Card( cardValue, suitCard ));
            }
        }
    }
   

    
    
}
//end class
