/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 * @author by Harnoor Kaur Gill and Mehakdeep Kaur
 * @date 5thApril,2024
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**the class that contains the main logic for the declaring the winner of the game .
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public  class Game extends GroupOfCards {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game

    public Game(String name) {
        this.name = name;
        players = new ArrayList();
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
     * Play the game. This method calls the shuffle method from other class and assign the sequential numbers to 
     * the values of suits.
     */
    public void play() {
        GroupOfCards.shuffle();
        
        for (i=1 ; i < =10 ; i++)
        {
            Card.value =i;
            
        }
        
        
        
        
         
         
       
    };
  
    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    /**
     * using declare winner for comparing the results of dealer and player
     */
    public  void declareWinner()
    {
        Card[] dealerhand = CardHandGenerator.generateHand(5);
        Card[] playerhand = CardHandGenerator.generateHand(5);
        
        for (Card d : CardHandGenerator.generateHand)
        {
         if (playerhand> dealerhand && playerhand<=21)
            System.out.println("you win ");
        else if (playerhand < dealerhand && dealerhand <=21)
             System.out.println("dealer win ");
        else if ( playerhand >21)
              System.out.println(" out  ");
        else 
               System.out.println("tie ");
        
        }
            
        System.out.println("The winner is  ");
    };

}//end class
