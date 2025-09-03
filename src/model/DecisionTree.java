package model;

public class DecisionTree extends MLModel {
    private int depth;

    public DecisionTree(String name, double accuracy, int depth) {
        super(name, accuracy);
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    @Override
    public double evaluateScore() {
        return getAccuracy() * Math.log(getDepth() + 1);
    }

    public double depthMeasure() {
        return depth;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", depth=" + getDepth() +
                ", evaluateScore=" + evaluateScore() +
                ", depthMeasure=" + depthMeasure() +
                " }";
    }
}
