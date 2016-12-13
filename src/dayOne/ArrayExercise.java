package dayOne;

/**
 * Created by Joe on 12/12/2016.
 */
public class ArrayExercise {

    class Dog {
        String name;


        Dog(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        int months[];
        months = new int[13];
        //not resize
        //immutable - cannot change, modify
        //doesn't sort by itself

        months[0] = 31;
        months[1] = 28;
        months[2] = 31;
        months[3] = 30;
        months[4] = 31;
        months[5] = 30;
        months[6] = 31;
        months[7] = 31;
        months[8] = 31;
        months[9] = 30;
        months[10] = 31;
        months[11] = 30;
        months[12] = 31;

        for(int value: months) {

            System.out.println("Days in month " + value);
        }

        for(int value : months) {
        if(value == 28)
            System.out.println("Its feb");

        }

        int[] data = {1,2,3,4,5,1};
        firstLast(data);
        System.out.println(firstLastSame(data));


        }

    static boolean firstLast(int[] input) {
        return (input[0] == 6) || (input[input.length - 1] == 6);


    }

    static boolean firstLastSame(int[] input) {

    return (input.length >=1) && (input[0] == input[input.length-1]);
    }

    static boolean commonEnd(int[] a1, int[] a2) {

    return (a1[0] == a2[0]) || (a1[a1.length-1] == a2[a2.length-1]);=
    }


 }
