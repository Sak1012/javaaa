import java.util.ArrayList;
import java.util.List;

class GenericStack<T> {
    private List<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack Contents: ");
            for (T item : stack) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}

public class GenericStackDemo {
    public static void main(String[] args) {
        GenericStack<Integer> integerStack = new GenericStack<>();
        GenericStack<String> stringStack = new GenericStack<>();
        GenericStack<Double> doubleStack = new GenericStack<>();

        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        stringStack.push("One");
        stringStack.push("Two");
        stringStack.push("Three");

        doubleStack.push(3.14);
        doubleStack.push(1.618);

        System.out.println("Integer Stack:");
        integerStack.displayStack();

        System.out.println("\nString Stack:");
        stringStack.displayStack();

        System.out.println("\nDouble Stack:");
        doubleStack.displayStack();

        integerStack.pop();
        stringStack.pop();

        System.out.println("\nAfter Popping:");
        integerStack.displayStack();
        stringStack.displayStack();
    }
}

