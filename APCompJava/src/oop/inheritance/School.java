package oop.inheritance;

import oop.Address;
import oop.immutable.PhoneNumber;

public class School {
    private String name;
    private Address address;
    private PhoneNumber phone;

    public School (String name, Address address, PhoneNumber phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhone() {
        return phone;
    }
}
