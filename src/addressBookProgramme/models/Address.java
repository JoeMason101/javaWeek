package addressBookProgramme.models;

/**
 * Created by Joe on 13/12/2016.
 */
public class Address {

    //fields
    private String postCode;
    private int houseNumber;
    private String streetName;

    //default constructor
    public Address() {

    }

    public Address(String postCode, String streetName, int houseNumber) {
        this.postCode = postCode;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }




    @Override
    public String toString() {
        return String.format("%s %s  %s ", this.postCode, this.houseNumber,
                this.streetName);
    }
}
