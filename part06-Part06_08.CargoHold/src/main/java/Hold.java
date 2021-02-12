
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> load;
    private int maxLoad;

    public Hold(int maxLoad) {
        this.load = new ArrayList<>();
        this.maxLoad = maxLoad;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maxLoad) {
            load.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : load) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Suitcase suitcase : load) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        return load.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

}
