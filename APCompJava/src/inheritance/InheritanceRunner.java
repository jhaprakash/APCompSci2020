package inheritance;

import java.util.ArrayList;

public class InheritanceRunner {

    public static void run() {
        NeuroSurgeon neuroSurgeon1 = new NeuroSurgeon();
        JavaTeacher javaTeacher1 = new JavaTeacher();
        ElectricalEngineer electricalEngineer1 = new ElectricalEngineer();

        NeuroSurgeon neuroSurgeon = new NeuroSurgeon("John");
        JavaTeacher javaTeacher = new JavaTeacher("Paul");
        ElectricalEngineer electricalEngineer = new ElectricalEngineer("Katie");

        ArrayList<Professional> professionals = new ArrayList<>();
        professionals.add(neuroSurgeon);
        professionals.add(javaTeacher);
        professionals.add(electricalEngineer);

        for (Professional professional : professionals) {
            professional.myBio();
            System.out.println();
        }

        System.out.println("\n");
        for (Professional professional : professionals) {
            professional.myIntro();
            System.out.println("\n");
        }

        Professional neuroSurgeon2 = new NeuroSurgeon("John");
        Professional javaTeacher2 = new JavaTeacher("Paul");
        Professional electricalEngineer2 = new ElectricalEngineer("Katie");

        ArrayList<Professional> professionals2 = new ArrayList<>();
        professionals2.add(neuroSurgeon2);
        professionals2.add(javaTeacher2);
        professionals2.add(electricalEngineer2);

        for (Professional professional : professionals2) {
            professional.myIntro();
            System.out.println("\n");
        }
    }
}
