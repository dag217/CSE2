import java.util.Scanner;
public class Enigma2{
  public static void main(String [] args){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 *  Needs to be "args" in method line
 *  Can't divide by 0 - line 9
 *  k isn't really doing anything in this program, but I guess I'll leave it there
 * 
 * 
 */

