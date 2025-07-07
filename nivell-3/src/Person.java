import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private String surnames;
    private String dni;
    private static final List<Person> peopleList = new ArrayList<>();

    public Person(String name, String surnames, String dni) {
        this.name = name;
        this.surnames = surnames;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public static void addPerson(Scanner scanner) {
        String name;
        String surnames;
        String dni;

        System.out.println("Person's name: ");
        name = scanner.nextLine();
        while (name.isEmpty()) {
            System.out.println("Please enter the person's name: ");
            name = scanner.nextLine();
        }

        System.out.println("Person's surnames: ");
        surnames = scanner.nextLine();
        while (surnames.isEmpty()) {
            System.out.println("Please enter the person's surnames: ");
            surnames = scanner.nextLine();
        }
        System.out.println("Person's DNI: ");
        dni = scanner.nextLine();
        while (dni.length() != 9) {
            System.out.println("Please enter a valid DNI: ");
            dni = scanner.nextLine();
        }

        peopleList.add(new Person(name, surnames, dni));
        System.out.println("New person added: " + name + " " + surnames + ", DNI " + dni + "\n");
    }

    public static void printPeople() {
        System.out.println("___Name___ ____Surnames___ __NIF__");
        for (Person person : peopleList) {
            System.out.println(person.name + "        " + person.surnames +
                    "             " + person.dni);
        }
        System.out.println();
    }

    public static void showDescendingName() {
        peopleList.sort(Comparator.comparing((Person::getName),
                String.CASE_INSENSITIVE_ORDER).reversed());
        Person.printPeople();
    }

    public static void showAscendingName() {
        peopleList.sort(Comparator.comparing((Person::getName), String.CASE_INSENSITIVE_ORDER));
        Person.printPeople();
    }

}
