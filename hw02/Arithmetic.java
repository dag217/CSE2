//David Galaydick
//CSE2
//9/9/14
//Arithmetic for fun and profit

//Print out on seperate lines the item being bought, how many being bought, and the cost of the item
//Then print out the total cost (before tax), the total sales task, and the total cost (including sales tax)

//define a class
public class Arithmetic{
    
    //main method for starting Java programs
    public static void main(String[] args){
        
        //number of socks and price
        int nSocks=3;
        double sockCost$=2.58;
        
        //number of drinking glasses and price
        int nGlasses=6;
        double glassesCost$=2.29;
        
        //number of envelopes and price
        int nEnvelopes=1;
        double envelopeCost$=3.25;
        
        //good ol' PA sales tax
        double taxPercent=0.06;
        
        //printing the number product names along with how many we're buying and the price
        System.out.println("We buying socks.");
        System.out.println("How many socks? " +nSocks+ " socks.");
        System.out.println("And we paying $" +sockCost$+ " per sock.");
        
        System.out.println("We also buying some drinking glasses.");
        System.out.println("How many? Well, we need " +nGlasses+ " of them.");
        System.out.println("They cost $" +glassesCost$+ " per glass. What a steal!");
        
        System.out.println("Finally, we shall be purchasing envelopes.");
        System.out.println("We are buying only " +nEnvelopes+ " envelope.");
        System.out.println("This envelope will cost $" +envelopeCost$+ ".");
        
        //calculations for the total cost, sales tax, and the total cost with sales tax
        double total_cost = (nSocks*sockCost$)+(nGlasses*glassesCost$)+(nEnvelopes*envelopeCost$);
        double tax = total_cost*taxPercent;
        double total_cost_with_tax = total_cost + tax;
        
        //printing out the previously calculated values and presenting them in proper format with 2 decimal places
        System.out.println("Total cost without tax is $" +total_cost+ ".");
        System.out.println("The sales tax is $" +(int)(tax*100)/100.0+ ".");
        System.out.println("The total cost including sales tax is $" +(int)(total_cost_with_tax*100)/100.0+ ".");
    
    //end the main method    
    }
    
//end the class    
}