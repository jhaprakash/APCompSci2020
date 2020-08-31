package inheritance;

public class JavaTeacher extends Teacher {
    public JavaTeacher() {
        System.out.println("JavaTeacher constructor called");
    }

    public JavaTeacher(String name) {
        super(name);
    }

    @Override
    public void myBio() {
        super.myBio();
        System.out.print(", and I teach Java");
    }
}
