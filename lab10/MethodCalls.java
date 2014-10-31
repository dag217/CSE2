//David Galaydick
//CSE2
//10/31/2014

//Calling methods
//add a single digit onto a number and pasting together numbers

public class MethodCalls{
    
    //start of addDigit method
    public static int addDigit(int a, int b){
        
        //inputs are (number,digit)
        
        //returns the number if the digit added is more than a single digit
        if (b > 9 || b < 0) return a;
        
        //establishing variable
        Boolean a_neg = false;
        //Boolean b_neg = false; //nevermind
        
        
        //testing if the number is negative and making it positive so it adds properly
        if (a <  0){
            a *= -1;
            a_neg = true;
        }
        
        //ignor this I guess
        /*if (b < 0){
            b *= 1;
            b_neg = true;
        }*/
        
        //making a variable so that we can mess with the value of a without changing a
        int c = a;
        
        //a do while so it considers the situation where the number was 0
        //keeps increasing b by a power of ten and counting the number of digits in c by continually dividing it by 10 until it deems the int to be 0
        do {
            b *= 10;
            c /= 10;
        }while (c > 0);
        
        //factoring in if the number was negative and returning a negative
        if (a_neg == true){
            return -(b+a);
        }
        
        //or if it was all positive, we're good
        else return b+a;

    }//end of addDigit method
    
    //start of join method
    public static int join(int x, int y){
        
        //checking if either of the inputs were negative
        Boolean x_neg = false;
        Boolean y_neg = false;
        
        //adjusting the inputs to be positive for the calculations
        if (x < 0){
            x *= -1;
            x_neg = true;
        }
        
        if (y < 0){
            y *= -1;
            y_neg = true;
        }
        
        //adding the first number to the second digit by digit
        do {
            y = addDigit(y,x%10);
            x /= 10;
        }while (x >0);
        
        //if only one of them is negative, returns a negative, otherwise returns a positive
        if (x_neg == true ^ y_neg == true) return -y;
        else return y;
        
    }//end of join method
    
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
} 


/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
