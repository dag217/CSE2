//David Galaydick
//CSE 2
//9/12/14

//figure out the cost of as many Big Macs as you want

//import the scanner class
import java.util.Scanner;

//define the public class
public class BigMac {
    
    //main method to start Java programs
    public static void main(String[] args){
        
        //declaring the scanner object
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //prompt user to input a the number of big macs purchased
        System.out.print(
            "Enter the number of Big Macs (an integer > 0 por favor): ");
        int nBigMacs = myScanner.nextInt();
        
        //prompt user to enter the big mac cost
        System.out.print("Enter the cost per Big Mac as"+ " a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        
        //prompt user to enter sales tax rate
        System.out.print(
            "Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100; 
        
        //calculate the cost after considering the numbers the user input
        double cost$;
        int dollars, dimes, pennies;
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        dollars=(int)cost$;
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*10)%10;
        System.out.println("The total cost of "+nBigMacs+" Big Macs, at $"+bigMac$+ " per Big Mac, with a sales tax of " +taxRate*100+"%, is $"+dollars+'.'+dimes+pennies);
        
        
    }//end of main method
}//end of class, go home