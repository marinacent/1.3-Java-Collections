import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        ArrayList<Person> peopleList = new ArrayList<>();
        try {
            ArrayList<String[]> people = CsvReader.read("src/people.csv", ";");
            for (String[] person : people) {
                if (person.length >= 3) {
                    peopleList.add(new Person(person[0], person[1], person[2]));
                } else {
                    System.out.println("Skipping invalid line: " + Arrays.toString(person));
                }
            }

        } catch (IOException e) {
            System.out.println("I/O exception: " + e.getMessage());
        }

        do {
            System.out.println("Pick an option: ");
            System.out.println("1  Add person");
            System.out.println("2  Show people ordered by name (A-Z)");
            System.out.println("0  Exit");

            while (!input.hasNextInt()) {
                System.out.println("Please type a number: ");
                input.next();
            }

            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    Person.addPerson(input);
                    break;

                case 2:
                    Person.showAscendingName();
                    break;
            }
            
        } while (option != 0);

    }
}
