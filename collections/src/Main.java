import java.util.*;

public class Main {

    public static void main(String[] args) {
        // EXERCISE 1

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

        for (int i = 0; i < months.size(); i++) {
            System.out.println(months.get(i).toString());
        }

        Iterator<Month> monthIterator = months.iterator();
        while (monthIterator.hasNext()) {
            System.out.println(monthIterator.next().toString());
        }

        HashSet<Month> monthSet = new HashSet<Month>(months);
        System.out.println(monthSet.size());
        monthSet.add(new Month("August"));
        System.out.println(monthSet.size());

        // EXERCISE 2

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        List<Integer> intListBackwards = new ArrayList<>();

        ListIterator<Integer> intIterator = intList.listIterator(intList.size());
        while (intIterator.hasPrevious()) {
            intListBackwards.add(intIterator.previous());
        }

        for (int element : intList) {
            System.out.println(element);
        }

        for (int element : intListBackwards) {
            System.out.println(element);
        }

    }
}
