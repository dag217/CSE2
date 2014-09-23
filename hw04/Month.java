//David Galaydick
//CSE2
//9/22/2014

//User inputs a number for the month and the program outputs the amount of days in the month

//import the scanner
import java.util.Scanner;

//start the cla$$
public class Month{
    
    //start the main method
    public static void main (String[] args){
        
        //declare the scanner
        Scanner scanner;
        scanner = new Scanner (System.in);
        
        //initializing variables
        int month;
        int year;
        
        //asking user to input month
        System.out.print("Enter an integer giving the number of the month (1-12): ");
        if (scanner.hasNextInt()){
            month = scanner.nextInt();
            
            //checking if the user input a number within the range
            if (month <= 0 || month > 12){
                System.out.println("That's not between 1 and 12. Run the program again and follow directions next time.");
                return;
            }
            
            //checking if the user input a month number with 30 days
            else if (month == 4 || month == 6 || month == 9 || month == 11){
                System.out.println("This month has 30 days.");
            }
            
            //checking if te user input a month number with 31 days
            else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                System.out.println("This month has 31 days.");
            }
            
            //february is now my least favorite month
            //checking if the month if february
            //going through torturous use of if statements to determine if it's a leap year or not
            else if (month == 2 ){
                System.out.print("Enter and integer giving the number of the year: ");
                if (scanner.hasNextInt()){
                    year = scanner.nextInt();
                    
                    //making sure the user input a number greater than zero
                    if (year < 0){
                        System.out.println("Year should probably be positive. I ain't going into that B.C. nonsense.");
                        return;
                    }
                    
                    //leap year checking if statement party
                    else if (year >= 0){
                        if (year%4 != 0){
                            System.out.println("This month has 28 days.");
                        }
                        
                        else if (year%4 == 0){
                            if (year%100 != 0){
                                System.out.println("This month has 29 days.");
                            }
                            
                            else if (year%100 == 0 && year%400 == 0){
                                System.out.println("This month has 29 days.");
                            }
                            
                            else if (year%100 == 0 && year%400 != 0){
                                System.out.println("This month has 28 days.");
                            }
                        }
                    }//end of leap year if statements
                }// end of checking if the year input was an integer
                
                //making sure the user input an integer at all
                else {
                    System.out.println("Enter an integer fool!");
                    return;
                }
                
            } // end of february if statement
            
            
        }// end of checking for integer if statement
        
    //checks if the number for the month the user input wasn't an integer
        else {
            System.out.println("Enter an integer fool!");
            return;
        }
    } // end of main method
} //end of class