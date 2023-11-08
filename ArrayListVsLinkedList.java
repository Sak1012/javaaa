import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        int n = 100000;

        // ArrayList insertion in the middle
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        long arrayListDuration = System.nanoTime() - startTime;
        System.out.println("ArrayList insertion time: " + arrayListDuration + " ns");

        // LinkedList insertion in the middle
        List<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        long linkedListDuration = System.nanoTime() - startTime;
        System.out.println("LinkedList insertion time: " + linkedListDuration + " ns");
    }
}

