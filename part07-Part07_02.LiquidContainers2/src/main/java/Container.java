
public class Container {

    private int maxCapacity;
    private int load;

    public Container() {
        this.maxCapacity = 100;
        this.load = 0;
    }

    public Container(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.load = 0;
    }

    public int contains() {
        return this.load;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.load += amount;
            if (this.load > maxCapacity) {
                this.load = maxCapacity;
            }
        }
    }

    public void remove(int amount) {
        this.load -= amount;
        if (this.load < 0) {
            this.load = 0;
        }
    }

    @Override
    public String toString() {
        return this.load + "/100";
    }

}
