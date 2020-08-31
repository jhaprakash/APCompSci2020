package inheritance;

public class ElectricalEngineer extends Engineer {
    public ElectricalEngineer() {
        System.out.println(this.getClass().getSimpleName() + " called");
    }

    public ElectricalEngineer(String name) {
        super(name);
    }

    @Override
    public void myBio() {
        super.myBio();
        System.out.print(", and I make circuits");
    }
}
