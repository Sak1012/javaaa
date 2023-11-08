import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        int n = 100000;

        // ArrayList insertion in the middle
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        long arrayListDuration = System.currentTimeMillis() - startTime;
        System.out.println("ArrayList insertion time: " + arrayListDuration + " ms");

        // LinkedList insertion in the middle
        List<Integer> linkedList = new LinkedList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        long linkedListDuration = System.currentTimeMillis() - startTime;
        System.out.println("LinkedList insertion time: " + linkedListDuration + " ms");
    }
}

