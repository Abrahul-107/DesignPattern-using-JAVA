package CoreJava.CollectionFrameworkLookup.ListInterface;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        // Create a new LinkedList of Integers
        LinkedList<Integer> llst = new LinkedList<>();

        // add(E e): Adds element at the end
        llst.add(1);
        llst.add(2);
        llst.add(3);
        llst.add(45);

        System.out.println("Initial LinkedList: " + llst);

        // add(int index, E element): Adds element at specified position
        llst.add(2, 99);
        System.out.println("After add at index 2: " + llst);

        // addFirst(E e): Adds element at the beginning
        llst.addFirst(0);
        System.out.println("After addFirst: " + llst);

        // addLast(E e): Adds element at the end
        llst.addLast(100);
        System.out.println("After addLast: " + llst);

        // remove(): Removes first element
        llst.remove();
        System.out.println("After remove(): " + llst);

        // removeFirst(): Removes first element
        llst.removeFirst();
        System.out.println("After removeFirst(): " + llst);

        // removeLast(): Removes last element
        llst.removeLast();
        System.out.println("After removeLast(): " + llst);

        // get(int index): Gets element at index
        int elementAt2 = llst.get(2);
        System.out.println("Element at index 2: " + elementAt2);

        // getFirst(): Gets first element
        int firstElement = llst.getFirst();
        System.out.println("First element: " + firstElement);

        // getLast(): Gets last element
        int lastElement = llst.getLast();
        System.out.println("Last element: " + lastElement);

        // peek(): Retrieves first element without removing
        int peekElement = llst.peek();
        System.out.println("Peek element: " + peekElement);

        // peekFirst(): Retrieves first element without removing
        int peekFirst = llst.peekFirst();
        System.out.println("Peek first: " + peekFirst);

        // peekLast(): Retrieves last element without removing
        int peekLast = llst.peekLast();
        System.out.println("Peek last: " + peekLast);

        // poll(): Retrieves and removes first element
        int polledElement = llst.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println("After poll(): " + llst);

        // pollFirst(): Retrieves and removes first element
        int pollFirst = llst.pollFirst();
        System.out.println("Poll first element: " + pollFirst);
        System.out.println("After pollFirst(): " + llst);

        // pollLast(): Retrieves and removes last element
        int pollLast = llst.pollLast();
        System.out.println("Poll last element: " + pollLast);
        System.out.println("After pollLast(): " + llst);

        // push(E e): Pushes element at the front (stack behavior)
        llst.push(500);
        System.out.println("After push(): " + llst);

        // pop(): Removes and returns the first element
        int poppedElement = llst.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("After pop(): " + llst);

        // size(): Returns number of elements
        int size = llst.size();
        System.out.println("Size of LinkedList: " + size);

        // contains(Object o): Checks if LinkedList contains element
        boolean contains = llst.contains(3);
        System.out.println("Contains 3? " + contains);

        // isEmpty(): Checks if LinkedList is empty
        boolean isEmpty = llst.isEmpty();
        System.out.println("Is LinkedList empty? " + isEmpty);

        // clear(): Removes all elements
        llst.clear();
        System.out.println("After clear(): " + llst);
    }
}
