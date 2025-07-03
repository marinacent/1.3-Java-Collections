import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> capitals = FileToMap.fileToStringMap("countries.txt", " ");
    }
}
