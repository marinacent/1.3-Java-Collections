import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        // EXERCICI 1

        Restaurant kobuta = new Restaurant("kobuta", 9);
        Restaurant queviuresSerra = new Restaurant("queviuresSerra", 10);
        Restaurant queviures = new Restaurant("queviuresSerra", 10);
        Restaurant serra = new Restaurant("queviuresSerra", 7);

        HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
        restaurants.add(kobuta);
        restaurants.add(queviuresSerra);
        restaurants.add(queviures);
        restaurants.add(serra);

        System.out.println("HashSet size: " + restaurants.size());

        // EXERCICI 2

        Restaurant[] restaurantArray = new Restaurant[restaurants.size()];
        restaurants.toArray(restaurantArray);
        Arrays.sort(restaurantArray, Comparator.comparing(Restaurant::getName)
                .thenComparing(Restaurant::getRating, Comparator.reverseOrder()));

        for (Restaurant restaurant : restaurantArray) {
            System.out.println(restaurant);
        }
    }
}
