import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private String surnames;
    private String dni;
    private static final List<Person> peopleList = new ArrayList<>();

    public Person (String name, String surnames, String dni) {
        this.name = name;
        this.surnames = surnames;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public static void addPerson(Scanner scanner) {
        System.out.println("Person's name: ");
        String name = scanner.nextLine();
        System.out.println("Person's surnames: ");
        String surnames = scanner.nextLine();
        System.out.println("Person's DNI: ");
        String dni = scanner.nextLine();
        peopleList.add(new Person(name, surnames, dni));
        System.out.println("New person added: " + name + " " + surnames + ", DNI " + dni + "\n");

    }
}
