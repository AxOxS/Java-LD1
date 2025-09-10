import collection.*;
import util.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        MLUniversity university = new MLUniversity();

        Department visionDept = new Department("Computer Vision Department");
        MLModelCollection visionModels = visionDept.getModels();
        for (int i = 0; i < 5; i++) {
            visionModels.addModel(RandomGenerator.randomModel());
        }

        Department nlpDept = new Department("Natural Language Processing Department");
        MLModelCollection nlpModels = nlpDept.getModels();
        for (int i = 0; i < 5; i++) {
            nlpModels.addModel(RandomGenerator.randomModel());
        }

        Department roboticsDept = new Department("Robotics and Automation Department");
        MLModelCollection roboticsModels = roboticsDept.getModels();
        for (int i = 0; i < 5; i++) {
            roboticsModels.addModel(RandomGenerator.randomModel());
        }

        university.addDepartment(visionDept);
        university.addDepartment(nlpDept);
        university.addDepartment(roboticsDept);

        System.out.println("=== Initial University Departments ===");
        university.printAll();

        System.out.println("\n=== Sorted by evaluateScore sum ===");
        university.sortByEvaluateScore();
        university.printAll();

        System.out.println("\n=== Sorted by individual methods sum ===");
        university.sortByIndividual();
        university.printAll();
    }
}
