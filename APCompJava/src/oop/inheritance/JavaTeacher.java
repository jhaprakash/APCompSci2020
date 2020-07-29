package oop.inheritance;

import oop.BirthInformation;
import oop.immutable.Name;

/**
 * A java teacher class.
 *
 * Example: static method
 *
 */
public class JavaTeacher extends Teacher {

    private static String QUALIFICATION = "Java";

    public JavaTeacher(Name name, BirthInformation birth) {
        super(name, birth, QUALIFICATION);
    }

    public String teach() {
        return "I teach " + QUALIFICATION;
    }

    public static String getAuthor() {
        return "Bytes & Bots";
    }
}
