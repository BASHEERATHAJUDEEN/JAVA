public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = null;
        try {
            int result = 10 / 0; 
            System.out.println(numbers[1]); 
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
