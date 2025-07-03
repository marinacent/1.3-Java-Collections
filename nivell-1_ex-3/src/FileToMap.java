import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileToMap {

    public static HashMap<String,String> fileToStringMap(String path, String separator) {
        HashMap<String,String> map = new HashMap<>();

        try (Scanner scanner = new Scanner(Paths.get(path))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] sep = row.split(separator);
                map.put(sep[0], sep[1]);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return map;
    }
}

