public class BinaryConverter {
    public static void main(String[] args) {
        String binary = "1101";
        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(Integer.parseInt(binary, 2));
        System.out.println("Binary Number: " + binary);
        System.out.println("Decimal Number: " + decimal);
        System.out.println("Octal: " + octal);
    }
}
