import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class QuestionAnswer {
    private String username;
    private HashMap<String, String> answerKey;
    private static Scanner scanner = new Scanner(System.in);

    public QuestionAnswer(String username, HashMap<String, String> answerKey) {
        this.username = username;
        this.answerKey = answerKey;
    }


    public String getRandomQuestion() {
        try {
            if (this.answerKey.isEmpty()) {
                throw new IllegalStateException();
            }
            List<String> keys = new ArrayList<>(this.answerKey.keySet());
            Random random = new Random();
            return keys.get(random.nextInt(keys.size()));
        } catch (IllegalStateException e) {
            System.out.println("The answer key was empty! Random question returns null");
            return null;
        }
    }

    public boolean assessAnswer(String question, String answer) {
        return answerKey.get(question).equals(answer);
    }

    public int playRound(int questions) {
        int score = 0;
        for (int i = 0; i < questions; i++) {
            String q = this.getRandomQuestion();
            System.out.println(q + " : ");
            String a = scanner.nextLine();
            if (this.assessAnswer(q, a)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect answer. The capital of " + q + "is " + a );
            }
        }
        return score;
    }

    public void generateOutput(int result, String path) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(this.username + " " + result + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

