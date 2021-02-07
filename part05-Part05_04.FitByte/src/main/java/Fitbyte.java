
public class Fitbyte {

    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double maxHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    public double targetHeartRate(double precentageOfMaximu) {
        return (this.maxHeartRate() - this.restingHeartRate)*precentageOfMaximu + this.restingHeartRate;
    }
}
