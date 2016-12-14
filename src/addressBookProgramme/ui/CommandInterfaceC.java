package addressBookProgramme.ui;




import addressBookProgramme.main.TaskProcessing;
import addressBookProgramme.models.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Joe on 13/12/2016.
 */
public class CommandInterfaceC {
    private static Scanner input = new Scanner(System.in);
    private static boolean _edit = false;

    //method to display command input ui

    public static void display() {
        int choice;
        boolean _isRunning = true;

        while (_isRunning) {
            do {
                System.out.println("Welcome to Address Book Programme Awesome BOOM programme");
                System.out.println("1. List All Contacts");
                System.out.println("2. Add a new Contact");
                System.out.println("3. Search");
                System.out.println("4. Edit a Contact");
                System.out.println("5. Remove a Contact");
                System.out.println("6. Sort by FirstName");
                System.out.println("7. BOOM Terminate");
                System.out.print("Input an option: ");

                choice = input.nextInt();
                System.out.println();
            } while (choice < 1 || choice > 7);

            switch (choice) {
                case 1:
                    TaskProcessing.listAllContacts();
                    break;
                case 2:
                    System.out.println(TaskProcessing.createNew(inputDetails()));
                    break;
                case 3:
                    System.out.println("Enter Search string: ");
                    input.nextLine();
                    List <Contact> result = TaskProcessing.search(input.nextLine());
                    if (result != null) {
                        for (Contact c: result)
                            System.out.println(c);
                    } else {
                        System.out.println("NOT FOUND!");
                        break;
                    }
                case 6:
                    TaskProcessing.sortByFirstName();
                    TaskProcessing.listAllContacts();
                    break;

                case 7:
                    _isRunning = false;


            }
        }
    }
    private static List<String> inputDetails() {
        List<String> tempData = new ArrayList<>();
        input.nextLine();

        System.out.print("First Name ");
        tempData.add(input.nextLine());

        System.out.print("Last Name: ");
        tempData.add(input.nextLine());

        System.out.print("Nick Name: ");
        tempData.add(input.nextLine());

        System.out.print("Post Code: ");
        tempData.add(input.nextLine());

        System.out.print("Street Name : ");
        tempData.add(input.nextLine());

        System.out.print("House Number: ");
        tempData.add(input.nextLine());

        System.out.print("Phone Number:  ");
        tempData.add(input.nextLine());

        System.out.print("Twitter : ");
        tempData.add(input.nextLine());

        System.out.print("Facebook : ");
        tempData.add(input.nextLine());

        System.out.print("Email : ");
        tempData.add(input.nextLine());

        return tempData;
    }
}
