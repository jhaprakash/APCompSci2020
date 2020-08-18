package oop.immutable;

public class PhoneNumber implements Comparable<PhoneNumber> {
    // Add country code to show how easy it is.
    // private int countryCode;
    private int areaCode;
    private int number;

    public PhoneNumber(int areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public int getAreaCode() {
        return this.areaCode;
    }

    public int getNumber() {
        return number;
    }

    public String getFormattedNumber() {
        return areaCode + "-" + number/10000 + "-" + number%10000;
    }

    public String toString() {
        return getFormattedNumber();
    }

    @Override
    public int compareTo(PhoneNumber o) {
        return this.number - o.number;
    }
}
