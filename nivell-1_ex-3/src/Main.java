import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String,String> capitals = TextProcessor.fileToStringMap("countries.txt", " ");
        capitals = TextProcessor.mapReplace(capitals, "_", " ");

    }
}
