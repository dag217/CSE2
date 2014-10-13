//David Galaydick
//CSE2
//10/11/2014

//Betting on a roulette 100 times on the same number. Run this scenario 100 times and determine the total winnings, how many times it results in a complete loss
//and how many times it results in any profit

//start class
public class Roulette{
    
    //start main method
    public static void main(String[] args){
        
        //declaring necessar variables
        int spins = 100;
        int sessions = 1000;
        int total_losses = 0;
        int sessions_with_profit = 0;
        int session_winnings = 0;
        int total_winnings = 0;
        int roulette_result = 0;
        int roulette_choice = 20;
        
        //going through 1000 sessions
        while (sessions > 0){
            
            //going through 100 spins in a session
            while (spins > 0){
                
                //spinning the roulette wheel
                roulette_choice = (int)(Math.random()*38);
                
                //comparing result with choice
                if (roulette_choice == roulette_result) session_winnings += 36;
                
                //decrementing the spin counter
                spins--;
                
            }//end of spins while loop
            
            //determining the results of the session
            if (session_winnings == 0) total_losses++;
            
            if (session_winnings > 100) sessions_with_profit++;
            
            //adding that session's profit to the total winnings
            total_winnings += session_winnings;
            
            //resetting session winnings
            session_winnings = 0;
            
            //restting the spin count
            spins = 100;
            
            //decrementing the session counter
            sessions--;
            
        }//end of sessions while loop
        
        System.out.println("Total winnings: " +total_winnings);
        System.out.println("Total complete losses: " +total_losses);
        System.out.println("Total sessions with profit: " +sessions_with_profit);
        
        
    }//end of main method
    
}//end of class