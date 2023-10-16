import java.util.Scanner;

class Bank {
    protected double rateOfInterest;

    public void setRateOfInterest(double rate) {
        rateOfInterest = rate;
    }

    public double calculateSimpleInterest(double principal, int time) {
        return (principal * rateOfInterest * time) / 100.0;
    }
}

class BankA extends Bank {
    public BankA() {
        setRateOfInterest(10.0); // Bank A's interest rate
    }
}

class BankB extends Bank {
    public BankB() {
        setRateOfInterest(9.0); // Bank B's interest rate
    }
}

class BankC extends Bank {
    public BankC() {
        setRateOfInterest(7.0); // Bank C's interest rate
    }
}

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        int time = scanner.nextInt();

        System.out.print("Select the bank (A, B, or C): ");
        String bankChoice = scanner.next();

        Bank selectedBank;

        switch (bankChoice.toUpperCase()) {
            case "A":
                selectedBank = new BankA();
                break;
            case "B":
                selectedBank = new BankB();
                break;
            case "C":
                selectedBank = new BankC();
                break;
            default:
                System.out.println("Invalid bank selection.");
                scanner.close();
                return;
        }

        double interest = selectedBank.calculateSimpleInterest(principal, time);
        System.out.println("Simple Interest from Bank " + bankChoice + ": " + interest);

        scanner.close();
    }
}

