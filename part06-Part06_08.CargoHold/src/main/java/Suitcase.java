
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxLoad;

    public Suitcase(int maxLoad) {
        this.items = new ArrayList<>();
        this.maxLoad = maxLoad;
    }

    public int totalWeight() {
        int weightOfLoaded = 0;
        for (Item item : this.items) {
            weightOfLoaded += item.getWeight();
        }
        return weightOfLoaded;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= maxLoad) {
            this.items.add(item);
        }
    }

    public Item heaviestItem() {
        Item heaviestItem = new Item(null, 0);
        if (this.items.isEmpty()) {
            return null;
        }
        for (Item item : this.items) {
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }

        return heaviestItem;
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (" + this.totalWeight() + " kg)";
        } else if (this.items.size() == 1) {
            return items.size() + " item (" + this.totalWeight() + " kg)";
        } else {
            return items.size() + " items (" + this.totalWeight() + " kg)";
        }
    }

}
