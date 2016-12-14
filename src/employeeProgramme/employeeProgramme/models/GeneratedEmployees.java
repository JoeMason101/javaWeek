package employeeProgramme.employeeProgramme.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joe on 13/12/2016.
 */
//fake database
public class GeneratedEmployees {
    public static List<Employee> employees = new ArrayList<>();

    public static void createEmployees() {

        Employee alex = new Employee(1,"Alex","Kennedy", LocalDate.of(1983,4,16)
                ,"JIT001", LocalDate.of(2010,10,10),"Senior Trainer");

        Employee joe = new Employee(2,"Joe","Mason", LocalDate.of(1997,9,6), "JIT002",
                LocalDate.of(2016,12,12),"Trainee");

        Employee dana = new Employee(3,"Dana","Scullyy", LocalDate.of(1964,4,23)
                ,"JIT003", LocalDate.of(2010,10,10),"FBI Agent");

        Employee david = new Employee(4,"Alex","Beckham", LocalDate.of(1979,7,16), "JIT004",
                LocalDate.of(2016,12,12),"Footballer");

        employees.add(alex);
        employees.add(joe);
        employees.add(dana);
        employees.add(david);

    }
}
