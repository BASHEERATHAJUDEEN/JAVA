import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Banana", "Carrot", "Radish", "Apple", "Jack"};
        String order="A";
        
        if (order.equals("A")) {
            Arrays.sort(names);
        } else if (order.equals("D")) {
            Arrays.sort(names, (a, b) -> b.compareTo(a));
        } else {
            System.out.println("Invalid order input.");
            return;
        }
        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
