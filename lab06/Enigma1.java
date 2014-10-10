/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    Scanner scan;
    scan = new Scanner (System.in);
    if (scan.hasNextDouble()){
    double x= scan.nextDouble();
    
    if (x>=0 && x<=99){
    
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   if(x==7.0)  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    else if(x==41.0)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    else if(x==14.0)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    else if(x==33.0)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    else if(x==60.0)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
   }
   
   else {
     
     System.out.println("Outside range.");
     return;
     
   }
   
    }
   
   else{
     System.out.println("Invalid input.");
     return;
   }
  
    
  }
  
  
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *    Needed to account for user not entering a double or
 *    something outside of the range
 *    
 *    The if statements were unnecessarily convoluted. Just make the checking if x equals something.
 */