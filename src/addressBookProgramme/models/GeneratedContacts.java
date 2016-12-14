package addressBookProgramme.models;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joe on 13/12/2016.
 */
public class GeneratedContacts {

    public static List<Contact> contacts = new ArrayList<>();

    public static void createContacts() {
        Contact c = new Contact(new Person("Joseph", "Mason", "King Mason"),new Address("CM35YU","Windward way", 3),
        "07495995899", "@KingMason", "JoeMas0n", "joemas0n@hotmail.co.uk");

        contacts.add(c);
    }
}
