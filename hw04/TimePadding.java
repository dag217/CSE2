//David Galaydick
//CSE 2
//9/22/2014

//User inputs the number of seconds that have passed in the day and the time is output

//import the scanner
import java.util.Scanner;

//start the class
public class TimePadding {
    
    //start the main method
    public static void main(String[] args){
        
        //declare the scanner
        Scanner scanner;
        scanner = new Scanner (System.in);
        
        //declare variables
        int seconds_input;
        int hour;
        double minutes;
        int minutes_digit1;
        int minutes_digit2;
        double seconds;
        int seconds_digit1;
        int seconds_digit2;
        
        //prompt user to input number of seconds
        System.out.print("Enter the time in seconds: ");
        if (scanner.hasNextInt()){
            seconds_input = scanner.nextInt();
            
            //making sure the user wasn't inputting a negative number
            if (seconds_input < 0){
                System.out.println("There can't be negative seconds.");
                return;
            }
            
            //making sure the user knows how many seconds are in a day and didn't put so many that it goes into the next day
            else if (seconds_input > 86399){
                System.out.println("That goes into the next day.");
                return;
            }
            
            else {
                hour = (int)(seconds_input/3600);
                minutes = ((seconds_input%3600)/60);
                minutes_digit1 = (int)(minutes/10);
                minutes_digit2 = (int)(minutes%10);
                seconds = ((seconds_input%3600)%60);
                seconds_digit1 = (int)(seconds/10);
                seconds_digit2 = (int)(seconds%10);
                
                System.out.println("The time is " +hour+":"+minutes_digit1+minutes_digit2+":"+seconds_digit1+seconds_digit2+".");
            }
            
        }//end of checking if user input integer
        
        //if user didn't input an integer
        else {
            System.out.println("You had to input an integer.");
            return;
        }
        
    }// end of main method
    
}// end of class