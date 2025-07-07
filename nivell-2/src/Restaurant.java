import java.util.Objects;

public class Restaurant {
    private String name;
    private int rating;

    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object compared) {
        if(!(compared instanceof Restaurant comparedRestaurant)) { return false; }

        return comparedRestaurant.name.equals(this.name) &&
                comparedRestaurant.rating == this.rating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating);
    }

}
