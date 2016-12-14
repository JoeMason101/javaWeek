package employeeProgramme.behaviours;

import employeeProgramme.employeeProgramme.models.Employee;

/**
 * Created by Joe on 13/12/2016.
 */
//functional interface
public interface EmployeePredicate {
    //define behaviour
    boolean test(Employee employee, String input);

}
