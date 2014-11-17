//David Galaydick
//CSE 2
//11/15/2014

//Simulates potential hands in poker
//Shows the odds of getting a single pair in a hand of poker
//Look at all the methods...

import java.util.Random;

import java.util.Scanner;

public class PokerOdds{
    
    public static void showHands(){
        
        //setting up the scanner and a string that'll be manipulated later
        Scanner scan = new Scanner (System.in);
        String answer = "";
        
        //setting up an array for the deck and hand
        int deck[] = new int[52];
        int hand[] = new int[5];
        
        //initializing everything in the hand to be -1
        for (int i = 0; i < 5; i++){
            hand [i] = -1;
        }
        
        //initializing the values of the deck
        for (int i = 0; i < 52; i++){
            deck[i] = (i + 1);
        }
        
        do {
        
            //see names of methods called for info
            deck_shuffle(deck);
            draw5(hand, deck);
            
            System.out.print("Clubs:     ");
            
            //checks every card in the hand to see if it's a clubs
            for (int i = 0; i < 5; i++){
                if ((hand[i]/13) == 0) clubs_card(hand[i]);
            }
            
            System.out.println();
            System.out.print("Diamonds:  ");
            
            //same as before, but with diamonds
            for (int i = 0; i < 5; i++){
                if ((hand[i]/13) == 1) diamonds_card(hand[i]);
            }
            
            System.out.println();
            System.out.print("Hearts:    ");
            
            //same as before, but with diamonds
            for (int i = 0; i < 5; i++){
                if ((hand[i]/13) == 2) hearts_card(hand[i]);
            }
            
            System.out.println();
            System.out.print("Spades:    ");
            
            //same as before, but with diamonds
            for (int i = 0; i < 5; i++){
                if ((hand[i]/13) == 3) spades_card(hand[i]);
            }
            
            System.out.println();
            
            //prompts user to experience the magic again
            System.out.print("Go again? Type Y or y, anything else to quit: ");
            answer = scan.next();
        
        //repeats this process until the user says not Y/y
        } while (answer.equals("Y") || answer.equals("y"));
        
        return;
        
    }
    
    public static void simulateOdds(){
        
        //we'll be using this variable later
        int x = -1;
        
        //setting up an array for the deck and hand
        int deck[] = new int[52];
        int hand[] = new int[5];
        
        //initializing everything in the hand to be -1
        for (int i = 0; i < 5; i++){
            hand [i] = -1;
        }
        
        //initializing the values of the deck
        for (int i = 0; i < 52; i++){
            deck[i] = (i + 1);
        }
        
        //all counters that we'll need later
        int ace_pair = 0;
        int king_pair = 0;
        int queen_pair = 0;
        int jack_pair = 0;
        int ten_pair = 0;
        int nine_pair = 0;
        int eight_pair = 0;
        int seven_pair = 0;
        int six_pair = 0;
        int five_pair = 0;
        int four_pair = 0;
        int three_pair = 0;
        int two_pair = 0;
        int total_single_pair = 0;
        
        //runs through 10000 hands and checks how many time it had only one pair
        //and what that pair was
        for (int i = 0; i < 10000; i++){
            
            deck_shuffle(deck);
            draw5(hand, deck);
            x = exactlyOnePair(hand); //does what the method it's calling does
            
            //adjusts the counters based on what the method returned
            switch (x){
                
                case 0:
                    ace_pair += 1;
                    total_single_pair +=1;
                    break;
                
                case 1:
                    king_pair += 1;
                    total_single_pair +=1;
                    break;
                    
                case 2:
                    queen_pair += 1;
                    total_single_pair +=1;
                    break;
                    
                case 3:
                    jack_pair += 1;
                    total_single_pair +=1;
                    break;
                    
                case 4:
                    ten_pair += 1;
                    total_single_pair +=1;
                    break;
                    
                case 5:
                    nine_pair += 1;
                    total_single_pair +=1;
                    break;
                    
                case 6:
                    eight_pair += 1;
                    total_single_pair +=1;
                    break;
                    
                case 7:
                    seven_pair += 1;
                    total_single_pair +=1;
                    break;
                    
                case 8:
                    six_pair += 1;
                    total_single_pair +=1;
                    break;
                    
                case 9:
                    five_pair += 1;
                    total_single_pair +=1;
                    break;
                    
                case 10:
                    four_pair += 1;
                    total_single_pair +=1;
                    break;
                    
                case 11:
                    three_pair += 1;
                    total_single_pair +=1;
                    break;
                    
                case 12:
                    two_pair += 1;
                    total_single_pair +=1;
                    break;
                    
                default:
                    break;
                
            }
            
        }
        
        //printing all of the results
        System.out.println("Rank \t Frequency of Exactly One Pair");
        System.out.println("  A  \t \t " +ace_pair);
        System.out.println("  K  \t \t " +king_pair);
        System.out.println("  Q  \t \t " +queen_pair);
        System.out.println("  J  \t \t " +jack_pair);
        System.out.println(" 10  \t \t " +ten_pair);
        System.out.println("  9  \t \t " +nine_pair);
        System.out.println("  8  \t \t " +eight_pair);
        System.out.println("  7  \t \t " +seven_pair);
        System.out.println("  6  \t \t " +six_pair);
        System.out.println("  5  \t \t " +five_pair);
        System.out.println("  4  \t \t " +four_pair);
        System.out.println("  3  \t \t " +three_pair);
        System.out.println("  2  \t \t " +two_pair);
        System.out.println("-------------------------------------");
        System.out.println("Total single pairs: " +total_single_pair);
        
        return;
        
    }
    
    //checks if the hand has exactly one pair and outputs an int based on what it was a pair of
    public static int exactlyOnePair(int hand[]){
        
        //necessary variables established as something that affects nothing unless changed
        int pairs = 0;
        Boolean single_pair = false;
        int output = -1;
        
        //checks each element of the hand against every other one
        for (int i = 0; i < 5; i++){
            
            for (int k = i + 1; k < 5; k++){
                
                //if they're the same, the pairs counter increases and the output is adjusted
                if (hand[i]%13 == hand[k]%13){
                    pairs += 1;
                    output = hand[k]%13;
                }
                
            }
            
        }
        
        //determines if there was only one pair after going through those loops
        single_pair = pairs == 1;
        
        //if there was only one pair, it'll return what it was a pair of
        if (single_pair) return output;
        
        //if there was no pair or more than one pair, it returns a number that means
        //nothing to the part of the code it's returning to
        else return 14;
        
    }
    
    //a method that determines what the value of the clubs card is and prints it
    public static void clubs_card(int x){
            
        switch (x%13){
            
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
        
        return;    
        
    }
    
    //a method that determines what the value of the hearts card is and prints it
    public static void hearts_card(int x){
            
        switch (x%13){
            
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
        
        return;    
        
    }
    
    //a method that determines what the value of the diamonds card is and prints it
    public static void diamonds_card(int x){
            
        switch (x%13){
            
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
        
        return;    
        
    }
    
    //a method that determines what the value of the spades card is and prints it
    public static void spades_card(int x){
            
        switch (x%13){
            
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
        
        return;    
        
    }
    
    //a method to shuffle the deck
    //I don't like the recommended method...
    //it seems excessive and roundabout
    //plus, it'd be like drawing cards from the middle of the deck
    //which is strange
    public static void deck_shuffle(int deck[]){
        
        //for good measure... gotta shuffle as well as possible...
        for (int c = 0; c < 100; c++){
        
            //loop to randomly swap cards in the deck
            for (int i = 0; i < 52; i++){
                
                //choose what card the current card will swap with
                int destination = (int) (52 * Math.random());
                
                //switch the two values
                int placeholder = deck[destination];
                deck[destination] = deck[i];
                deck[i] = placeholder;
                
            }
            
        }
        
        //video.bridge_shuffle.mp4
        
        //because we can't stay here for ever
        return;
        
    }
    
    //draws 5 from the shuffle deck
    //pretty self explanatory
    public static void draw5(int hand[], int deck[]){
        
        //makes the hand array elements the top 5 of the shuffled decks elements
        for (int i = 0; i < 5; i++){
            hand[i] = deck[i];
        }
        
        return;
        
    }
    
  public static void main(String [] arg){
      
    showHands();
    simulateOdds();
    
  }
  
}