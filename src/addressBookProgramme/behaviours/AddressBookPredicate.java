package addressBookProgramme.behaviours;

import addressBookProgramme.models.Contact;

/**
 * Created by Joe on 13/12/2016.
 */
public interface AddressBookPredicate {

    boolean test(Contact contact, String input);

}
