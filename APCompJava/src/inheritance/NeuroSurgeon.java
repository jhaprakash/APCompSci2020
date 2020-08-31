package inheritance;

public class NeuroSurgeon extends Surgeon {
    public NeuroSurgeon() {
        System.out.println("NeuroSurgeon constructor called");
    }

    public NeuroSurgeon(String name) {
        super(name);
    }

    @Override
    public void myBio() {
        super.myBio();
        System.out.print(", and I do Neurosurgery");
    }
}
