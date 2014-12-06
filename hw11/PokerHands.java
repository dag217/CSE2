//David Galaydick
//CSE 2
//12/5/2014

//Puts the user in the ideal situation for poker in which they get to choose all of their cards
//fun

import java.util.Scanner;
 
public class PokerHands{
    
    //method where the user GETS to enter the suit of their desired card
    public static int suit_pick(Scanner scan){
        
        //needed value
        String suit_response;
        
        //prompts user to decide what suit they want the card to be
        do{
            System.out.print("Enter a suit: 'C' 'D' 'H' or 'S'- ");
            suit_response = scan.next();
            
        }while (!suit_response.equals("C") && !suit_response.equals("D") && !suit_response.equals("H") && !suit_response.equals("S"));
        
        //returns a numerical value associated with each suit
        if (suit_response.equals("C")) return 0;
        if (suit_response.equals("D")) return 13;
        if (suit_response.equals("H")) return 26;
        if (suit_response.equals("S")) return 39;
        
        //in case it yells at me for the returns being conditional
        return 0;
        
    }
    
    //method where user GETS to enter the value of their card
    public static int num_pick(Scanner scan){
        
        String num_response;
        
        //prompts the user to enter the number/value/whatever of the card
        do{
            System.out.print("Enter the card value: 'A' 'K' 'Q' 'J' '10' '9' ... '2' - ");
            num_response = scan.next();
            
        //so many conditions...    
        }while(!num_response.equals("A") && !num_response.equals("K") && !num_response.equals("Q") && !num_response.equals("J") && !num_response.equals("10") && !num_response.equals("9") && !num_response.equals("8") && !num_response.equals("7") && !num_response.equals("6") && !num_response.equals("5") && !num_response.equals("4") && !num_response.equals("3") && !num_response.equals("2"));
        
        //returns numerical value based on user's input
        if (num_response.equals("A")) return 0;
        if (num_response.equals("K")) return 1;
        if (num_response.equals("Q")) return 2;
        if (num_response.equals("J")) return 3;
        if (num_response.equals("10")) return 4;
        if (num_response.equals("9")) return 5;
        if (num_response.equals("8")) return 6;
        if (num_response.equals("7")) return 7;
        if (num_response.equals("6")) return 8;
        if (num_response.equals("5")) return 9;
        if (num_response.equals("4")) return 10;
        if (num_response.equals("3")) return 11;
        if (num_response.equals("2")) return 12;
        
        //in case it yells at me
        return -1;
        
    }
    
    //method checking if the card is the user asked for is already in the hand
    public static Boolean is_there (int hand[][]) {
        
        //for loop to compare every element of the array with every element that follows
        for (int i = 0; i < 5; i++){
            
            //each time it loops, it compares it to another of the elements following element i
            for (int k = i + 1; k < 5; k++){
                
                //if the card is found in the hand, it'll return true
                if ((hand[i][0]+hand[i][1]) == (hand[k][0]+hand[k][1])) return true;
                
            }
            
        }
        
        //if not... it'll return false
        return false;
        
    }
    
    //method checking if the card is the user asked for is already in the hand
    public static int how_many (int hand[][]) {
        
        int count = 0;
        
        //for loop to compare every element of the array with every element that follows
        for (int i = 0; i < 5; i++){
            
            //each time it loops, it compares it to another of the elements following element i
            for (int k = i + 1; k < 5; k++){
                
                //if the card is found in the hand, it'll return true
                if (hand[i][1] == hand[k][1]) count += 1;
                
            }
            
        }
        
        //if not... it'll return false
        return count;
        
    }
    
    //a method that sorts the values in the hand
    //by the time we get to this, the suits stop mattering
    public static void sort_hand (int array[][]){
        
        //initializing thangsa
        int lower = 1234567;
        int temp = 12345;
        
        //selection sorting
        for (int i = 0; i < 5; i++){
            
            for (int k = 0; k < 5; k++){
                
                lower = k;
                
                for (int c = k + 1; c < 5; c++){
                    
                    if (array[lower][1] > array[c][1]) lower = c;
                    
                }
                
                //doing the actual switching of the two values
                temp = array[k][1];
                array[k][1] = array[lower][1];
                array[lower][1] = temp;
                
                
            }
        }
    }
    
    //checking for a pair, 3 of a kind or 4 of a kind
    public static int card_freq(int hand[][]){
        
        //we'll be returning this later
        int frequency = 0;
        
        //counter for an upcoming loop
        //stay tuned
        int i = 0;
        
        do{
                
            for (int k = i + 1; k < 5; k++){
                
                if (hand[i][1] == hand[k][1]){
                    hand[k][1] = -20 - k;   //it's served it's purpose. change the value so it doesn't get in the way later
                    frequency += 1;
                }
            }
            
            i++;
        
        }while(frequency == 0 && i < 5); //value would get messed up if any other numbers were tested
        
        //would return 1 if a pair, 2 if 3 of a kind, and 3 if 4 of a kind
        return frequency;
        
    }
    
    //the mainest
    public static void main(String[] args){
        
        //declare the scanner
        Scanner scan = new Scanner (System.in);
        
        //initializing the hand array
        int hand [][] = new int [5][2];
        
        //initializing the user's response
        String response;
        
        //asking user if they want to start in the first place
        System.out.print("Start a hand? Enter 'Y' or 'y'- ");
        response = scan.next();
        
        //if the user doesn't type Y or y, program ends
        if (!response.equals("Y") && !response.equals("y")) return;
        
        do{
            
            //booleans for all the possible hands
            // #prompt_forgot_3_of_a_kind
            Boolean royal = false;
            Boolean sflush = false;
            Boolean full = false;
            Boolean four_kind = false;
            Boolean flush = false;
            Boolean straight = false;
            Boolean three_kind = false;
            Boolean two_pair = false;
            Boolean pair = false;
            Boolean high = false;
        
        
            //it's clever, trust me
            //i need every value to be something different at the beginning
            for (int i = 0; i < 5; i++){
                hand[i][0] = -i;
                hand[i][1] = -i;
            }
        
            for (int i = 0; i < 5; i++){
                
                hand [i][0] = suit_pick(scan);
                hand [i][1] = num_pick(scan);
                
                if (is_there (hand) ) {
                    System.out.println("This deck is standard. One of each card");
                    i--;
                }
                
            }
            
            //for neatness
            System.out.println();
            
            //printing the what clubs cards are in the hand
            System.out.print("Clubs -");
            for (int i = 0; i < 5; i++){
                
                //making sure it's a clubs card, then prints the value if it is
                if (hand[i][0] == 0){
                    
                    switch (hand[i][1]){
                
                        //determining what the card's value is and printing it
                        case 0:
                            System.out.print(" A");
                            break;
                            
                        case 1:
                            System.out.print(" K");
                            break;
                            
                        case 2:
                            System.out.print(" Q");
                            break;
                            
                        case 3:
                            System.out.print(" J");
                            break;
                            
                        case 4:
                            System.out.print(" 10");
                            break;
                            
                        case 5: 
                            System.out.print(" 9");
                            break;
                            
                        case 6:
                            System.out.print(" 8");
                            break;
                            
                        case 7:
                            System.out.print(" 7");
                            break;
                            
                        case 8:
                            System.out.print(" 6");
                            break;
                            
                        case 9:
                            System.out.print(" 5");
                            break;
                            
                        case 10:
                            System.out.print(" 4");
                            break;
                            
                        case 11:
                            System.out.print(" 3");
                            break;
                            
                        case 12:
                            System.out.print(" 2");
                            break;
                            
                        default:
                            break;
                        
                    }
                    
                }
                
            }
            System.out.println();
            
            //printing the what diamonds cards are in the hand
            System.out.print("Diamonds -");
            for (int i = 0; i < 5; i++){
                
                //making sure it's a diamonds card, then prints the value if it is
                if (hand[i][0] == 13){
                    
                    switch (hand[i][1]){
                
                        //determining what the card's value is and printing it
                        case 0:
                            System.out.print(" A");
                            break;
                            
                        case 1:
                            System.out.print(" K");
                            break;
                            
                        case 2:
                            System.out.print(" Q");
                            break;
                            
                        case 3:
                            System.out.print(" J");
                            break;
                            
                        case 4:
                            System.out.print(" 10");
                            break;
                            
                        case 5: 
                            System.out.print(" 9");
                            break;
                            
                        case 6:
                            System.out.print(" 8");
                            break;
                            
                        case 7:
                            System.out.print(" 7");
                            break;
                            
                        case 8:
                            System.out.print(" 6");
                            break;
                            
                        case 9:
                            System.out.print(" 5");
                            break;
                            
                        case 10:
                            System.out.print(" 4");
                            break;
                            
                        case 11:
                            System.out.print(" 3");
                            break;
                            
                        case 12:
                            System.out.print(" 2");
                            break;
                            
                        default:
                            break;
                        
                    }
                    
                }
                
            }
            System.out.println();
            
            //printing the what hearts cards are in the hand
            System.out.print("Hearts -");
            for (int i = 0; i < 5; i++){
                
                //making sure it's a hearts card, then prints the value if it is
                if (hand[i][0] == 26){
                    
                    switch (hand[i][1]){
                
                        //determining what the card's value is and printing it
                        case 0:
                            System.out.print(" A");
                            break;
                            
                        case 1:
                            System.out.print(" K");
                            break;
                            
                        case 2:
                            System.out.print(" Q");
                            break;
                            
                        case 3:
                            System.out.print(" J");
                            break;
                            
                        case 4:
                            System.out.print(" 10");
                            break;
                            
                        case 5: 
                            System.out.print(" 9");
                            break;
                            
                        case 6:
                            System.out.print(" 8");
                            break;
                            
                        case 7:
                            System.out.print(" 7");
                            break;
                            
                        case 8:
                            System.out.print(" 6");
                            break;
                            
                        case 9:
                            System.out.print(" 5");
                            break;
                            
                        case 10:
                            System.out.print(" 4");
                            break;
                            
                        case 11:
                            System.out.print(" 3");
                            break;
                            
                        case 12:
                            System.out.print(" 2");
                            break;
                            
                        default:
                            break;
                        
                    }
                    
                }
                
            }
            System.out.println();
            
            //printing the what spades cards are in the hand
            System.out.print("Spades -");
            for (int i = 0; i < 5; i++){
                
                //making sure it's a spades card, then prints the value if it is
                if (hand[i][0] == 39){
                    
                    switch (hand[i][1]){
                
                        //determining what the card's value is and printing it
                        case 0:
                            System.out.print(" A");
                            break;
                            
                        case 1:
                            System.out.print(" K");
                            break;
                            
                        case 2:
                            System.out.print(" Q");
                            break;
                            
                        case 3:
                            System.out.print(" J");
                            break;
                            
                        case 4:
                            System.out.print(" 10");
                            break;
                            
                        case 5: 
                            System.out.print(" 9");
                            break;
                            
                        case 6:
                            System.out.print(" 8");
                            break;
                            
                        case 7:
                            System.out.print(" 7");
                            break;
                            
                        case 8:
                            System.out.print(" 6");
                            break;
                            
                        case 9:
                            System.out.print(" 5");
                            break;
                            
                        case 10:
                            System.out.print(" 4");
                            break;
                            
                        case 11:
                            System.out.print(" 3");
                            break;
                            
                        case 12:
                            System.out.print(" 2");
                            break;
                            
                        default:
                            break;
                        
                    }
                    
                }
                
            }
            System.out.println();
            
            //checking if all of the suit values are the same
            if (hand[0][0] == hand[1][0] && hand[0][0] == hand[2][0] && hand[0][0] == hand[3][0] && hand[0][0] == hand[4][0]) flush = true;
            
            //suit values don't matter any more, so we arrange the number part of the hand in order
            sort_hand(hand);
            
            //checking if the hand is in sequential order (straight)
            if (hand[0][1] == (hand[1][1] - 1) && hand[0][1] == (hand[2][1] - 2) && hand[0][1] == (hand[3][1] - 3) && hand[0][1] == (hand[4][1] - 4)) straight = true;
            
            //if it was a straight, see if it's also a flush
            if (straight == true && flush == true) sflush = true;
            
            //if it was a straight flush, then see if it's royal too
            if (sflush == true && hand[0][1] == 0) royal = true;
            
            
            
            int freq = card_freq(hand);
            
            if (freq == 3) four_kind = true;
            
            //assuming the first came out with a pair
            else if (freq == 1){
                
                int freq2 = card_freq(hand);
                
                //meaning another pair is here, so two pair
                if (freq2 == 1) two_pair = true;
                
                //meaning also a 3 of a kind, so full house
                else if (freq2 == 2) full = true;
                
                ///or just 1 pair
                else pair = true;
                
            }
            
            //assuming the first came out with a three of a kind
            else if (freq == 2){
                
                int freq2 = card_freq(hand);
                
                //meaning also a pair in there, so full house
                if (freq2 == 1) full = true;
                
                //or just 3 of a kind
                else three_kind = true;
                
            }
            
            //or the hand just has a high card
            else high = true;
            
            //printing the result, so many possibilities
            if (royal){
                System.out.println("The hand was a royal flush.");
                return;
            }
            
            if (sflush){
                System.out.println("The hand was a straight flush.");
                return;
            }
            
            if (four_kind){
                System.out.println("The hand was a 4 of a kind.");
                return;
            }
            
            if (full){
                System.out.println("The hand was a full house.");
                return;
            }
            
            if (flush){
                System.out.println("The hand was a flush.");
                return;
            }
            
            if (straight){
                System.out.println("The hand was a straight.");
                return;
            }
            
            if (three_kind){
                System.out.println("The hand was a 3 of a kind.");
                return;
            }
            
            if (two_pair){
                System.out.println("The hand was a two pair.");
                return;
            }
            
            if (pair){
                System.out.println("The hand was a pair.");
                return;
            }
            
            if (high){
                System.out.println("The hand had cards in it at least...");
                return;
            }
            
            System.out.print("Another hand? 'Y' or 'y' if you want one - ");
            response = scan.next();
        
        }while (response.equals("Y") || response.equals("y"));
        

    }//end of main method
    
}//end of class