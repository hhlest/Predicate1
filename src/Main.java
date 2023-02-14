import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(List.of("Flash", "black", "final", "Fox", "orange"));
        System.out.println("initial list: " + list1);

        Predicate<String> prs = (a) -> a.startsWith("F");
        list1.removeIf(prs);
        System.out.println("transformed list: " + list1);
    }
}
