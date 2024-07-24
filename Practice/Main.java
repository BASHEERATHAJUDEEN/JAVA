import java.io.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner abs = new Scanner(System.in);
    String name = abs.nextLine();
    int age = abs.nextInt();
    int salary = abs.nextInt();
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary=: " + salary);
  }
}