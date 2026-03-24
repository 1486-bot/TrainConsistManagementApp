import java.util.HashSet;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {
        Set<String> bogieIDs = new HashSet<>();

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");

        System.out.println("Unique bogie IDs: " + bogieIDs);
    }
}