//David Galaydick
//CSE2
//10/24/2014

//Handy description of program here

import java.util.Scanner;

public class HW8 {
    
    //input getting method
    public static char getInput(Scanner scan, String valids) {
        
        //establish the string we're working with
        String input;
        
        //it'll keep going until the conditions are met for the return in the lop
        while (true){
        
            //checking the user's input
            input = scan.next();
            
            //making sure the user input a single character string
            while(input.length() > 1){
                System.out.print("Single character only- ");
                input = scan.next();
            }
            
            //comparing the user's single character string to every value in the list
            for (int i = 0; i < valids.length(); i++){
                if (input.charAt(0)==valids.charAt(i)){
                    return input.charAt(0);
                }
            } 
        
            //asks user to try again
            System.out.print("That input was not in the list. Try once more: ");
            
        }
        
    }
    
    //input getting method with counter
    public static char getInput(Scanner scan, String valids, int counter){
        
        //establish the input we're checking
        String input;
        
        //while loop to keep track of how many tries the user did
        while (counter > 0){
        
            input = scan.next();
            
            //checking the length of the user's input
            while(input.length() > 1){
                counter--;
                if (counter == 0) break;
                System.out.print("Single character only (tries remaining: " +counter+ "): ");
                input = scan.next();
                
            }
            
            //comparing single character string to every value in the list
            for (int i = 0; i < valids.length(); i++){
                if (input.charAt(0)==valids.charAt(i)){
                    return input.charAt(0);
                }
            }
            
            //decrements counter here so the next statement shows the right number
            counter--;
            
            //tells user they put wrong thing in
            if (counter != 0){
                System.out.print("Try entering something from the list this time (tries remaining: " +counter+ "): ");
            }
            
        }
        
        //gives a blank if it manages to reach this point
        return ' ';
        
    }
    
    //input getting method - digits edition
    public static char getInput(Scanner scan, String message, String digits){
        
        //prompt
        System.out.print(message);
        
        //establish the string we're working with
        String input;
        
        //it'll keep going until the conditions are met for the return in the lop
        while (true){
        
            //checking the user's input
            input = scan.next();
            
            //making sure the user input a single character string
            while(input.length() > 1){
                System.out.print("Single character only- ");
                input = scan.next();
            }
            
            //comparing the user's single character string to every value in the list
            for (int i = 0; i < digits.length(); i++){
                if (input.charAt(0)==digits.charAt(i)){
                    return input.charAt(0);
                }
            } 
        
            //asks user to try again
            System.out.print(message);
            
        }
        
        
        
        
    }
    
    //start the main method
    public static void main (String[] args){
        
        //declare the necessary variable
        char input;
        
        //declare the scanner
        Scanner scan = new Scanner(System.in);
        
        //prompt user to input c or C then call the getInput method
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input=getInput(scan,"Cc");
        System.out.println("You enetered " +input);
        
        
        //prompt user to input y Y n or N then call the other getInput method
        System.out.print("Enter 'y', 'Y', 'n' or 'N' - ");
        input = getInput(scan,"yYnN",5); //give up after 5 attempts
        
        //if the method returned nothing, nothing is printed
        if (input != ' '){
            System.out.println("You entered " +input);
        }
        
        
        //ask user to input a number and goes to the 3rd getInput method
        input = getInput(scan,"Choose a digit: ","0123456789");
        System.out.println("You entered " +input);
        
    }
}