
//stuff we do all the time
import java.util.Scanner;

public class Lab11{
    
    public static void main(String[] args){
        
        Scanner scan_thangs = new Scanner (System.in);
        
        //setting up an int array with 10 elements
        int [] fun_array;
        fun_array = new int[10];
        
        //a prompt
        System.out.print("Input 10 ints: ");
        
        //the next 10 ints the user type will be put as the 10 elements of the array
        for (int i = 0; i < 10; i++){
            fun_array[i] = scan_thangs.nextInt();
        }
        
        //setting up stuff to compare in the next two loops
        int min = fun_array[0];
        int max = fun_array[0];
        
        //check to see if the next element of array is lower than the min
        //if it is, that number becomes the new min
        for (int i = 0; i < 10; i++){
            if (fun_array[i] < min) min = fun_array[i];
        }
        
        //same as before, except max
        for (int i = 0; i < 10; i++){
            if (fun_array[i] > max) max = fun_array[i];
        }
        
        //establishing a variable to work with
        int sum = 0;
        
        //adds each element of the array onto the sum
        for (int i = 0; i < 10; i++){
            sum += fun_array[i];
        }
        
        //establishes a new array to copy the previous one into
        int [] copy_array = new int [10];
        
        //puts elements of the first array as the elements of the next array in reverse order
        for (int i = 0; i < 10; i++){
            copy_array[i] = fun_array[9-i];
        }
        
        //shows the fruits of our labors
        System.out.println("The max value was: " +max);
        System.out.println("The min value was: " +min);
        System.out.println("The sum of the ints in this array is: " +sum);
        
        //prints the two arrays side by side
        //kind of assumes the user wasn't inputting enormous numbers
        for (int i = 0; i < 10; i++){
            System.out.print(fun_array[i] +"\t"+ copy_array[i]);
            System.out.println();
        }
        
    }
    
}