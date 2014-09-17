//David Galaydick
//CSE2
//9/14/2014

//Enter the time of a cycling trip and the number of counts on the cyclometer to determine the distance and the average speed of the trip

//import the scanner
import java.util.Scanner;

//define the class
public class Bicycle{
    
    //start the main method
    public static void main(String[] args){
        
       
       //declare the scanner
       Scanner scanner;
       scanner = new Scanner (System.in);
       
       //ask user to input time of the trip
       System.out.print("Input the time of the trip in seconds: ");
       int time = scanner.nextInt();
       
       //ask user for number of wheel rotations
       System.out.print("Input the number of counts on the cyclometer: ");
       int counts = scanner.nextInt();
       
       //declaring neceassry variables for computation
       int wheel_diameter = 27;
       double pi = 3.14159;
       int inches_per_mile = 12;
       int feet_per_mile = 5280;
       int seconds_per_minute = 60;
       int minutes_per_hour = 60;
       
       //calculate the distance travelled, average speed, and the time in minutes
       double distance = (pi*wheel_diameter*counts)/inches_per_mile/feet_per_mile;
       double average_speed = distance*(seconds_per_minute*minutes_per_hour)/time;
       double time_in_minutes = time/seconds_per_minute;
       
       //print the distance the cyclist traveled
       System.out.println("The distance of the trip was " +(int)(distance*100)/100.0+ " miles, and it took " +time_in_minutes+ " minutes.");
       System.out.println("The average speed was " +(int)(average_speed*100)/100.0+ " mph.");
       
       //System.out.printf("The distance of the trip was %1.2f miles, and %1.2f minutes. \n",distance,time_in_minutes);
       
    }//end the method
}//end the class