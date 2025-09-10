package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MLUniversity extends ArrayList<Department> {

    public void addDepartment(Department d) {
        this.add(d);
    }

    public List<Department> getDepartments() {
        return this;
    }

    public void sortByEvaluateScore() {
        this.sort(new Comparator<Department>() {
            @Override
            public int compare(Department d1, Department d2) {
                return Double.compare(d1.getModels().sumEvaluateScore(), d2.getModels().sumEvaluateScore());
            }
        });
    }

    public void sortByIndividual() {
        this.sort(new Comparator<Department>() {
            @Override
            public int compare(Department d1, Department d2) {
                return Double.compare(d1.getModels().sumIndividual(), d2.getModels().sumIndividual());
            }
        });
    }

    public void printAll() {
        for (Department d : this) {  // Iterate over departments
            System.out.println(d);
        }
    }
}
