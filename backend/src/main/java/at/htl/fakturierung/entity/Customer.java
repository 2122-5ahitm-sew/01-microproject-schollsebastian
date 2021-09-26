package at.htl.fakturierung.entity;

public class Customer {
    public String firstName;
    public String lastName;
    public String street;
    public int houseNumber;
    public int zip;
    public String city;

    public Customer() {}

    public Customer(String firstName, String lastName, String street, int houseNumber, int zip, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zip = zip;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", zip=" + zip +
                ", city='" + city + '\'' +
                '}';
    }
}
