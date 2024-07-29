import java.util.Hashtable;
public class BankDetails {
    public static void main(String[] args) {
        Hashtable<Integer, String> bankDetails = new Hashtable<>();
        bankDetails.put(1001, "Alice");
        bankDetails.put(1002, "Bob");
        bankDetails.put(1003, "Charlie");
        System.out.println("Size of HashTable: " + bankDetails.size());
        bankDetails.clear();
        System.out.println("HashTable cleared. Size now: " + bankDetails.size());
    }
}
