



//import scanner
import java.util.Scanner;

//start class
public class LoopTheLoop {
    
    //start main method
    public static void main(String[] args) {
        
        //declare scanner
        Scanner scan_thangs;
        scan_thangs = new Scanner (System.in);
        
        //initiallizing number of stars
        int nStars = 10;
        
        int input = 0;
        
        //loops until nStars is 0
        while (nStars > 0){
            
            if (nStars >1)
                System.out.print("*");
            
            else
                System.out.println("*");
            
            nStars--;
            
        }

        
        //sets the counter for next while loop and sets the stars to print the right way
        int counter = 1;
        nStars = counter;
        
        
        //loops until counter reaches 11
        while (counter < 11) {
            
            while (nStars > 0){
                
                if (nStars > 1)
                    System.out.print("*");
                
                else
                    System.out.println("*");
                
                nStars--;
                
            }
            
            //increments the counter and adjusts the star counter accordingly
            counter++;
            nStars = counter;
            
        }
        
        //prompting the user to input a variable, then checking if it ws an integer
        System.out.print("Enter an int between 1 and 15: ");
        Boolean test1 = scan_thangs.hasNextInt();
        
        if (test1 == true){
            
            //accepting the user's input, then checking if it's in the desired range
            input = scan_thangs.nextInt();
            
            Boolean test2 = 1 <= input && input <= 15;
            
            if (test2 == true){
                
                nStars = input;
                counter = 1;
                
                while (nStars > 0){
                    
                    if (nStars >1) System.out.print("*");
                    
                    else System.out.println("*");
                    
                    nStars--;
                    
                }
                
                nStars = 1;
                
                while (counter < input+1){
                    
                    //same as earlier
                    while (nStars > 0){
                        
                        if (nStars >1) System.out.print("*");
                        
                        else System.out.println("*");
                        
                        nStars--;
                        
                    }
                    
                    counter++;
                    nStars = counter;
                    
                }
                
            }
            
            else{
                System.out.println("Invalid input.");
                return;
            }
            
        }
        
        else{
            System.out.println("Invalid input.");
            return;
        }
    }
    
}