package addressBookProgramme.behaviours;

import addressBookProgramme.models.Contact;

/**
 * Created by Joe on 14/12/2016.
 */
public class ContactLastNamePredicate implements AddressBookPredicate {
    @Override
    public boolean test(Contact contact, String input) {
        return contact.getPerson().getLastName().equalsIgnoreCase(input);
    }
}
