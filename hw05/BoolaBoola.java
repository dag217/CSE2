//David Galaydick
//CSE2
//9/29/2014

//Boola Boola for fun and/or profit

//importing scanner
import java.util.Scanner;

//starting the class
public class BoolaBoola {
    
    //starting main method
    public static void main(String[] args){
        
        //define the scanner
        Scanner scanner;
        scanner = new Scanner (System.in);
        
        //defining the true/false values to be presented to the user
        boolean thing1 = Math.random()>.5;
        boolean thing2 = Math.random()>.5;
        boolean thing3 = Math.random()>.5;
        
        //defining what will eventually become the operators presented to the user
        boolean op1 = Math.random()>.5;
        boolean op2 = Math.random()>.5;
        
        String response;
        boolean expression_result;
        int result = 0;

        
        //case 1 - both operators are &&
        if (op1 == true && op2 == true){
            System.out.print("Does " +thing1+ " && " +thing2+ " && " +thing3+ " have the value true (input T or t) or false (input F or f)? ");
            response = scanner.next();
            expression_result = thing1 && thing2 && thing3;
            //determining the truth of the result and evaluating an int based on whether it's true or false
            if (expression_result == true) result = 1;
            else if (expression_result == false) result = 2;
            
            
            //checking the expression's value
            switch (result){
                
                //if it was true
                case 1:
                    
                    //seeing if the user input a true
                    switch (response){
                        
                        case "T":
                        case "t":
                            System.out.println("That's correct.");
                            break;
                            
                        default:
                            System.out.println("You're either wrong or you've entered an invalid response.");
                            return;
                        
                    }//end of expression true switch statement
                    break;
                    
                //if it was false
                case 2:
                    
                    //seeing if the user input a false
                    switch (response){
                    
                    case "F":
                    case "f":
                        System.out.println("That's correct.");
                        break;
                        
                    default: 
                        System.out.println("You're either wrong or you've entered an invalid response.");
                        return;
                        
                    }//end of expression false switch statement
                    break;
                    
            }//end of 1st possibility switch statement
            
        }//end of 1st posssibility if statement
        
        //op1 is && and op2 is ||
        else if (op1 == true && op2 == false){
            System.out.print("Does " +thing1+ " && " +thing2+ " || " +thing3+ " have the value true (input T or t) or false (input F or f)? ");
            response = scanner.next();
            expression_result = thing1 && thing2 || thing3;
            //determining the truth of the result and evaluating an int based on whether it's true or false
            if (expression_result == true) result = 1;
            else if (expression_result == false) result = 2;
            
            //checking the expression's value
            switch (result){
                
                //if it was true
                case 1:
                    
                    //seeing if the user input a true
                    switch (response){
                        
                        case "T":
                        case "t":
                            System.out.println("That's correct.");
                            break;
                            
                        default:
                            System.out.println("You're either wrong or you've entered an invalid response.");
                            return;
                        
                    }//end of expression true switch statement
                    break;
                    
                //if it was false
                case 2:
                    
                    //seeing if the user input a false
                    switch (response){
                    
                    case "F":
                    case "f":
                        System.out.println("That's correct.");
                        break;
                        
                    default: 
                        System.out.println("You're either wrong or you've entered an invalid response.");
                        return;
                        
                    }//end of expression false switch statement
                    break;
                    
            }//end of 2nd possibility switch statement
            
        }//end of 2nd possibility if statement
        
        //op1 is || and op2 is &&
        else if (op1 == false && op2 == true){
            System.out.print("Does " +thing1+ " || " +thing2+ " && " +thing3+ " have the value true (input T or t) or false (input F or f)? ");
            response = scanner.next();
            expression_result = thing1 || thing2 && thing3;
            //determining the truth of the result and evaluating an int based on whether it's true or false
            if (expression_result == true) result = 1;
            else if (expression_result == false) result = 2;
            
            //checking the expression's value
            switch (result){
                
                //if it was true
                case 1:
                    
                    //seeing if the user input a true
                    switch (response){
                        
                        case "T":
                        case "t":
                            System.out.println("That's correct.");
                            break;
                            
                        default:
                            System.out.println("You're either wrong or you've entered an invalid response.");
                            return;
                        
                    }//end of expression true switch statement
                    break;
                    
                //if it was false
                case 2:
                    
                    //seeing if the user input a false
                    switch (response){
                    
                    case "F":
                    case "f":
                        System.out.println("That's correct.");
                        break;
                        
                    default: 
                        System.out.println("You're either wrong or you've entered an invalid response.");
                        return;
                        
                    }//end of expression false switch statement
                    break;
                    
            }//end of 3rd possibility switch statement
            
        }//end of 3rd possibility if statement
        
        //op1 is || and op2 is ||
        else if (op1 == false && op2 == false){
            System.out.print("Does " +thing1+ " || " +thing2+ " || " +thing3+ " have the value true (input T or t) or false (input F or f)? ");
            response = scanner.next();
            //determining the truth of the result and evaluating an int based on whether it's true or false
            expression_result = thing1 || thing2 || thing3;
            if (expression_result == true) result = 1;
            else if (expression_result == false) result = 2;
            
            //checking the expression's value
            switch (result){
                
                //if it was true
                case 1:
                    
                    //seeing if the user input a true
                    switch (response){
                        
                        case "T":
                        case "t":
                            System.out.println("That's correct.");
                            break;
                            
                        default:
                            System.out.println("You're either wrong or you've entered an invalid response.");
                            return;
                        
                    }//end of expression true switch statement
                    break;
                    
                //if it was false
                case 2:
                    
                    //seeing if the user input a false
                    switch (response){
                    
                    case "F":
                    case "f":
                        System.out.println("That's correct.");
                        break;
                        
                    default: 
                        System.out.println("You're either wrong or you've entered an invalid response.");
                        return;
                        
                    }//end of expression false switch statement
                    break;
                    
            }//end of 4th possibility switch statement
            
        }//end of 4th possibility if statement

        
    }//end of main method
    
}//end of class