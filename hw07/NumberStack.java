//David Galaydick
//CSE2
//10/19/2014

//description here

//import scanner
import java.util.Scanner;

//start class
public class NumberStack{
    
    //start main method
    public static void main(String[] args){
        
        //necessary variables
        int input = 0;
        int counter = 1;
        int spots = 0;
        int lines_counter = 1;
        int spot_counter = 1;
        
        //declare scanner
        Scanner scan_thangs;
        scan_thangs = new Scanner (System.in);
        
        //prompt user to input number
        System.out.print("Enter a number between 1 and 9 (integer please): ");
        if (scan_thangs.hasNextInt()){
            
            input = scan_thangs.nextInt();
            
            //checking to see if user understands what "between 1 and 9" means
            if (input >= 1 && input <= 9){
                
                //determining the number of spots that will be printed each row
                spots = 2*input - 1;
                
                System.out.println("With for loops: ");
                System.out.println();
                
                //stack with for loop
                for (counter = 1; counter <= input; counter++){
                    
                    //lines loop
                    for (lines_counter = 1; lines_counter <= counter; lines_counter++){
                        
                        //printing numbers and spaces
                        for (spot_counter = 1; spot_counter <= spots; spot_counter++){
                            
                            if (spot_counter >= input-(counter- 1) && spot_counter <= input + (counter - 1)) System.out.print(counter);
                            else System.out.print(" ");
                            
                        }//end of number and space printing loop
                        
                        System.out.println(); //new line
                        
                    }//end of lines loop
                    
                    //dash printing loop
                    for (spot_counter = 1; spot_counter <= spots; spot_counter++){
                        
                        if (spot_counter >= input-(counter- 1) && spot_counter <= input + (counter - 1)) System.out.print("-");
                        else System.out.print(" ");
                        
                    }//end of dash printing loop
                    
                    System.out.println();
                    
                }//end of for loop
                
                //resetting necessary variables
                counter = 1;
                lines_counter = 1;
                spot_counter = 1;
                
                System.out.println();
                System.out.println("With while loops: ");
                System.out.println();
                
                
                
                //stack with while loop
                while(counter <= input){
                    
                    //lines loop 
                    while (lines_counter <= counter){
                        
                        //printing the numbers and spaces
                        while (spot_counter <= spots){
                            
                            if (spot_counter >= input-(counter- 1) && spot_counter <= input+(counter- 1)) System.out.print(counter);
                            else System.out.print(" ");
                            spot_counter++;
                            
                            
                        }//end of printing numbers and spaces loop
                        
                        System.out.println();//new line
                        spot_counter = 1; //resetting the counter
                        lines_counter++;
                        
                    }//end of lines loop
                    
                    //dash printing
                    while (spot_counter <= spots){
                        if (spot_counter >= input-(counter- 1) && spot_counter <= input+(counter- 1)) System.out.print("-");
                        else System.out.print(" ");
                        spot_counter++;
                        
                    }//end of dash printing
                    
                    System.out.println();
                    
                    //resetting counters
                    spot_counter = 1;
                    lines_counter = 1;
                    
                    
                    counter++;
                    
                    
                }//end of stack with while loop
                
                //resetting counters
                spot_counter = 1;
                lines_counter = 1;
                counter = 1;
                
                System.out.println();
                System.out.println("With do while loops: ");
                System.out.println();
                
                //with do while loops
                do {
                    
                    //number of lines loop
                    do {
                        
                        //printing numbers and spaces loop
                        do {
                            
                            if (spot_counter >= input-(counter- 1) && spot_counter <= input+(counter- 1)) System.out.print(counter);
                            else System.out.print(" ");
                            spot_counter++;
                            
                        } while (spot_counter <= spots); //end of printing numbers and spaces loop
                        
                        System.out.println();
                        spot_counter = 1; //resetting the spot counter
                        lines_counter++;
                        
                    } while (lines_counter <= counter); //end of number of lines loop
                    
                    //dash printing loop
                    do {
                        
                       if (spot_counter >= input-(counter- 1) && spot_counter <= input+(counter- 1)) System.out.print("-"); 
                       else System.out.print(" ");
                       spot_counter++;
                        
                    } while (spot_counter <= spots); //end of dash printing loop
                    
                    System.out.println();
                    
                    //resetting counters
                    spot_counter = 1;
                    lines_counter = 1;
                    
                    counter++;
                    
                } while (counter <= input); //end of do while loop
                
            }//end of if statement of the ideal situation
            
            //dumb user
            else {
                
                System.out.println("No. Do it right next time.");
                return;
                
            }//end of dumb user
            
        }//end of checking if user can read
        
        //ugh
        else {
            
          System.out.println("You've gotta be kidding me...");
          return;
            
        }//end of confirming user's inability to read or follow basic instructions
        
    }//end of main method
    
}//end of class