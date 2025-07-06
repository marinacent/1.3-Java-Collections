import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextProcessor {

    public static HashMap<String, String> fileToStringMap(String path, String separator) {
        HashMap<String, String> map = new HashMap<>();

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

    public static HashMap<String, String> mapReplace(HashMap<String, String> map, String old, String replacement) {
        HashMap<String, String> modifiedMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String modifiedKey = entry.getKey().replace(old, replacement);
            String modifiedValue = entry.getValue().replace(old, replacement);
            modifiedMap.put(modifiedKey, modifiedValue);
        }
        return modifiedMap;
    }
}
