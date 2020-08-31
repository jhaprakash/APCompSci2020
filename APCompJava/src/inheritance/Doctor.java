package inheritance;

public class Doctor extends Professional {
    public Doctor() {
//        super("Doctor");
        System.out.println("Doctor constructor called");
    }

    public Doctor(String name) {
        super(name, "Doctor");
    }

    @Override
    public void myBio() {
        super.myBio();
    }
}
