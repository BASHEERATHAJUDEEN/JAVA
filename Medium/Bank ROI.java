import java.util.*;

class Bank {
    private String name;
    private double interestRate;

    public Bank(String name, double interestRate) {
        this.name = name;
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String toString() {
        return name + ", " + interestRate;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Bank> banks = Arrays.asList(new Bank("SBI", 8.4), new Bank("ICICI", 7.3), new Bank("AXIS", 9.7));
        for (Bank bank : banks) System.out.println(bank);
    }
}
