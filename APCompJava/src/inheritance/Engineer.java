package inheritance;

public class Engineer extends Professional {
    public Engineer() {
//        super("Engineer");
        System.out.println("Engineer constructor called");
    }

    public Engineer(String name) {
        super(name, "Engineer");
    }

    @Override
    public void myBio() {
        super.myBio();
    }
}
