package oop.inheritance;

import oop.BirthInformation;
import oop.immutable.Name;

/**
 * Example of a physics teacher.
 */
public class PhysicsTeacher extends Teacher {

    private static String QUALIFICATION = "Physics";

    public PhysicsTeacher(Name name, BirthInformation birth) {
        super(name, birth, QUALIFICATION);
    }

    public String teach() {
        return "I teach " + QUALIFICATION;
    }
}
