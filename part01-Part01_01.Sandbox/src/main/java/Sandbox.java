
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        String[] arrayOfStrings = {"Matti L.", "Matti P.", "Matti V."};
        double[] arrayOfFloatingpoints = {1.20, 3.14, 100.0, 0.6666666667};

        for (int i = 0; i < arrayOfFloatingpoints.length; i++) {
            System.out.println(arrayOfStrings[i] + " " + arrayOfFloatingpoints[i]);
        }
    }
}
