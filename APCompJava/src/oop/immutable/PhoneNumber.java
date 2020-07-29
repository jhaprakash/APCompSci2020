package oop.immutable;

public class PhoneNumber {
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
        return areaCode + "-" + number/1000 + "-" + number%1000;
    }

    public String toString() {
        return getFormattedNumber();
    }
}
