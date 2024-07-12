import java.util.Scanner;
public class SqCubCal{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double n = s.nextDouble();
        double sq= Math.pow(n, 2);
        double c = Math.pow(n, 3);
        System.out.println("Square Number: " + sq);
        System.out.println("Cube Number: " + c);
        s.close();
    }
}
