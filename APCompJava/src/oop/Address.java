package oop;

/**
 * Postal address class.
 *
 * Example of: Constructor chaining, mutators.
 */
public class Address {
    String first;
    String second;
    String city;
    String state;
    String zip;
    String country;

    public Address() {
        first = "";
        second = "";
        city = "";
        state = "";
        zip = "";
        country = "";
    }

    public Address(String first, String city, String state, String zip) {
        this();
        this.first = first;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // TODO add method for toString.
}
