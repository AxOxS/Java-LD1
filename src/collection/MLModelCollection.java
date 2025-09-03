package collection;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class MLModelCollection {
    private String name;
    private List<MLModel> models = new ArrayList<>();

    public MLModelCollection(String name) {
        this.name = name;
    }

    public void addModel(MLModel model) {
        models.add(model);
    }

    public List<MLModel> getModels() {
        return models;
    }

    public String getName() {
        return name;
    }

    public double sumEvaluateScore() {
        return models.stream().mapToDouble(MLModel::evaluateScore).sum();
    }

    public double sumIndividual() {
        return models.stream().mapToDouble(m -> {
            if (m instanceof NeuralNetwork nn) {
                return nn.complexity();
            } else if (m instanceof DecisionTree dt) {
                return dt.depthMeasure();
            } else if (m instanceof SVM svm) {
                return svm.kernelStrength();
            }
            return 0.0;
        }).sum();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Collection: " + name + "\n");
        sb.append("  Sum(evaluateScore) = ").append(sumEvaluateScore()).append("\n");
        sb.append("  Sum(individual)    = ").append(sumIndividual()).append("\n");
        sb.append("  Models:\n");
        for (MLModel m : models) {
            sb.append("    ").append(m).append("\n");
        }
        return sb.toString();
    }
}
