package employeeProgramme.ui;

import employeeProgramme.employeeProgramme.main.TaskProcessing;
import employeeProgramme.employeeProgramme.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Joe on 13/12/2016.
 */
public class CommandInterface {
    private static Scanner input = new Scanner(System.in);
    private static boolean _edit = false;

    //method to display command input ui

    public static void display() {
        int choice;
        boolean _isRunning = true;

        while (_isRunning) {
            do {
                System.out.println("Welcome to Employee Awesome BOOM programme");
                System.out.println("1. List All Employees");
                System.out.println("2. Add a new Employee");
                System.out.println("3. Search");
                System.out.println("4. Edit an Employee");
                System.out.println("5. Remove an Employee");
                System.out.println("6. Sort by FirstName");
                System.out.println("7. BOOM Terminate");
                System.out.print("Input an option: ");

                choice = input.nextInt();
                System.out.println();
            } while (choice < 1 || choice > 7);

            switch (choice) {
                case 1:
                    TaskProcessing.listAllEmployees();
                    break;
                case 2:
                    System.out.println(TaskProcessing.createNew(inputDetails()));
                    break;
                case 3:
                    System.out.println("Enter Search string: ");
                    input.nextLine();
                    List < Employee > result = TaskProcessing.search(input.nextLine());
                    if (result != null) {
                        for (Employee e: result)
                            System.out.println(e);
                    } else {
                        System.out.println("NOT FOUND!");
                        break;
                    }
                case 7:
                    _isRunning = false;


            }
        }
    }
    private static List<String> inputDetails() {
        List<String> tempData = new ArrayList<>();
        input.nextLine();

        System.out.print("ID: ");
        tempData.add(input.nextLine());

        System.out.print("First Name: ");
        tempData.add(input.nextLine());

        System.out.print("Last Name: ");
        tempData.add(input.nextLine());

        System.out.print("Date of Birth (YYYY-MM-DD) : ");
        tempData.add(input.nextLine());

        System.out.print("Employee ID: ");
        tempData.add(input.nextLine());

        System.out.print("Hire Date (YYYY-MM-DD) : ");
        tempData.add(input.nextLine());

        System.out.print("Position : ");
        tempData.add(input.nextLine());

        return tempData;
    }
}
