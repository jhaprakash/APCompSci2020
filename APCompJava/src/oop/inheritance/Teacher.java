package oop.inheritance;

import oop.BirthInformation;
import oop.immutable.Name;
import oop.Person;

/**
 * A teacher class inheriting from person.
 * Example: Inheritance
 */
public class Teacher extends Person {
    private School school;
    private String qualification;

    public Teacher(Name name, BirthInformation birth, String qualification) {
        super(name, birth);
        this.qualification = qualification;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getQualification() {
        return qualification;
    }

    public String teach() {
        return "I teach nothing";
    }
}
