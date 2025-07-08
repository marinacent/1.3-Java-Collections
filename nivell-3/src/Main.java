import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String peoplePath = "nivell-3/src/people.csv";
        Scanner input = new Scanner(System.in);
        int option;

        try {
            ArrayList<String[]> people = CsvReader.read(peoplePath, ";");
            for (String[] person : people) {
                if (person.length >= 3) {
                    Person.addPerson(person[0], person[1], person[2]);
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
            System.out.println("3  Show people ordered by name (Z-A)");
            System.out.println("4  Show people ordered by surnames (A-Z)");
            System.out.println("5  Show people ordered by surnames (Z-A)");
            System.out.println("6  Show people ordered by DNI (1-9)");
            System.out.println("7  Show people ordered by DNI (9-1)");
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
                    Person.sortAscending("name");
                    break;

                case 3:
                    Person.sortDescending("name");
                    break;

                case 4:
                    Person.sortAscending("surnames");
                    break;

                case 5:
                    Person.sortDescending("surnames");
                    break;

                case 6:
                    Person.sortAscending("dni");
                    break;

                case 7:
                    Person.sortDescending("dni");
                    break;
            }


        } while (option != 0);

    }
}
