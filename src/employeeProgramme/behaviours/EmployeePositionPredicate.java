package employeeProgramme.behaviours;

import employeeProgramme.employeeProgramme.models.Employee;

/**
 * Created by Joe on 13/12/2016.
 */
public class EmployeePositionPredicate implements EmployeePredicate {
    @Override
    public boolean test(Employee employee, String input) {
        return employee.getPosition().equalsIgnoreCase(input);
    }
}
