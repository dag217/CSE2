//David Galaydick
//CSE2
//9/16/2014

//User inputs a double then the program prints out the first four digits right of the decimal point

//import the Scanner
import java.util.Scanner;

//start the class
public class FourDigits{
    
    //start the main method
    public static void main(String[] args){
        
        //declare the scanner
        Scanner scanner;
        scanner = new Scanner (System.in);
        
        //ask the user to input a double
        System.out.print("Input a double and recieve the first 4 digits after the decimal place: ");
        double number = scanner.nextDouble();
        
        //Making the program try to figure out the first 4 digits to the right of the decimal place
        int place1 = (int)(number*10)%10; //the first digit
        int place2 = (int)(number*100)%10; //the second digit
        int place3 = (int)(number*1000)%10; //the third digit
        int place4 = (int)(number*10000)%10; //the fourth digit
        
        //print out the first 4 digits after the decimal place
        System.out.println("The first four digits after the decimal place are " +place1+place2+place3+place4+ ".");
        
    }//end of method
}//end of class