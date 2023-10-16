class AssemblyLineWorker extends Thread {
    private String workerName;
    private int productsAssembled;

    public AssemblyLineWorker(String name) {
        this.workerName = name;
        this.productsAssembled = 0;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(100); // Simulate the time it takes to assemble a product
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            productsAssembled++;
            System.out.println(workerName + " assembled product " + productsAssembled);
        }
    }
}

public class AssemblyLineSimulation {
    public static void main(String[] args) {
        int numWorkers = 3;
        AssemblyLineWorker[] workers = new AssemblyLineWorker[numWorkers];

        for (int i = 0; i < numWorkers; i++) {
            workers[i] = new AssemblyLineWorker("Worker " + (i + 1));
            workers[i].start();
        }

        for (int i = 0; i < numWorkers; i++) {
            try {
                workers[i].join(); // Wait for each worker to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Assembly line simulation completed.");
    }
}

