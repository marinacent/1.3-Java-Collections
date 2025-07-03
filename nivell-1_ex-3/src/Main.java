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

        GameShowRound capitalsGame = new GameShowRound("marina", capitals);
        int result = capitalsGame.playRound(10);
        System.out.println(result);
        capitalsGame.generateOutput(result, "output.txt");


    }
}
