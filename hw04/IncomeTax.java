//David Galaydick
//CSE2
//9/22/2014

//User inputs income in thousands and the program determines the tax percentage and the tax amount

//import the scanner
import java.util.Scanner;

//start the class
public class IncomeTax{
    
    //start the main method
    public static void main(String[] args){
        
        //declare the scanner
        Scanner scanner;
        scanner = new Scanner (System.in);
        
        //declaring the variable to be used
        int thousands;
        int income;
        
        //prompt user to enter an ineger
        System.out.print("Enter an integer giving the number of thousands: ");
        if (scanner.hasNextInt()){
            thousands = scanner.nextInt();
            income = thousands*1000; //determining what the income would actually be
            
            //if statements checking the user value and then printing out the appropriate tax percentage and tax
            if (thousands<20 && thousands >= 0){
                System.out.println("The tax rate on $" +income+ " is 5.0%, and the tax is $" +income*.05+ ".");
            }
            
            else if (thousands >= 20 && thousands < 40){
                System.out.println("The tax rate on $" +income+ " is 7.0%, and the tax is $" +income*.07+ ".");
            }
            
            else if (thousands >= 40 && thousands < 78){
                System.out.println("The tax rate on $" +income+ " is 12.0%, and the tax is $" +income*.12+ ".");
            }
            
            //this one had an obnoxious rounding error that yielded a long decimal with a lot of zeros, added the extra math into it to fix that
            else if (thousands >= 78){
                System.out.println("The tax rate on $" +income+ " is 14.0%, and the tax is $" +((income*.14)-((income*.14)%1))+ ".");
            }
            
            //ensruring the user input a positive integer
            else if (thousands < 0){
                System.out.println("You needed to input a positive integer.");
                return;
            }
            
        }
        
        //ensuring the user input and integer
        else {
            System.out.println("You needed to input an integer.");
            return;
        }
    }
}