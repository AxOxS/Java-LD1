package model;

public abstract class MLModel {
    protected String name;
    protected double accuracy;

    public MLModel (String name, double accuracy) {
        this.name = name;
        this.accuracy = accuracy;
    }

    public String getName() {
        return name;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public abstract double evaluateScore();

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " { name='" + name + '\'' +
                ", accuracy=" + accuracy +
                " }";
    }
}