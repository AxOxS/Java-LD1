package collection;

public class Department {
    private String name;
    private MLModelCollection models;
    
    public Department(String name) {
        this.name = name;
        this.models = new MLModelCollection("Models in " + name);
    }
    
    public String getName() {
        return name;
    }
    
    public MLModelCollection getModels() {
        return models;
    }
    
    public void setModels(MLModelCollection models) {
        this.models = models;
    }
    
    @Override
    public String toString() {
        return "Department: " + name + "\n" + models.toString();
    }
}
