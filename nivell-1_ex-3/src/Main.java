import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String COUNTRIES_PATH = "nivell-1_ex-3/src/countries.txt";
        String OUTPUT_PATH = "nivell-1_ex-3/output.txt";
        Scanner scanner = new Scanner(System.in);

        HashMap<String,String> capitalsRaw = TextProcessor.fileToStringMap(COUNTRIES_PATH, " ");
        HashMap<String,String> capitals = TextProcessor.mapReplace(capitalsRaw, "_", " ");

        System.out.println("Please enter your username: ");
        String username = scanner.nextLine();

        System.out.println(username + ", write the following countries' capitals:");

        QuestionAnswer capitalsQuestions = new QuestionAnswer(username, capitals);
        try {
            int result = capitalsQuestions.playRound(10, scanner);
            capitalsQuestions.generateOutput(result, OUTPUT_PATH);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

    }
}
