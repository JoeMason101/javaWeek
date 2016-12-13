package dayOne;

/**
 * Created by Joe on 12/12/2016.
 */
public class Looping {

    public static void main(String[] args) {
        String[] data = {"A","B","C","D"};
        //while, do while
        whileLoop(data);
        doWhile(data);

        //for
    forLoop(data);
        //foreach
    }

    static void whileLoop (String[] input) {
        int index = 0;
        while (index  < input.length) {
            if (input[index].equals("B")) {
                System.out.println("FOUND!");
                break;
            }
            index++;
        }
    }

    static void doWhile(String[] input) {
        int index = 0;

        do {
            if(input[index].equals("C"))
                System.out.println(input[index]);
            index++;
        } while (index < input.length);

    }

    static void forLoop(String[] input) {
        //initializer, Conditions, incrementer
        String result = "";
        for(int i =0; i < input.length; i++) {
            System.out.println(input[i]);
            result += String.format(input[i] + " ");
        }
        System.out.println(result);
    }


}
