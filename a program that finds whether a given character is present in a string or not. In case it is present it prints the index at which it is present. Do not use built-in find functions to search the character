public class Main {
    public static void main(String[] args) {
        String inputString = "I am a programmer";
        char searchChar = 'p';
        int foundIndex = -1; 

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                foundIndex = i+1;
                break; 
            }
        }
        
        if (foundIndex != -1) {
            System.out.println(searchChar + " is found in string at index: " + foundIndex);
        } else {
            System.out.println(searchChar + " is not found in the string.");
        }
    }
}
