package oop;

/**
 * Typical details in a bank account.
 *
 * Example: hiding information from user, use of toString
 */
public class BankAccount {
    private BirthInformation birthInformation;
    private Address address;
    private String ssn;
    private String phone;

    public BankAccount (BirthInformation birth, String ssn) {
        this.birthInformation = birth;
        this.ssn = ssn;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLast4OfSSN() {
        return ssn.substring(ssn.length() - 4);
    }

    public String getAccHolderName() {
        return birthInformation.getName().toString();
    }
}
