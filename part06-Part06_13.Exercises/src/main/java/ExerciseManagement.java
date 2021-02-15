
import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : exercises) {
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exercise) {
        for (Exercise exerciseEntry : exercises) {
            if (exerciseEntry.getName().equals(exercise)) {
                exerciseEntry.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise exerciseEntry : exercises) {
            if (exerciseEntry.getName().equals(exercise)) {
                return exerciseEntry.isCompleted();
            }
        }
        return false;
    }

    public void remove(String exercise) {
        Exercise exerciseToBeRemoved = new Exercise("");
        for (Exercise exerciseEntry : exercises) {
            if (exerciseEntry.getName().equals(exercise)) {
                exerciseToBeRemoved = exerciseEntry;
            }
        }
        this.exercises.remove(exerciseToBeRemoved);
    }
}
