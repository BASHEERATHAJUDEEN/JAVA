class FibonacciGenerator implements Runnable {
    int count;
    FibonacciGenerator(int count) {
        this.count = count;
    }
    public void run() {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < count; i++) {
            int temp = b;
            b = a + b;
            a = temp;
            System.out.print(b + " ");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        Thread thread = new Thread(new FibonacciGenerator(count));
        thread.start();
    }
}
