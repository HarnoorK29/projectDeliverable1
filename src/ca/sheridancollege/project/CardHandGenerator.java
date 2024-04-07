/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.Random;
/**
 *@author by Harnoor Kaur Gill and Mehakdeep Kaur
 * @date 5thApril,2024
 */
/** A class that contains a method named generate Hand for generating a random deck of cards and printing them/*/
public class CardHandGenerator {
    public static Card[] generateHand(int numCards)
    {
        Card[] hand = new Card[numCards];
        Random random = new Random();
        for (int i=0 ; i<hand.length ; i++)
        {
            Card.Value value =Card.Value.values()[random.nextInt(13)];
            Card.Suit suit = Card.Suit.values()[random.nextInt(4)];
            Card card = new Card(value, suit);
            hand[i] = card;
            System.out.println("generating" + card.getValue() + "of" + card.getSuit());
        }
        return hand;
    }
    
}
