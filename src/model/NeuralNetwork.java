package model;

public class NeuralNetwork extends MLModel {
    private int layers;

    public NeuralNetwork(String name, double accuracy, int layers) {
        super(name, accuracy);
        this.layers = layers;
    }

    public int getLayers() {
        return layers;
    }

    @Override
    public double evaluateScore() {
        return getAccuracy() * Math.log(getLayers() + 1);
    }

    public double complexity() {
        return getLayers() * 10;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", layers=" + getLayers() +
                ", evaluateScore=" + evaluateScore() +
                ", complexity=" + complexity();
    }
}