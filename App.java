import java.util.Random;

class RandomNumberGenerator implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(100); // Generate a random integer between 0 and 99
            System.out.println("Generated: " + randomNumber);
            if (randomNumber % 2 == 0) {
                Thread.currentThread().setName("EvenThread");
                synchronized (App.lock) {
                    App.value = randomNumber;
                    App.isEvenComputed = true;
                }
            } else {
                Thread.currentThread().setName("OddThread");
                synchronized (App.lock) {
                    App.value = randomNumber;
                    App.isOddPrinted = true;
                }
            }
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenNumberSquareCalculator implements Runnable {
    @Override
    public void run() {
        while (true) {
            if (App.isEvenComputed) {
                synchronized (App.lock) {
                    int square = App.value * App.value;
                    System.out.println("Square: " + square);
                    App.isEvenComputed = false;
                }
            }
        }
    }
}

class OddNumberCubePrinter implements Runnable {
    @Override
    public void run() {
        while (true) {
            if (App.isOddPrinted) {
                synchronized (App.lock) {
                    int cube = App.value * App.value * App.value;
                    System.out.println("Cube: " + cube);
                    App.isOddPrinted = false;
                }
            }
        }
    }
}

public class App {
    public static int value;
    public static boolean isEvenComputed;
    public static boolean isOddPrinted;
    public static Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new RandomNumberGenerator());
        Thread t2 = new Thread(new EvenNumberSquareCalculator());
        Thread t3 = new Thread(new OddNumberCubePrinter());

        t1.start();
        t2.start();
        t3.start();
    }
}

