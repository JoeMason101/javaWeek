package dayOne;

import java.util.Scanner;

/**
 * Created by Joe on 12/12/2016.
 */
public class binaryToDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Binary Values");
        ConvertBinary(input.nextLine());

    }

    static void ConvertBinary(String binary) {
        int result = 0, mult = 1;

        for(int i = binary.length() - 1; i >= 0; i--) {
            if(binary.charAt(i)== '1') {
                result += mult;


                mult = mult * 2;


            }

        }
        System.out.println("Decimal value is " + result);
    }
}
