public class SpecialCharacterCounter {
    public static void main(String[] args) {
        String statement = "Ria Birthday @ April 10, #&$% is the wishes code for her.";
        long count = statement.chars().filter(c -> !Character.isLetterOrDigit(c) && !Character.isWhitespace(c)).count();
        System.out.println("Number of special Characters: " + count);
    }
}
