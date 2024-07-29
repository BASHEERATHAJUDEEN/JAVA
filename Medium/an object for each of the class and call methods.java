class ParentClass {
    void printMessage() {
        System.out.println("This is parent class");
    }
}
class ChildClass extends ParentClass {
    void printMessage() {
        System.out.println("This is child class");
    }
}
public class Main {
    public static void main(String[] args) {
        ParentClass parentObject = new ParentClass();
        parentObject.printMessage();
        ChildClass childObject = new ChildClass();
        childObject.printMessage(); 
        ParentClass parentRef = new ChildClass();
        parentRef.printMessage(); 
    }
}
