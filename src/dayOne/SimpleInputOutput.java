package dayOne;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Joe on 12/12/2016.
 */
public class SimpleInputOutput {


    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        //read the first character
        char str = input.nextLine().charAt(0);
        System.out.println("using scanner " + str);
        System.out.println();
        System.out.print("Enter another string: ");
        String str2 = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            str2 = br.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Using InputStreamReader " + str2);

        //write to a txt file
        String filename = "example.txt";

        try {
            FileWriter fw = new FileWriter(filename);

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str2);
            bw.close();
        } catch (IOException ex) {
            System.out.println("Error writing to a file: [" + filename +"]");
            ex.printStackTrace();

        }
    }



}