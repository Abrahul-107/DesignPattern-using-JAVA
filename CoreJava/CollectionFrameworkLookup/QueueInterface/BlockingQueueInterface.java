package CoreJava.CollectionFrameworkLookup.QueueInterface;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;


/*

The BlockingQueue Interface in Java is a part of the java.util.concurrent package and was introduced in Java 1.5. 
It is a specialized Queue implementation designed to handle thread-safe operations in concurrent environments. 
BlockingQueue is commonly used in Producer-Consumer patterns and other multithreaded scenarios.

    Thread Safe: BlockingQueue implementations are thread-safe, with all methods being atomic.
    Blocking Operation: Has blocking behavior if the queue is full (for producers) or empty (for consumers).
    No Null Elements: Attempts to insert a null will result in a NullPointerException.
    Bounded and Unbounded Queues: Can use both as the required case arrives:
    Bounded BlockingQueue: Fixed capacity, blocking producers when full.
    Unbounded BlockingQueue: Expands as needed (e.g., backed by a LinkedList), though subject to memory constraints.


    BlockingQueue methods like put() and take() are particularly useful in multithreaded producer-consumer patterns, 
    ensuring safe data exchange between threads.

    The interface does not allow nulls — adding a null will throw a NullPointerException.



 */

public class BlockingQueueInterface {
    public static void main(String[] args) {
        // Example 1: LinkedBlockingDeque (Unbounded)
        BlockingQueue<String> bqLinkedList = new LinkedBlockingDeque<>();

        // add(E e): Adds an element (throws IllegalStateException if capacity restrictions apply)
        bqLinkedList.add("RCB");
        bqLinkedList.add("Is");
        bqLinkedList.add("The");
        bqLinkedList.add("Best");
        bqLinkedList.add("Team");

        System.out.println("LinkedBlockingDeque contents: " + bqLinkedList);

        // offer(E e): Adds element, returns false if capacity restrictions apply
        boolean offered = bqLinkedList.offer("Champion");
        System.out.println("Offer Champion: " + offered);

        // peek(): Retrieves but does not remove the head, or returns null if empty
        String headElement = bqLinkedList.peek();
        System.out.println("Peek element: " + headElement);

        // poll(): Retrieves and removes the head, or returns null if empty
        String polledElement = bqLinkedList.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println("After poll(): " + bqLinkedList);

        // take(): Retrieves and removes the head, waits if necessary (blocking)
        try {
            String takenElement = bqLinkedList.take();
            System.out.println("Taken element: " + takenElement);
            System.out.println("After take(): " + bqLinkedList);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // put(E e): Inserts element, waits if necessary (blocking)
        try {
            bqLinkedList.put("Again");
            System.out.println("After put(): " + bqLinkedList);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // remainingCapacity(): Returns the remaining capacity
        int remainingCapacity = bqLinkedList.remainingCapacity();
        System.out.println("Remaining capacity: " + remainingCapacity);

        // remove(Object o): Removes a single instance of the element
        boolean removed = bqLinkedList.remove("Best");
        System.out.println("Removed 'Best'? " + removed);
        System.out.println("After remove(): " + bqLinkedList);

        // Example 2: ArrayBlockingQueue (Bounded)
        BlockingQueue<String> bqArray = new ArrayBlockingQueue<>(10);

        bqArray.add("RCB");
        bqArray.add("Is");
        bqArray.add("The");
        bqArray.add("Best");
        bqArray.add("Team");

        System.out.println("\nArrayBlockingQueue contents: " + bqArray);

        // offer(E e, long timeout, TimeUnit unit): Blocking offer with timeout
        try {
            boolean offeredWithTimeout = bqArray.offer("Champion", 2, TimeUnit.SECONDS);
            System.out.println("Offer with timeout: " + offeredWithTimeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // drainTo(Collection c): Drains all elements to another collection
        java.util.List<String> drainedList = new java.util.ArrayList<>();
        bqArray.drainTo(drainedList);
        System.out.println("After drainTo(): " + bqArray);
        System.out.println("Drained list: " + drainedList);

        // clear(): Removes all elements
        bqArray.clear();
        System.out.println("After clear(): " + bqArray);
    }
}
