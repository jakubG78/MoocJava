
import java.util.Scanner;

public class UserInterface {
    
    private Grades grades;
    private Scanner scanner;
    
    public UserInterface(Grades grades, Scanner scanner) {
        this.scanner = scanner;
        this.grades = grades;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            Integer input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            grades.addPoints(input);
        }
        System.out.println("Point average (all): " + grades.getPointsAverageFrom(0));
        System.out.println("Point average (passing): " + grades.getPointsAverageFrom(50));
        System.out.println("Pass percentage: "+ grades.getPointsPrecentgeFrom(50));
        grades.addGradesByPoints(grades.getPoints());
        System.out.println(grades.printGrades());
    }
}
