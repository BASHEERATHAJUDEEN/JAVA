import java.util.Scanner;
public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Original string: " + input);
        System.out.println("Length of the string: " + input.length());
        System.out.println("String in uppercase: " + input.toUpperCase());
        System.out.println("String in lowercase: " + input.toLowerCase());
        System.out.println("Character at index 5: " + input.charAt(5));
        System.out.println("Substring from index 3 to 8: " + input.substring(3, 9));
        System.out.println("Index of 'to': " + input.indexOf("to"));
        System.out.println("Replaced 'Saveetha' with 'Periyar': " + input.replace("Saveetha", "Periyar"));
        scanner.close();
    }
}
