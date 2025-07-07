import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader {

    public static ArrayList<String[]> read(String path, String delimiter) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            String[] values = null;
            ArrayList<String[]> listOfValues = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                values = line.split(delimiter);
                listOfValues.add(values);
            }
            return listOfValues;

    }


}
