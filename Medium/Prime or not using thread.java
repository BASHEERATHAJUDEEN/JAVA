class PrimeChecker implements Runnable {
    int number;
    PrimeChecker(int number) {
        this.number = number;
    }
    public void run() {
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(number + (isPrime ? " is Prime" : " is not Prime"));
    }
}
public class Main {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        Thread thread = new Thread(new PrimeChecker(number));
        thread.start();
    }
}
