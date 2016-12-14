package addressBookProgramme.main;

import addressBookProgramme.behaviours.AddressBookPredicate;
import addressBookProgramme.behaviours.ContactFirstNamePredicate;
import addressBookProgramme.behaviours.ContactLastNamePredicate;
import addressBookProgramme.behaviours.EmailPredicate;
import addressBookProgramme.models.Address;
import addressBookProgramme.models.Contact;
import addressBookProgramme.models.Person;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
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
       if (result.isEmpty())
           result = searchByString(new ContactFirstNamePredicate(), input);
        if (result.isEmpty())
            result = searchByString(new ContactLastNamePredicate(), input);

        if(result.size() >=1)
            return result;

        return null;
    }

    public static String createNew(List<String> data) {
        try {
            Contact temp = new Contact(new Person(data.get(0),data.get(1),data.get(2)),
                    new Address(data.get(3),data.get(4),Integer.parseInt(data.get(5))),
                    data.get(6),
                    data.get(7),
                    data.get(8),
                    data.get(9)


            );
            contacts.add(temp);
            return "SUCCESSFULLY add" + temp;
        } catch (Exception e) {
            return  "FAILURE; " + e;
        }

    }

    public static void sortByFirstName(){
        contacts.sort(new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getPerson().getFirstName().compareTo(o2.getPerson().getFirstName());
            }
        });

    }

    public static void sortByLastName() {
        contacts.sort(((o1, o2) -> o1.getPerson().getLastName().compareTo(o2.getPerson().getLastName())));
    }

}
