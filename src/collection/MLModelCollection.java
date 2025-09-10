package collection;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class MLModelCollection extends ArrayList<MLModel> {
    private String name;

    public MLModelCollection(String name) {
        super();
        this.name = name;
    }

    public void addModel(MLModel model) {
        this.add(model);
    }

    public List<MLModel> getModels() {
        return this;
    }

    public String getName() {
        return name;
    }
    
    //Convert the list to stream, transform each ML model
    //to double with method reference (like m -> m.evaluate) and add all values
    public double sumEvaluateScore() {
        return this.stream().mapToDouble(MLModel::evaluateScore).sum();
    }

    public double sumIndividual() {
        return this.stream().mapToDouble(m -> {
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
        for (MLModel m : this) {  // Iterate over this collection
            sb.append("    ").append(m).append("\n");
        }
        return sb.toString();
    }
}
