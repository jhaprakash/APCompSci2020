package inheritance;

public class Teacher extends Professional {
    public Teacher() {
//        super("Teacher");
        System.out.println("Teacher constructor called");
    }

    public Teacher (String name) {
        super(name, "Teacher");
    }

    @Override
    public void myBio() {
        super.myBio();
    }
}
