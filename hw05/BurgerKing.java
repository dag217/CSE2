//David Galaydick
//CSE2
//9/28/2014

//program description

//import scanner
import java.util.Scanner;

//start class
public class BurgerKing {
    
    //start main method
    public static void main(String[] args) {
        
        //declare scanner
        Scanner scanner;
        scanner = new Scanner (System.in);
        
        String order;
        String burger;
        String soda;
        String fries;
        
        //ask user to input order
        System.out.print("Enter a letter to indicate a choice of \n\tBurger (B or b) \n\tSoda (S or s) \n\tFries (F or f): ");
        order = scanner.next();
        
        //making sure the user input a single character
        if (order.length()>1){
            
            System.out.println("Single character expected.");
            return;
            
        }
        
        //if the user did everything right up to this point
        else {
        
            //switch statement for the users order
            switch (order){
                
                //if they ordered a burger
                case "B":
                case "b":
                    
                    //asks user what kind of burger they want
                    System.out.print("Enter A or a for \" all the fixings \" \n\tC or c for cheese \n\tN or n for none of the above: ");
                    burger = scanner.next();
                    
                    //user failure segment
                    if (burger.length()>1){
                        System.out.println("Single character expected.");
                        return;
                    }
                    
                    //use success segment
                    else {
                        
                        //checking typing burger order
                        switch(burger){
                            
                            //if they ordered a burger with all thangs on it
                            case "A":
                            case "a":
                                System.out.println("You've ordered a mighty ambitious burger. Good job.");
                                break;
                                
                            //if they ordered a cheeseburger
                            case "C":
                            case "c":
                                System.out.println("You've ordered a cheeseburger. Wowee zowee!");
                                break;
                            
                            //if they ordered a plain burger    
                            case "N":
                            case "n":
                                System.out.println("You're burger is boring. How unfortunate.");
                                break;
                           
                            //if they are not literate enough for burger    
                            default:
                            
                                System.out.println("Where do you think you are? McDonalds?!");
                                System.out.println("Go to the back of the line, and next time input one of the choices we told you to!");
                                return;
                                
                            
                        }//end of burger switch statement
                        
                    }//end of burger else
                    break;
                
                //if they ordered a soda    
                case "S":
                case "s":
                    
                    //asking the user what kind of soda they want
                    System.out.print("Do you want Pepsi (P or p) \n\tCoke (C or c) \n\tSprite (S or s) \n\tor Mountain Dew (M or m): ");
                    soda = scanner.next();
                    
                    //making sure they can read
                    if (soda.length()>1){
                        
                        System.out.println("Single character expected.");
                        return;
                        
                    }
                    
                    else {
                        
                        //checking what kind of soda the user ordered
                        switch(soda){
                            
                            //user is a scrub
                            case "P":
                            case "p":
                                
                                System.out.println("You have ordered a Pepsi because thou art a scrub.");
                                break;
                            
                            //user knows what they are doing    
                            case "C":
                            case "c":
                                System.out.println("You have ordered a Coke because thou art a member of the Coke master race.");
                                break;
                                
                            //user ordered a Sprite
                            case "S":
                            case "s":
                                System.out.println("You have ordered a Sprite. That's fine. I won't judge.");
                                break;
                                
                            //user orders a Mountain Dew
                            case "M":
                            case "m":
                                System.out.println("You've ordered a Mountain Dew. That's fine. I won't judge.");
                                break;
                                
                            default:
                            
                                System.out.println("You needed to put one of the thangs we told you to input.");
                                return;
                                
                        }//end of soda switch statement
                        
                    }//end of soda else statement
                    
                    break;
                
                //if the user ordered fries
                case "F":
                case "f":
                    
                    //asking the user what size fries they want
                    System.out.print("Do you want a large or small order of fries (L, l, S, or s), one of those please: ");
                    fries = scanner.next();
                    
                    //silly user
                    if (fries.length()>1){
                        System.out.println("Single character expected.");
                        return;
                    }
                    
                    //literate user
                    else{
                        
                        switch (fries){
                            
                            //large fries order
                            case "L":
                            case "l":
                                System.out.println("You're fries are big. Fun for the whole family.");
                                break;
                                
                            //small fries order
                            case "S":
                            case "s":
                                System.out.println("You're fries are small. Fun.");
                                break;
                                
                            //silly user
                            default:
                                System.out.println("That's not a size we offer.");
                                return;
                            
                        }//end of fries switch statement
                        
                    }//end of fries else statement
                    break;
                    
                    default:
                        System.out.println("We don't sell those you foolish fool!");
                        return;
                
            }//end of order switch statement
            
        }//end of order else
    }
}