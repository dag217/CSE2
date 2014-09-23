//David Galaydick
//CSE2
//9/22/2014

//Reads a 6-digit course number and prints a semester and year

//imports the scanner
import java.util.Scanner;

//starts the class
public class CourseNumber{
    
    //start the main method
    public static void main(String[] args){
        
        //declare the scanner
        Scanner scanner;
        scanner = new Scanner (System.in);
        
        //declare variable
        int course_number;
        int year;
        int semester;
        
        //user inputs a 6-digit course number
        System.out.print("Enter a six digit number giving the course semester: ");
        if (scanner.hasNextInt()){
            course_number = scanner.nextInt();
            year = (int)(course_number/100);
            semester = course_number%100;
            
            //checking if user input number in the correct range
            if (course_number >= 186510 && course_number <= 201440){
                
                //checking all of the viable semesters
                if (semester == 10){
                    System.out.println("The course was offered in the Spring semester of " +year+ ".");
                }
                
                else if (semester == 20){
                    System.out.println("The course was offered in the Summer 1 semester of " +year+ ".");
                }
                
                else if (semester == 30){
                    System.out.println("The course was offered in the Summer 2 semester of " +year+ ".");
                }
                
                else if (semester == 40){
                    System.out.println("the course was offered in the Fall semester of " +year+ ".");
                }
                
                //error message for invalid semester
                else {
                    System.out.println(semester+ " is not a legitimate semester.");
                    return;
                }
                
            }//end of if statement for checking the range
            
            //checking if user was doing the inputting of a number in the range
            else {
                System.out.println("That number is outside the range.");
                return;
            }
            
        }//end of checking for integer if statement
        
        //checking if user input an integer
        else {
            System.out.println("Not an integer.");
            return;
        }
        
    }// end of main method
    
}// end of class