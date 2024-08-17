import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {
    private Queue<Integer> queue;

    public StackUsingSingleQueue() {
        queue = new LinkedList<>();
    }

    // Push operation
    public void push(int x) {
        int size = queue.size();
        queue.add(x);

        // Move all elements that were in the queue to the back
        for (int i = 0; i < size; i++) {
            queue.add(queue.poll());
        }
    }

    // Pop operation
    public int pop() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue.poll();
    }

    // Peek operation
    public int peek() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue.peek();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingSingleQueue stack = new StackUsingSingleQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek()); // Output: 3
        System.out.println("Popped element: " + stack.pop()); // Output: 3
        System.out.println("Top element after pop: " + stack.peek()); // Output: 2
    }
}
