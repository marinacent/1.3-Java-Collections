import java.util.ArrayList;

public class Person {
    private String name;
    private String surnames;
    private String dni;

    public Person (String name, String surnames, String dni) {
        this.name = name;
        this.surnames = surnames;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }
}
