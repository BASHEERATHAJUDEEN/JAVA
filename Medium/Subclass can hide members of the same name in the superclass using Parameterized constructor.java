class SuperClass {
    int value;

    SuperClass(int value) {
        this.value = value;
        System.out.print(value + ", ");
    }
}

class SubClass extends SuperClass {
    int value;

    SubClass(int superValue, int subValue) {
        super(superValue);
        this.value = subValue;
        System.out.print(subValue);
    }
}

public class Main {
    public static void main(String[] args) {
        new SubClass(100, 200); // Sample Input
    }
}
