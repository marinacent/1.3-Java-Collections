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

    public Person(String name, String surnames) {
        this.name = name;
        this.surnames = surnames;
    }

    public String getName() {
        return name;
    }

    public String getSurnames() {
        return surnames;
    }

    public String getDni() {
        return dni;
    }

    public static void addPerson(String name, String surnames, String dni) {
        peopleList.add(new Person(name, surnames, dni));
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

    public static void sortDescending(String sortBy) {
        switch (sortBy) {
            case "name":
                peopleList.sort(Comparator.comparing((Person::getName),
                        String.CASE_INSENSITIVE_ORDER).reversed());
                break;

            case "surnames":
                peopleList.sort(Comparator.comparing((Person::getSurnames),
                        String.CASE_INSENSITIVE_ORDER).reversed());
                break;

            case "dni":
                peopleList.sort(Comparator.comparing((Person::getDni),
                        String.CASE_INSENSITIVE_ORDER).reversed());
                break;
        }
        Person.printPeople();
    }

    public static void sortAscending(String sortBy) {
        switch (sortBy) {
            case "name":
                peopleList.sort(Comparator.comparing((Person::getName),
                        String.CASE_INSENSITIVE_ORDER));
                break;

            case "surnames":
                peopleList.sort(Comparator.comparing((Person::getSurnames),
                        String.CASE_INSENSITIVE_ORDER));
                break;

            case "dni":
                peopleList.sort(Comparator.comparing((Person::getDni),
                        String.CASE_INSENSITIVE_ORDER));
                break;
        }
        Person.printPeople();
    }

}
