package inheritance;

public class Professional {
    private String profession;
    private String name;

    public Professional() {
        System.out.println("Professional constructor called");
    }

    public Professional(String name, String profession) {
        System.out.println("Professional parameterized constructor called");
        this.profession = profession;
        this.name = name;
    }

    public void myBio() {
        System.out.print("I am a " + profession);
    }

    public void myIntro() {
        System.out.println("My name is: " + name);
        System.out.print("My Bio: ");
        myBio();
    }
}
