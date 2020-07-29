package oop;

import oop.immutable.Name;

public class BirthInformation {
    private Name name;
    private Address address;
    private String date;
    private String time;

    public BirthInformation(Name name, Address address, String date, String time) {
        this.name = name;
        this.address = address;
        this.date = date;
        this.time = time;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
