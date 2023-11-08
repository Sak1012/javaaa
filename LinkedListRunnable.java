import java.util.LinkedList;

public class LinkedListRunnable implements Runnable {
    private LinkedList<Integer> linkedList;

    public LinkedListRunnable(LinkedList<Integer> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public void run() {
        // Perform LinkedList operations within the run method
        for (int i = 1; i <= 5; i++) {
            addElement(i);
            printList();
            removeElement();
            printList();
        }
    }

    private void addElement(int value) {
        linkedList.add(value);
        System.out.println(Thread.currentThread().getName() + " added: " + value);
    }

    private void removeElement() {
        if (!linkedList.isEmpty()) {
            int removedValue = linkedList.remove();
            System.out.println(Thread.currentThread().getName() + " removed: " + removedValue);
        }
    }

    private void printList() {
        System.out.println(Thread.currentThread().getName() + " List: " + linkedList);
    }

    public static void main(String[] args) {
        LinkedList<Integer> sharedList = new LinkedList<>();
        LinkedListRunnable linkedListRunnable = new LinkedListRunnable(sharedList);

        Thread thread1 = new Thread(linkedListRunnable, "Thread 1");
        Thread thread2 = new Thread(linkedListRunnable, "Thread 2");

        thread1.start();
        thread2.start();
    }
}

