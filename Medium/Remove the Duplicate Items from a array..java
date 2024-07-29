import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        Set<Integer> uniqueItems = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            uniqueItems.add(sc.nextInt());
        }
        System.out.println("Non-duplicate items: " + uniqueItems);
        sc.close();
    }
}
