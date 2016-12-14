package employeeProgramme.employeeProgramme.main;

import employeeProgramme.behaviours.EmployeeFirstNamePredicate;
import employeeProgramme.behaviours.EmployeeLastNamePredicate;
import employeeProgramme.behaviours.EmployeePositionPredicate;
import employeeProgramme.behaviours.EmployeePredicate;
import employeeProgramme.employeeProgramme.models.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static employeeProgramme.employeeProgramme.models.GeneratedEmployees.employees;

/**
 * Created by Joe on 13/12/2016.
 */
public class TaskProcessing {

    public static void listAllEmployees() {
        // list them
        for (Employee e : employees) {
            System.out.println(e);
        }


    }

    public static List<Employee> searchByString(EmployeePredicate p, String input) {
        List<Employee> result = new ArrayList<>();
        for (Employee e : employees) {
            if (p.test(e, input))
                result.add(e);
        }
        return result;
    }

    public static List<Employee> search(String input) {
        List<Employee> result;
        result = searchByString(new EmployeeFirstNamePredicate(), input);
        if (result.isEmpty())
            result = searchByString(new EmployeeLastNamePredicate(), input);
        if (result.isEmpty())
            result = searchByString(new EmployeePositionPredicate(), input);

        if(result.size() >=1)
            return result;

        return null;
    }


/*    public static List<Employee> searchByLastName(List<Employee> employees, String input) {
        List<Employee> result = new ArrayList<>();
        for(Employee e : employees) {
            if(e.getLastName().equalsIgnoreCase(input))
                result.add(e);
        }
        return result;
    }

    public static List<Employee> searchbyPosition(List<Employee> employees, String input) {
        List<Employee> result = new ArrayList<>();
        for(Employee e : employees) {
            if(e.getPosition().equalsIgnoreCase(input))
                result.add(e);
        }
        return result;
    }*/

    public static List<Employee> searchByFullName(List<Employee> employees, String fName, String lName) {
        List<Employee> result = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getFirstName().equalsIgnoreCase(fName) && e.getLastName().equalsIgnoreCase(lName))
                result.add(e);
        }
        return result;
    }

    public static String createNew(List<String> data) {
        try {
            String[] dob = data.get(3).split("-");
            String[] hireD = data.get(5).split("-");

            Employee temp = new Employee(
                    Integer.parseInt(data.get(0)),
                    data.get(1),
                    data.get(2),
                    LocalDate.of(Integer.parseInt(dob[0]),
                    Integer.parseInt(dob[1]),
                    Integer.parseInt(dob[2])),
            data.get(4),
            LocalDate.of(Integer.parseInt(hireD[0]),
            Integer.parseInt(hireD[1]),
            Integer.parseInt(hireD[2])),
            data.get(6)


            );
            employees.add(temp);
            return "SUCCESSFULLY add" + temp.getFirstName();
        } catch (Exception e) {
            return  "FAILURE; " + e;
        }

    }
}