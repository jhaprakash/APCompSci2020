package oop.immutable;

/**
 * Name class to hold name of a person
 *
 * Example of immutable object, accessor method and toString.
 */
public class Name {
    private String first;
    private String middle;
    private String last;

    public Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String getFirstName() {
        return first;
    }

    public String getMiddleName() {
        return middle;
    }

    public String getLastName() {
        return last;
    }

    public String getFullName() {
        return first + " " + middle + " " + last;
    }

    @Override
    public String toString() {
        return getFullName();
    }
}
