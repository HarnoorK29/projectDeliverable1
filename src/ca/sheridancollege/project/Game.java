/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 * @author Harnoor Kaur Gill and Mehakdeep Kaur 
 * @date 18th february , 2023
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game

    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }
    
    /**
     * print statement for displaying the blackjackgame message 
     
     
     
     **/
    public static void main(String[] args) {
        
        System.out.println("******************************************************");
        System.out.println("BlackJack Game ");
        System.out.println("******************************************************");
     
     
         /** 
          *  randomly generating cards for the dealer and the player 
          * 
          * 
          */
        
         Card[] dealerhand = CardHandGenerator.generateHand(4);
         Card[] playerhand = CardHandGenerator.generateHand(4);

        
        
        
        
        
        
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public /* abstract*/ void play()
    {
        
          
    
    };

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    
    /**
     * 
     * 
     * various conditions set showing who will be winning the game 
     */
    
    
    public /*abstract */void declareWinner()
            
    {
        
        if (playerhand > dealerhand && playerhand<=21)
            System.out.println("you win ");
        else if (playerhand < dealerhand && dealerhand <=21)
             System.out.println("dealer win ");
        else if ( playerhand >21)
              System.out.println(" out  ");
        else 
               System.out.println("tie ");
            
    };

}//end class
