import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<>();
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        months.add(7, new Month("August"));

        for (Month month : months) {
            System.out.println(month.toString());
        }

        HashSet<Month> monthSet = new HashSet<Month>(months);
        System.out.println(monthSet.size());
        monthSet.add(new Month("August"));
        System.out.println(monthSet.size());
    }
}
