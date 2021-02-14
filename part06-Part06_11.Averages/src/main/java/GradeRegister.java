
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();

    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        int sumOfGrades = 0;
        double average = 0;

        if (grades.isEmpty()) {
            average = -1.0;
        } else {
            int totalNumberOfGrades = this.grades.size();
            for (Integer grade : grades) {
                sumOfGrades += grade;
            }
            average = 1.0 * sumOfGrades / totalNumberOfGrades;
        }
        return average;
    }

    public double averageOfPoints() {
        int sumOfPoints = 0;
        double average = 0;

        if (points.isEmpty()) {
            average = -1.0;
        } else {
            int totalNumberOfPoints = points.size();
            for (Integer point : points) {
                sumOfPoints += point;
            }
            average = 1.0 * sumOfPoints / totalNumberOfPoints;
        }
        return average;
    }

}
