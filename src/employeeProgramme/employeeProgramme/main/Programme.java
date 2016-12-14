package employeeProgramme.employeeProgramme.main;
import employeeProgramme.employeeProgramme.models.GeneratedEmployees;
import employeeProgramme.ui.CommandInterface;


/**
 * Created by Joe on 13/12/2016.
 */
public class Programme {
    public static void main(String[] args) {
        //sample data
        GeneratedEmployees.createEmployees();

        //TaskProcessing.listAllEmployees();

/*        List<Employee> result1 = TaskProcessing.search("Alex");
        for(Employee e : result1)
            System.out.println(e);

        List<Employee> result2 = TaskProcessing.search("Mason");
        for(Employee e 5: result2)
            System.out.println(e);

        List<Employee> result3 = TaskProcessing.search("FBI Agent");
        for(Employee e : result3)
            System.out.println(e);*/
        CommandInterface.display();

    }
}
