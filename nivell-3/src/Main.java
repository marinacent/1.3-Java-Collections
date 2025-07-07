import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            String[] people = CsvReader.read("src/people.csv", ";");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
