import java.io.*;
public class FileReadWrite {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Computer Science and Engineering");
        } catch (IOException e) { e.printStackTrace(); }

        try (FileReader reader = new FileReader("output.txt")) {
            int data;
            while ((data = reader.read()) != -1) System.out.print((char) data);
        } catch (IOException e) { e.printStackTrace(); }
    }
}
