
import java.util.ArrayList;

public class BirdsLog {

    private ArrayList<Bird> birds;

    public BirdsLog() {
        this.birds = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        this.birds.add(bird);
    }

    public Bird findBirdByName(String name) {
        Bird searchedBird = null;
        for (Bird birdEntry : this.birds) {
            if (birdEntry.getName().equals(name)) {
                searchedBird = birdEntry;
            }
        }
        return searchedBird;
    }

    public void addBirdObservationToLog(String name) {
        Bird observedBird = this.findBirdByName(name);
        if (observedBird != null) {
            observedBird.addObservation();
        } else {
            System.out.println("Not a bird!");
        }
    }

    public void printOneBird(String name) {
        Bird birdToBePrinted = this.findBirdByName(name);
        if (birdToBePrinted != null) {
            System.out.println(birdToBePrinted.toString());
        } else {
            System.out.println("Bird not found.");
        }
    }

    public void printAllBirds() {
        for (Bird bird : this.birds) {
            System.out.println(bird.toString());
        }
    }
}
