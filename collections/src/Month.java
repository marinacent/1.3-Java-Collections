import java.util.Objects;

public class Month {
    private String name;

    Month(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object compared) {
        if (!(compared instanceof Month comparedMonth)) {
            return false;
        }

        return this.name.equals(comparedMonth.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
