package addressBookProgramme.models;

import java.time.LocalDate;

/**
 * Created by Joe on 13/12/2016.
 */
public class Person {

    //fields

    private String firstName;
    private String lastName;
    private String nickName;

    public Person() {

    }

    public Person(String firstName, String lastName,String nickName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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



    @Override
    public String toString() {
        return String.format("%s %s %s " , this.firstName, this.lastName, this.nickName);
    }


}
