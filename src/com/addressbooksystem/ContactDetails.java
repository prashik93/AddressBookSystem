package com.addressbooksystem;

public class ContactDetails {
    private  String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;

    public ContactDetails(String firstName, String lastName, String address, String city, String state, String zip,
                          String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + address + " " + city + " "
                + state + " " + zip + " " + phone + " " + email;
    }
}
