//David Galaydick
//CSE2
//10/12/2014

//program description

//import the scanner
import java.util.Scanner;

//begin class
public class Root {
    
    //begin main method
    public static void main(String[] args){
        
        //declare scanner
        Scanner scanner;
        scanner = new Scanner (System.in);
        
        //declaring needed variables
        double x = 0;
        double low = 0;
        double high = 0;
        double middle = 0;
        
        //prompt user to input a double
        System.out.print("Enter a double greater than 0: ");
        
        //making sure the user can read
        if (scanner.hasNextDouble()){
            
            //if the user can read, it'll check for what the double entered was
            x = scanner.nextDouble();
            
            //checking if user input was greater than 0
            if (x > 0){
                
                high = 1+x;
                
                //loops until the difference between low and high is very low
                while ((high-low) > .0000001){
                    
                    //determining the middle between the low and the high
                    middle = (high+low)/2;
                    
                    //if middle^2 is greater than x, the high becomes the middle, if not, the low becomes the middle
                    if (middle*middle > x) high = middle;
                    else low = middle;
                    
                }//end of while loop
                
                System.out.println("The square root of " +x+ " is " +middle);
                
            }//end of if statement for user following instructions
            
            //in case the user can't read
            else {
                System.out.println("You needed to input a double greater than 0.");
                return;
            }
            
        }//end of double check
        
        //in case the user can't read
        else {
            System.out.println("You needed to input a double.");
            return;
        }
        
    }//end of main method
    
}//end of class