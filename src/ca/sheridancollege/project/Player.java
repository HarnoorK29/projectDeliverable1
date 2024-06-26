/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 * @author by Harnoor Kaur Gill and Mehakdeep Kaur
 * @date 5thApril,2024
 */
package ca.sheridancollege.project;
import java.util.ArrayList;
/**
 * A class that models each Player in the game. 
 * Players have an identifier, which should be unique.
 *it validates the player and the money they have to play the game.
 *
 * 
 */
public  class Player extends CardHandGenerator  {

    private String name;
     
        private long id ;
        private double money ;
      ArrayList<String>  player_hand = new ArrayList<>();
        ArrayList<String>  dealer_hand = new ArrayList<>();//the unique name for this player

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name , long id , double Money ) {
            this.name = name;
            this.id = id;
            this.money =Money;

        }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method validates the player and the dealer and checks whether they have sufficient money to play the game or not .
     */
    public   void play()
            
            
    {
        
        int value = 0;
        
        
        Card[] dealerhand = CardHandGenerator.generateHand(5);
        Card[] playerhand = CardHandGenerator.generateHand(5);
         
        Scanner sc = new Scanner(System.in);
            System.out.println("please enter your name:");
            String userName = sc.nextLine();
            System.out.println("Please enter your password:");
            String password = sc.nextLine();
           Player newPlayer = new Player(playerName, password);
                Player[userCount] = newPlayer;//add the new user to the user list
                playerCount++;
                System.out.println("New Player Added");
                System.out.println("PlayerName " + userName);
                System.out.println("Password: just kidding can't show password");
            while (true)
            {
                System.out.println("Money ::  $"+money);
                System.out.println("Enter your bet :   $");
                 Scanner    userInput = new Scanner(System.in);
                   double p_bet = userInput.nextDouble();
                   
                if (p_bet > money)
                   {
                       System.out.println("You don't have sufficient monet to play ");
                       
                   }
                else 
                {
                   System.out.println(p_bet);
                
                
            }

        }
            /**
             * this method displays the status of the user  by displaying name and money 
          *
            */
            
            public void displayStatus()
            {
                System.out.println("PlayerName" + name);
                System.out.println("Money" + money);
            }
        }
    };

}
