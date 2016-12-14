package employeeProgramme.behaviours;

import employeeProgramme.employeeProgramme.models.Employee;

/**
 * Created by Joe on 13/12/2016.
 */
public class EmployeeFirstNamePredicate implements EmployeePredicate {
    @Override
    public boolean test(Employee employee, String input) {
        return employee.getFirstName().equalsIgnoreCase(input);
    }
}
