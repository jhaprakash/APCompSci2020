package oop;

import oop.immutable.Name;
import oop.immutable.PhoneNumber;

public class Student {
    private Name name;
    private BirthInformation birth;
    private Address address;
    private PhoneNumber phone;
    private String grade;

    public Student(Name name, BirthInformation birth) {
        this.name = name;
        this.birth = birth;
    }

    public Name getName() {
        return name;
    }

    public Address getPlaceOfBirth() {
        return birth.getAddress();
    }

    public Address getCurrentAddress() {
        return address;
    }

    public void setCurrentAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhone() {
        return phone;
    }

    public void setPhone(PhoneNumber phone) {
        this.phone = phone;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
