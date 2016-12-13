package dayOne;

import java.util.Scanner;

/**
 * Created by Joe on 12/12/2016.
 */
public class IfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an input");
        int i = input.nextInt();
        System.out.println("hello");

        System.out.printf("what size of ice-cream cone they like?\n" +
                "(1)Small - 1.25, (2)Medium - 2.25, (3)Large - 3.25, (4)Huge 4.00");
switchOperator(5,5,'+');

    switchOperatorTwo(i);


    }

 static String whichSeason(int month) {

     String season = "";
     if (month == 12 || month == 1 || month == 2)
         season = "Winter";
     else if (month == 3 || month == 4 || month == 5)
         season = "Spring";
     else if (month == 6 || month == 7 || month == 8)
         season = "Summer";
     else if (month == 9 || month == 10 ||month ==11)
     season = "Autumn";
     else
     season = "Begin month";

     return "the month of " + month + "is in" + season + ". ";
 }

 static String whatNumber(int number) {
     String yourNumber = "";

     if(number < 100 || number == 100)
         yourNumber = "Your number is between 0-100 0r 100";
     else if(number < 500 || number == 500)
         yourNumber = "Your number is between 101-500";
     else if(number < 1000 || number == 1000)
         yourNumber = "Your number is between 501-1000";
     else if (number > 1000)
         yourNumber = "Your number is beyond are scope";

     return yourNumber;


 }

 static String charTest(char letter) {
     String response = "";

     if(Character.isLetter(letter) || Character.isDigit(letter))
     {
         if(Character.isUpperCase(letter))
             response = "Your character is Uppercase";
         else if (Character.isLowerCase(letter))
             response = "Your character is lowercase";
         else if (Character.isDigit(letter))
             response = "Your char is a digit";

     } else

         response = "Not a correct character";
         return response;


 }

 static void switchOperator(int op1, int op2, char opr) {
     int result = 0;
     switch(opr) {
         case '+':
             result = op1 + op2;
             break;
         case '-':
             result = op1 - op2;
             break;
         case '/':
             result = op1/op2;
             break;
         case '*':
             result = op1 * op2;
             break;
         default:
             System.out.println("Unknown operator");
     }
     System.out.println("Result " + result);
 }


    static void switchOperatorTwo(int opr) {
        String result = "";
        switch(opr) {
            case 1:
                result = "Small - 1.25";
                break;
            case 2:
                result = "Medium 2.50";
                break;
            case 3:
                result = "Large - 3.75";
                break;
            case 4:
                result = "Small - 4.50";
                break;
            default:
                System.out.println("Unknown Size");
        }
        System.out.println("Cost is " + result);
    }



}