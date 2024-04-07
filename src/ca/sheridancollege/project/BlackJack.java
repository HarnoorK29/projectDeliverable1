/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.Scanner;
/**
 *
 * @author by Harnoor Kaur Gill and Mehakdeep Kaur
 * @date 5thApril,2024
 */
/**
 *This class contains the main method which shows the display screen and takes the user input 
 * for choosing the card .It calls the methods inside other classes .....like generating group of cards 
 * playing game , declaring winner , displatying Status .
 */
public class BlackJack {
    public static void main(String[] args)
    {
            
        System.out.println("******************************************************");
        System.out.println("BlackJack Game ");
        System.out.println("******************************************************");
     
        Scanner inputSuit = new Scanner(System.in);
         
        System.out.println("Please choose a card to throw");
        for(int i=0; i<Card.Suit.values().length; i++)
       {
           System.out.println((i +1) + ": " + Card.Suit.values()[i]);
       }
        Scanner inputValue = new Scanner(System.in);
        for(int i=0; i<Card.Value.values().length; i++)
       {
           System.out.println((i +1) + ": " + Card.Value.values()[i]);
       }
       int suit = input.nextInt()-1;
        int valuePosition = input.nextInt()-1;
     GroupOfCards.GenerateGroupOfCards();
        System.out.println(player.play());
        
        System.out.println(player.declareWinner());
      System.out.println(player.displayStatus());
    }
    
    
}

