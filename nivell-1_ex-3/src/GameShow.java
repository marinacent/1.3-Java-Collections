import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class GameShow {

    public static String getRandomQuestion(HashMap<String,String> map) {
        try {
            if (map.isEmpty()) { throw new IllegalStateException(); }
            List<String> keys = new ArrayList<>(map.keySet());
            Random random = new Random();
            return keys.get(random.nextInt(keys.size()));
        } catch (IllegalStateException e) {
            System.out.println("That was an empty map! Returning null");
            return null;
        }
    }
}
