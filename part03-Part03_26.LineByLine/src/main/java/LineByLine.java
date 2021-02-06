
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String inputSentence = scanner.nextLine();
            if (inputSentence.equals("")){
                break;
            }
            String[] sentencePieces = inputSentence.split(" ");
            for (String sentencePiece : sentencePieces) {
                System.out.println(sentencePiece);
            }
        }
    }
}
