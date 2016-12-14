package employeeProgramme.ui;

import employeeProgramme.employeeProgramme.main.TaskProcessing;
import employeeProgramme.employeeProgramme.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static employeeProgramme.employeeProgramme.models.GeneratedEmployees.employees;

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
                    System.out.println(TaskProcessing.createNew(inputDetails(null)));
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


                    }
                    break;
                case 4:
                    _edit = true;
                    input.nextLine();
                    TaskProcessing.listAllEmployees();
                    System.out.println("Enter ID to edit");
                    int index = TaskProcessing.searchByIndex(input.nextInt());
                    if(index == -1) {
                        System.out.println("Record does not exist!");
                    } else {
                        System.out.println(TaskProcessing.editEmployee(index,inputDetails(employees.get(index))));
                    }
                    _edit = false;
                    break;
                case 5:
                    TaskProcessing.listAllEmployees();
                    System.out.println("Enter an ID to remove");
                    int indexToRemove = TaskProcessing.searchByIndex(input.nextInt());
                    System.out.println(TaskProcessing.removeEmployee(indexToRemove));
                    break;
                case 6:
                    TaskProcessing.sortByFirstName();
                    TaskProcessing.listAllEmployees();
                    break;
                case 7:
                    _isRunning = false;


            }
        }
    }
    private static List<String> inputDetails(Employee current) {
        List<String> tempData = new ArrayList<>();
        input.nextLine();

        System.out.print("ID: " + (_edit ? current.getId() + "\nChange to" : ""));
        tempData.add(input.nextLine());

        System.out.print("First Name: " + (_edit ? current.getFirstName() + "\nChange to" : ""));
        tempData.add(input.nextLine());

        System.out.print("Last Name: " + (_edit ? current.getLastName() + "\nChange to" : ""));
        tempData.add(input.nextLine());

        System.out.print("Date of Birth (YYYY-MM-DD) : " + (_edit ? current.getDob() + "\nChange to" : ""));
        tempData.add(input.nextLine());

        System.out.print("Employee ID: " + (_edit ? current.getEmployeeId() + "\nChange to" : ""));
        tempData.add(input.nextLine());

        System.out.print("Hire Date (YYYY-MM-DD) : " + (_edit ? current.getHireDate() + "\nChange to" : ""));
        tempData.add(input.nextLine());

        System.out.print("Position : " + (_edit ? current.getPosition() + "\nChange to" : ""));
        tempData.add(input.nextLine());

        return tempData;
    }


}
