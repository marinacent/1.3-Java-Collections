import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();
        try {
            ArrayList<String[]> people = CsvReader.read("src/people.csv", ";");
            for (String[] person : people) {
                peopleList.add(new Person(person));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
