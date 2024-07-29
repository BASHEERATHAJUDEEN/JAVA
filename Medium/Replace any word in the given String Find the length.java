import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String replaced = input.replace("word", "replacement"); // Replace "word" with "replacement"
        System.out.println("Replaced string: " + replaced);
        System.out.println("Length of the string: " + replaced.length());
        System.out.println("Uppercase conversion: " + replaced.toUpperCase());
        scanner.close();
    }
}
