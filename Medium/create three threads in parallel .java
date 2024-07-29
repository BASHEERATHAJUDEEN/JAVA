class NaturalNumbers extends Thread {
    private int start;
    NaturalNumbers(int start) {
        this.start = start;
    }
    public void run() {
        for (int i = start; i < start + 5; i++) {
            System.out.print(i + " ");
            try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        new NaturalNumbers(1).start();
        new NaturalNumbers(6).start();
        new NaturalNumbers(11).start();
    }
}
