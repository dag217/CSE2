//David Galaydick
//CSE2
//10/24/2014

//info

//import scanner
import java.util.Scanner;

//starting the class
public class Methods{
    
    //starting integer fetching method
    public static int getInt(Scanner scan){
        System.out.print("Enter and int- ");
        
        //making sure user input an integer, and reprompting them if they did not
        while (!scan.hasNextInt()){
            scan.next();
            System.out.print("Enter an integer this time... ");
        }
        return scan.nextInt();
    }
    
    //method that prints the larger of the two inputs
    public static int larger(int x, int y){
        if (x > y) return x;
        else return y;
        
    }
    
    public static Boolean ascending(int first, int second, int third){
        
        return first <= second && second <= third;
        
    }
    
    public static void main(String[] arg){
        Scanner scan = new Scanner (System.in);
        int a,b,c;
        System.out.println("Enter three ints ");
        a = getInt(scan);
        b = getInt(scan);
        c = getInt(scan);
        System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
        System.out.println("The larger of "+a+", "+b+", and " +c+" is "+larger(a,larger(b,c)));
        System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+", and "+c+" are in ascending order.");
    }
}