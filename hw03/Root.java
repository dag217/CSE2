//David Galaydick
//CSE2
//9/16/2014

//The user inputs a double then the program prints a crude esimate of the cube root of the number and the value of the crude guess cubed.
//Why not?

//Import the scanner
import java.util.Scanner;

//define the class
public class Root{
    
    //start the main method
    public static void main(String[] args){
        
        //declare the scanner
        Scanner scanner;
        scanner = new Scanner (System.in);
        
        //Ask user to input a number
        System.out.print("Input a double and recieve its cube root:");
        double number = scanner.nextDouble();
        
        //Calculations to guess the cube root of a number
        double guess = number/3;
        double guess1 = (2*guess*guess*guess+number)/(3*guess*guess);
        double guess2 = (2*guess1*guess1*guess1+number)/(3*guess1*guess1);
        double guess3 = (2*guess2*guess2*guess2+number)/(3*guess2*guess2);
        double guess4 = (2*guess3*guess3*guess3+number)/(3*guess3*guess3);
        double guess5 = (2*guess4*guess4*guess4+number)/(3*guess4*guess4);
        
        //Printing out the results of the guess and cofirming the answer to the user
        System.out.println("The cube root is " +guess5+ ".");
        System.out.println(+guess5+"*"+guess5+"*"+guess5+"="+guess5*guess5*guess5+".");
        
    }// end of method
}//end of class