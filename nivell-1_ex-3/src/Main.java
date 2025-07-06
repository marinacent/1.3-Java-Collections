import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String,String> capitalsRaw = TextProcessor.fileToStringMap("countries.txt", " ");
        HashMap<String,String> capitals = TextProcessor.mapReplace(capitalsRaw, "_", " ");

        System.out.println("Please enter your username: ");
        String username = scanner.nextLine();

        System.out.println(username + ", write the following countries' capitals:");

        QuestionAnswer capitalsQuestions = new QuestionAnswer(username, capitals);
        try {
            int result = capitalsQuestions.playRound(10);
            capitalsQuestions.generateOutput(result, "output.txt");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

    }
}
