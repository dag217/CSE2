//David Galaydick
//CSE2
//10/31/2014

//User inputs a number and the program goes through a bunch of methods to print out a triangular stack of the numbers for fun

import java.util.Scanner;
public class BlockedAgain {
    
    //int get method
    public static int getInt(){
        
        //declare scanner
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter an int between 1 and 9 inclusive: ");
        
        //calling the checkInt method where the user inputs and it yells at them if they put in a non int
        int x = checkInt(scan);
        int num_to_check = checkRange(x);
        
        return num_to_check;
        
        
    }
    
    //checkInt method
    //all the reading of the user input happens here
    //gives a return once the user gives an int
    public static int checkInt(Scanner scan){
        
        while (!scan.hasNextInt()){
            scan.next();
            System.out.print("Twasn't an int. Try again: ");
        }
        
        return scan.nextInt();
        
    }
    
    //checkRange method
    //takes the input from checkInt, then yells at the user if they aren't inputting in the right range
    public static int checkRange (int x){
        
        //declare Scanner because it might need it later in this method
        Scanner scan = new Scanner (System.in);
        
        //setting the input to a number we can change later
        int y = x;
        
        //checks the range and calls the checkInt function to make the user try to input again
        while (y > 9 || y < 1){
            System.out.print("Number wasn't in the range. Try once more: ");
            y = checkInt(scan);
        }
        
        //returns the users good input
        return y;
        
    }
    
    //the allBlocks method
    public static void allBlocks(int input){
        
        //a counter set to determine what block we're on
        // keeps going until it gets to the user's number
        for (int counter = 1; counter <=  input; counter++){
            block(counter,input);
        }
        
        return;
    }
    
    //line method
    public static void line(int print_number, int input){
        
        //declaring variables that determine how much space is needed, and how many times the digit will be printed
        int indent = input - print_number;
        int number_spots = (2*print_number) - 2;
        
        //prints the right indent
        for (int indent_counter = 0; indent_counter <= indent; indent_counter++){
            System.out.print(" ");
        }
        
        //prints the right amount of numbers
        for (int spots_counter = 0; spots_counter <= number_spots; spots_counter++){
            System.out.print(print_number);
        }
        
        //new line so the final product looks like what it's supposed to look like
        System.out.println();
        
        return;
    }
    
    //line method again
    //overloaded with a string so it differentiates between this and the other instance of this method
    public static void line(int dash_number, String dash, int input){
        
        //same as the last line method with slightly different variable names
        int indent = input - dash_number;
        int dash_spots = (2*dash_number)-2;
        
        //prints the right number of dashes
        for (int indent_counter = 0; indent_counter <= indent; indent_counter++){
            System.out.print(" ");
        }
        
        //prints the right number of dashes
        for (int spots_counter = 0; spots_counter <= dash_spots; spots_counter++){
            System.out.print(dash);
        }
        
        System.out.println();
        
        return;
        
    }
    
    //the block method
    public static void block(int block_number, int input){
        
        //prints the right number of lines in the block based on what block number it's on
        for (int counter = 1; counter <= block_number; counter++){
            line (block_number,input);
        }
        
        //calling the line method again to print the dashes
        line(block_number,"-",input);
        
        return;
    }
    
    //I changed the method by making the spacing more aesthetically pleasing
    //I hope that's acceptable
    public static void main(String[] s) {
        
        int m;
        
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
        
    }
}