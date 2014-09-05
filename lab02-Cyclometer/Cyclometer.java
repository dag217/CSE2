//David Galaydick
//CSE2
//9/4/2014

//define a class
public class Cyclometer{
    
    //main method for starting Java programs
    public static void main(String[] args){
        
        //input data
        int secsTrip1=480; //length of the first trip
        int secsTrip2=3220; //length of the second trip
        int countsTrip1=1561; //number of rotations of the wheel in the first trip
        int countsTrip2=9037; //number of rotations of the wheel in the second trip
        
        //intermediate variables and output data variables
        double wheelDiameter=27.0; //diameter of a wheel
        double PI=3.14159; // the value of Pi
        int feetPerMile=5280; // number of feet in a mile
        int inchesPerFoot=12; // number of inches in a foot
        int secondsPerMinute=60; // number of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //declaring three variables but not assigning them a variable
        
        //printing out the variables storing number of seconds and the counts
        System.out.println("Trip 1 took "+secsTrip1/secondsPerMinute+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+secsTrip2/secondsPerMinute+" minutes and had "+countsTrip2+" counts.");
        
        //calculations for the previously undefined variables
        distanceTrip1=countsTrip1*wheelDiameter*PI; //gives the distance in inches
        distanceTrip1/=inchesPerFoot*feetPerMile; //Gives the distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //distance 2 in miles
        totalDistance=distanceTrip1+distanceTrip2; //distance of both trips combined
        
        //printing the output data
        System.out.println("Trip 1 was " +distanceTrip1+ " miles."); //prints the distance of trip 1
        System.out.println("Trip 2 was " +distanceTrip2+ " miles."); //prints the distance of trip 2
        System.out.println("The total distance was " +totalDistance+ " miles.");//prints the total distance
        
    } //end of main method
} //end of class