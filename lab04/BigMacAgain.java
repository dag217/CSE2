//David Galaydick
//CSE2
//9/18/2014

//Big Mac and Fries order form

//import the scanner
import java.util.Scanner;

//start the class
public class BigMacAgain{
    
    //start main method
    public static void main(String[] args){
        
        //declare the scanner
        Scanner scanner;
        scanner = new Scanner (System.in); //scanner_setup.exe
        
        //declaring variable for price of big mac and fries
        double cost_bigmac = 2.22;
        double cost_fries = 2.15;
        
        int num_bigmacs; //initializing the big mac variable for future use
        
        //ask user to input number of big macs
        System.out.print("Insert number of Big Macs to be purchased: ");
        if (scanner.hasNextInt()){ //checking if the user is about to enter an integer
            num_bigmacs = scanner.nextInt(); //a logical inputs an integer
        }
        
        //making sure user put in an integer
        else {
            System.out.println("Banana is not an amount of delicious Big Macs you can purchase."); //error message
            return; //terminate program
        }
        
        double total = num_bigmacs*cost_bigmac; // calculating the total
        
        int pretotal_dollars = (int)(total); //pretotal dollar value
        int pretotal_dimes = (int)(total*10)%10; //pretotal dime value
        int pretotal_pennies = (int)(total*100)%10; //pretotal penny value
        
        System.out.println("In case you forgot, you ordered " +num_bigmacs+ " for $" +pretotal_dollars+ "." +pretotal_dimes+pretotal_pennies+ "."); //tells the user how much the big macs they be buying and how much it is so far.
        
            
        if (num_bigmacs < 0){
            System.out.println("So, you're giving us Big Macs? Try a positive number you fool."); // error message
            return; //terminate the program and crush the user's spirits
        }
            
        //checking if the user entered a positive number
        if (num_bigmacs >= 0){ //the number has to be greater than or equal to zero
        
        //asks user if they want fries
        System.out.print("Would you like fries with that? (Y/y/N/n): ");
        String response = scanner.next(); //user inputs one of the recommended replies, hopefully
        
        //checking if the user wanted fries
        if (response.equals("Y") || response.equals("y")){ //checking for positive replies
            System.out.println("You ordered fries for an addition $2.15.");
            total += cost_fries; //adding fries to their total
            
        }
        
        //checking if user didn't want fries
        else if (response.equals("N") || response.equals("n")){ //checking for negative replies
            System.out.println("Fine. More fries for us!"); //snarking
            
        }
        
        //checking if user can follow directions
        else {
            System.out.println("#fail, You had to put Y, y, N, or n!"); //error message
            return; //program terminates
        }
        
        } //end of the if statement that checked for positive number
            
        
        //Determining the numbers to be shown for the total.
        int dollars = (int)total; // calculate dollars
        int dimes = (int)(total*10)%10; //calculate dimes
        int pennies = (int)(total*100)%10; //calculate pennies
        
        
        //Showing the user the total cost of their meal assuming they played the program correctly so far
        System.out.println("Your total cost is $" +dollars+ "." +dimes+pennies+ ".");
        
    }//end main method

}//end class