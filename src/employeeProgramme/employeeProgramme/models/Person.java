package employeeProgramme.employeeProgramme.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by Joe on 13/12/2016.
 */
public abstract class Person {
    //fields
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dob;

    //final value
    private final int NOT_BORN = 0;

    //Constructors
    public Person() {}

    public Person(int id, String firstName, String lastName, LocalDate dob) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    //getters and setters (Properties)


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    //methods
    public long getAge() {
        if (dob == null)
            return NOT_BORN;
        long years = ChronoUnit.YEARS.between(dob,LocalDate.now());
        return years;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s %s %s" , this.id, this.firstName, this.lastName, this.getAge());
    }
}
