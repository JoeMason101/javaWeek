package addressBookProgramme.main;

import addressBookProgramme.models.GeneratedContacts;
import addressBookProgramme.models.Contact;
import addressBookProgramme.models.Person;
import addressBookProgramme.models.Address;
import addressBookProgramme.ui.CommandInterfaceC;

import java.util.List;

import static addressBookProgramme.models.GeneratedContacts.contacts;



/**
 * Created by Joe on 13/12/2016.
 */
public class main {

    public static void main(String[] args) {
        //sample data
        GeneratedContacts.createContacts();

        //list them

        List<Contact> result1 = TaskProcessing.search("joemas0n@hotmail.co.uk");

        for(Contact c : result1)
            System.out.println(c);

        CommandInterfaceC.display();

    }






}
