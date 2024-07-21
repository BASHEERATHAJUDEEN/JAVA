public class Main {
    public static void main(String[] args) {
        String statement = "Saveetha School of Engineering";
        statement = statement.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels = " + vowelCount);
    }
}
