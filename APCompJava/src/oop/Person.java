package oop;

import oop.immutable.Name;
import oop.immutable.PhoneNumber;

public class Person {
    private Name name;
    private BirthInformation birth;
    private Address address;
    private PhoneNumber phone;

    public Person(Name name, BirthInformation birth) {
        this.name = name;
        this.birth = birth;
    }

    public Name getName() {
        return name;
    }

    public BirthInformation getBirth() {
        return birth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhone() {
        return phone;
    }

    public void setPhone(PhoneNumber phone) {
        this.phone = phone;
    }
}
