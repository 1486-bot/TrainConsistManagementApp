import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistManagementAppTest {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        System.out.println("--- UC7: Sort Bogies by Capacity (Comparator) ---");
        System.out.println();

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 48));

        System.out.println("Unsorted bogies:");
        for (int i = 0; i < bogies.size(); i++) {
            System.out.println((i + 1) + ". " + bogies.get(i));
        }
        System.out.println();

        System.out.println("Sorting bogies by capacity (ascending)...");
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));
        System.out.println("Sorting completed.");
        System.out.println();
        System.out.println("Sorted bogies (by capacity ascending):");
        for (int i = 0; i < bogies.size(); i++) {
            System.out.println((i + 1) + ". " + bogies.get(i));
        }
        System.out.println();

        System.out.println("Sorting bogies by capacity (descending)...");
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());
        System.out.println("Sorting completed.");
        System.out.println();

        System.out.println("Sorted bogies (by capacity descending):");
        for (int i = 0; i < bogies.size(); i++) {
            System.out.println((i + 1) + ". " + bogies.get(i));
        }
        System.out.println();

        System.out.println("Key Benefits of Comparator:");
        System.out.println("✓ Flexible sorting without modifying the class");
        System.out.println("✓ Chain comparators for multiple criteria");
        System.out.println("✓ Reusable and composable");
        System.out.println("✓ Improves code readability and maintainability");
        System.out.println("✓ Supports both ascending and descending order");
        System.out.println();

        System.out.println("Program continues...");
    }
}
