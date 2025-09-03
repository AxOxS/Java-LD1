package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionManager {
    private List<MLModelCollection> collections = new ArrayList<>();

    public void addCollection(MLModelCollection c) {
        collections.add(c);
    }

    public List<MLModelCollection> getCollections() {
        return collections;
    }

    public void sortByEvaluateScore() {
        collections.sort(Comparator.comparingDouble(MLModelCollection::sumEvaluateScore));
    }

    public void sortByIndividual() {
        collections.sort(Comparator.comparingDouble(MLModelCollection::sumIndividual));
    }

    public void printAll() {
        for (MLModelCollection c : collections) {
            System.out.println(c);
        }
    }
}
