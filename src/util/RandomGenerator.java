package util;

import model.*;
import java.util.Random;


public class RandomGenerator {
    private static final Random rand = new Random();

    public static NeuralNetwork randomNeuralNetwork() {
        String name = "NN-" + rand.nextInt(100);
        double accuracy = 0.5 + rand.nextDouble() * 0.5;
        int layers = 1 + rand.nextInt(20);
        return new NeuralNetwork(name, accuracy, layers);
    }

    public static DecisionTree randomDecisionTree() {
        String name = "DT-" + rand.nextInt(100);
        double accuracy = 0.5 + rand.nextDouble() * 0.5;
        int depth = 1 + rand.nextInt(15);
        return new DecisionTree(name, accuracy, depth);
    }

    public static SVM randomSVM() {
        String name = "SVM-" + rand.nextInt(100);
        double accuracy = 0.5 + rand.nextDouble() * 0.5;
        double marginWidth = 0.1 + rand.nextDouble() * 0.5;
        return new SVM(name, accuracy, marginWidth);
    }

    public static MLModel randomModel() {
        int type = rand.nextInt(3);
        return switch (type) {
            case 0 -> randomNeuralNetwork();
            case 1 -> randomDecisionTree();
            default -> randomSVM();
        };
    }
}
