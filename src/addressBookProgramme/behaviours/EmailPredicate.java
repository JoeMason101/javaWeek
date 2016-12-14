package addressBookProgramme.behaviours;

import addressBookProgramme.models.Contact;

/**
 * Created by Joe on 13/12/2016.
 */
public class EmailPredicate implements AddressBookPredicate {
    @Override
    public boolean test(Contact contact, String input) {
        return contact.getEmail().equalsIgnoreCase(input);
    }
}
