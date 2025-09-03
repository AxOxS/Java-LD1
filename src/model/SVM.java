package model;

public class SVM extends MLModel {
    private double marginWidth;

    public SVM(String name, double accuracy, double marginWidth) {
        super(name, accuracy);
        this.marginWidth = marginWidth;
    }

    public double getMarginWidth() {
        return marginWidth;
    }

   @Override
   public double evaluateScore() {
    return accuracy * (1.0 / (marginWidth + 1));
   }

   public double kernelStrength() {
    return 100.0 / (marginWidth + 1);
   }

   @Override
   public String toString() {
       return super.toString() +
               ", marginWidth=" + getMarginWidth() +
               ", evaluateScore=" + evaluateScore() +
               ", kernelStrength=" + kernelStrength() +
               " }";
   }
}
