package addressBookProgramme.models;

/**
 * Created by Joe on 13/12/2016.
 */
public class Contact {

    //fields
    private Person person;
    private Address address;
    private String phoneNumber;
    private String twitter;
    private String facebook;
    private String email;

    //default Constructor
    public Contact(Person person, Address address, String s) {}

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact(Person person, Address address, String phoneNumber, String twitter, String facebook, String email) {
        this.person = person;
        this.address = address;
        this.phoneNumber = phoneNumber;

        this.twitter = twitter;
        this.facebook = facebook;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s ", this.person.toString(), this.address.toString(), this.phoneNumber,
                this.twitter, this.facebook, this.email);
    }
}
