package StackAndQueues.QueueUsingStack;

public class QueueUsingStack {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue()); // Output: 1
        queue.enqueue(4);
        System.out.println(queue.dequeue()); // Output: 2
        System.out.println(queue.peek());    // Output: 3
        System.out.println(queue.isEmpty()); // Output: false
    }
}
