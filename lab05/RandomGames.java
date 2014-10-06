//David Galaydick
//CSE2
//9/26/2014

//pro graham

//import scanner
import java.util.Scanner;

public class RandomGames {
    
    public static void main(String[] args){
        
        //declare scanner
        Scanner scanman;
        scanman = new Scanner (System.in);
        
        //declaring variables
        String game;
        int roulette = (int)(Math.random()*38);
        
        //Ask user to input what type of game they wanna play
        System.out.print("Enter R or r for Roulette, C or c for Craps, P or p for Pick a Card: ");
        game = scanman.next();
        
        //making sure user input the right type of input
        if (game.length()>1){
            
            System.out.println("Single character expected. What's you're dealio yo?!");
            return;
            
        }
        
        else {
        
            //switch statement checking what the user input for earlier input request
            switch (game){
                
                //for roulette
                case "R":
                case "r":
                    
                    switch (roulette){
                        
                        case 37:
                            System.out.println("Roulette: 00");
                            break;
                            
                        default:
                            System.out.println("Roulette: " +roulette);
                            break;
                    }
                    
                    break;
                
                //for craps
                case "C":
                case "c":
                    System.out.println("We have not implemented this crap(s) yet.");
                    return;
                
                //for pick a card    
                case "P":
                case "p":
                    System.out.println("We have not implemented this pick a card game yet.");
                    return;
                
                default:
                
                    System.out.println("You didn't input one of the letters we told you to.");
                    return;
                
                
            }
            
        }
        
    } // end of main method
    
} //end of class
