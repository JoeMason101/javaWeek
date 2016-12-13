package dayOne;

import java.util.Scanner;

/**
 * Created by Joe on 12/12/2016.
 */
public class Light {
    //Evenson estimated that  299/792/458 metres/second
    static final int lightspeed = 187370;
    static long days;
    static long seconds;
    public  static void main(String[] args)  {

        //Scanner util
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of days; ");
        days = input.nextLong();


        System.out.println("in " + days + " days,  Light will travel about " + lightSpeedCalculator(days) + " miles");

    }
    static long lightSpeedCalculator(long days) {
        seconds = days * 24 * 60 * 60;
        return lightspeed * seconds;
    }
}
