package inheritance;

public class Surgeon extends Doctor {
    public Surgeon() {
        System.out.println("Surgeon constructor called");
    }

    public Surgeon(String name) {
        super(name);
    }

    @Override
    public void myBio() {
        super.myBio();
    }
}
