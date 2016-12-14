package addressBookProgramme.main;

import addressBookProgramme.behaviours.AddressBookPredicate;
import addressBookProgramme.behaviours.EmailPredicate;
import addressBookProgramme.models.Contact;


import java.util.ArrayList;
import java.util.List;

import static addressBookProgramme.models.GeneratedContacts.contacts;

/**
 * Created by Joe on 13/12/2016.
 */
public class TaskProcessing {

    public static void listAllContacts() {
        // list them
        for( Contact c : contacts)  {
            System.out.println(c);
        }


    }


    public static List<Contact> searchByString(AddressBookPredicate p, String input) {
        List<Contact> result = new ArrayList<>();
        for (Contact e : contacts) {
            if (p.test(e, input))
                result.add(e);
        }
        return result;
    }


    public static List<Contact> search(String input) {
        List<Contact> result;
        result = searchByString(new EmailPredicate(), input);
   //     if (result.isEmpty())
 //           result = searchByString(new EmployeeLastNamePredicate(), input);

        if(result.size() >=1)
            return result;

        return null;
    }

}
