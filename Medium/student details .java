class Student {
    String name;
    int regNo;
    int[] marks = new int[5];
    Student(String name, int regNo, int[] marks) {
        this.name = name;
        this.regNo = regNo;
        this.marks = marks;
    }
    void display() {
        int total = 0;
        for (int mark : marks) total += mark;
        double average = total / 5.0;
        System.out.println("Total Marks: " + total + ", Average: " + average);
    }
}
public class Main {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 92};
        Student student = new Student("Alice", 101, marks);
        student.display();
    }
}
