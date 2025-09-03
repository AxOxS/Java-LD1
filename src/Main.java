import collection.*;
import util.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        CollectionManager manager = new CollectionManager();

        MLModelCollection collectionA = new MLModelCollection("Collection A");
        for (int i = 0; i < 5; i++) {
            collectionA.addModel(RandomGenerator.randomModel());
        }

        MLModelCollection collectionB = new MLModelCollection("Collection B");
        for (int i = 0; i < 5; i++) {
            collectionB.addModel(RandomGenerator.randomModel());
        }

        MLModelCollection collectionC = new MLModelCollection("Collection C");
        for (int i = 0; i < 5; i++) {
            collectionC.addModel(RandomGenerator.randomModel());
        }

        manager.addCollection(collectionA);
        manager.addCollection(collectionB);
        manager.addCollection(collectionC);


        System.out.println("=== Initial Collections ===");
        manager.printAll();

        System.out.println("\n=== Sorted by evaluateScore sum ===");
        manager.sortByEvaluateScore();
        manager.printAll();

        System.out.println("\n=== Sorted by individual methods sum ===");
        manager.sortByIndividual();
        manager.printAll();
    }
}

