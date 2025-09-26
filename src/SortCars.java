import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCars {
    public static void main(String[] args) {
        // 1. ArrayList med historiske begivenheder
        List<car> car = new ArrayList<>();

        // 2. Tilføj begivenheder (årstal + beskrivelse)
        car.add(new car( "BC34256"));
        car.add(new car("AB76343"));
        car.add(new car( "AF20328"));
        car.add(new car("CD63273"));
        car.add(new car( "CN53672"));

        // 3. Print listen (usorteret)
        System.out.println("Original list of events:");
        for (car c : car) {
            System.out.println(c); // toString() bliver kaldt automatisk
        }

        // 4. Sortér listen (Collections.sort kalder compareTo)
        Collections.sort(car);

        // 5. Print listen igen – nu er den sorteret efter alfabetet
        System.out.println("\nSorted list of cars alphabetic ):");
        for (car c : car) {
            System.out.println(c);
        }


    }
}
