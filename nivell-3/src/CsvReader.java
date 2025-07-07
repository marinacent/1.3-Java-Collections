import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {

    public static String[] read(String path, String delimiter) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            String[] values = null;
            while ((line = reader.readLine()) != null) {
                values = line.split(delimiter);
            }
            return values;

    }


}
