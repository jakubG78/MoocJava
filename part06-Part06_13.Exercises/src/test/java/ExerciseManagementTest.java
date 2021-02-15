
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBegining() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseInList() {
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("Other exercise"));
    }

    @Test
    public void removingExerciseShrinkListByOne() {
        management.add("Test exercise to be removed");
        management.remove("Test exercise to be removed");
        assertEquals(0, this.management.exerciseList().size());
    }

    @Test
    public void removingRightExercise() {
        management.add("First task");
        management.add("Test exercise to be removed");
        management.remove("Test exercise to be removed");
        assertFalse(this.management.exerciseList().contains("Test exercise to be removed"));
    }
}
