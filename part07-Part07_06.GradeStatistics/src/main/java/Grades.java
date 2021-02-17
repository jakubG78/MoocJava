
import java.util.ArrayList;

public class Grades {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public Grades() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public ArrayList<Integer> getPoints() {
        return this.points;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public String getPointsAverageFrom(int minimumPoints) {
        int sumOfPoints = 0;
        int entryCounter = 0;
        for (int pointsEntry : this.points) {
            if (pointsEntry >= minimumPoints) {
                sumOfPoints += pointsEntry;
                entryCounter++;
            }
        }
        double pointsAverage = 1.0 * sumOfPoints / entryCounter;
        if (entryCounter == 0) {
            return "-";
        } else {
            return String.valueOf(pointsAverage);
        }
    }

    public double getPointsPrecentgeFrom(int minimumPoints) {
        double pointsPrecentageFrom = 0.0;
        int passingCouter = 0;

        if (this.points.isEmpty()) {
            return pointsPrecentageFrom;
        } else {

            for (int pointsEntry : this.points) {
                if (pointsEntry >= minimumPoints) {
                    passingCouter++;
                }
            }
            pointsPrecentageFrom = 100.0 * passingCouter / this.points.size();
            return pointsPrecentageFrom;
        }
    }

    public void addPoints(int pointsEntry) {
        if (0 <= pointsEntry && pointsEntry <= 100) {
            this.points.add(pointsEntry);
        }
    }

    public void addGradesByPoints(ArrayList<Integer> points) {
        for (Integer pointsEntry : points) {
            if (0 <= pointsEntry && pointsEntry < 50) {
                this.grades.add(0);
            } else if (pointsEntry < 60) {
                this.grades.add(1);
            } else if (pointsEntry < 70) {
                this.grades.add(2);
            } else if (pointsEntry < 80) {
                this.grades.add(3);
            } else if (pointsEntry < 90) {
                this.grades.add(4);
            } else if (90 <= pointsEntry && pointsEntry <= 100) {
                this.grades.add(5);
            }
        }
    }

    public String printGradeValueWithStars(int gradeValue) {
        String starsForGrade = "";
        int starsCounter = 0;
        for (Integer grade : this.grades) {
            if (grade == gradeValue) {
                starsCounter++;
            }
        }
        for (int i = 0; i < starsCounter; i++) {
            starsForGrade += "*";
        }
        return starsForGrade;
    }

    public String printGrades() {
        return "5: " + printGradeValueWithStars(5) + "\n"
                + "4: " + printGradeValueWithStars(4) + "\n"
                + "3: " + printGradeValueWithStars(3) + "\n"
                + "2: " + printGradeValueWithStars(2) + "\n"
                + "1: " + printGradeValueWithStars(1) + "\n"
                + "0: " + printGradeValueWithStars(0);
    }
}
