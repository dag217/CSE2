//David Galaydick
//CSE2
//11/15/2014

//User inputs 10 digits and the program informs them how if that list gad any duplicates
//and if the list had exactly one duplicate

import java.util.Scanner;

public class FindDuplicates {
    
    //method checking if there is at least one instance of a repeated element
    public static Boolean hasDups (int num[]) {
        
        //for loop to compare every element of the array with every element that follows
        for (int i = 0; i < 10; i++){
            
            //each time it loops, it compares it to another of the elements following element i
            for (int k = i + 1; k < 10; k++){
                
                //if any two elements match up, it'll return true
                if (num[i] == num[k]) return true;
                
            }
            
        }
        
        //if not... it'll return false
        return false;
        
    }
    
    //method checking if the array has EXACTLY one duplicate
    public static Boolean exactlyOneDup (int num[]) {
        
        //this method does the exact same thing as the previous one,
        //except it adds to a counter of how many duplicates were found
        //instead of return before checking everything
        //counter established here
        int duplicates = 0;
        
        //for loop to compare every element of the array with every element that follows
        for (int i = 0; i < 10; i++){
            
            //each time it loops, it compares it to another of the elements following element i
            for (int k = i + 1; k < 10; k++){
                
                //if any two elements match up, add to the total count of duplicates
                if (num[i] == num[k]) duplicates += 1;
                
            }
            
        }
        
        //if and only if the duplcates counter is at 1, it'll return true
        //otherwise it'll return false
        return (duplicates == 1);
        
    }
    
    public static void main(String[] arg) {
        
        Scanner scan = new Scanner(System.in);
        
        int num[] = new int[10];
        String answer = "";
        
        
        do {
            
            System.out.print("Enter 10 ints- ");
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt();
            }
            
            String out = "The array ";
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) {
                out += "has ";
            }
            
            else {
                out += "does not have ";
            }
            
            out += "duplicates.";
            System.out.println(out);
            out = "The array ";
            out += listArray(num);
            
            if (exactlyOneDup(num)) {
                out += "has ";
            }
            
            else {
                out += "does not have ";
            }
            
            out += "exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
            
        } while (answer.equals("Y") || answer.equals("y"));
    }

    public static String listArray(int num[]) {
        
        String out = "{";
        
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            
            out += num[j];
        }
        
        out += "} ";
        return out;
    }
}