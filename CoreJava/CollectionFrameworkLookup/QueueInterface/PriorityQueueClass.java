package CoreJava.CollectionFrameworkLookup.QueueInterface;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
   The PriorityQueue class in Java is part of the java.util package. It implements a priority heap-based queue that processes elements 
   based on their priority rather than the FIFO (First-In-First-Out) concept of a Queue.

Key Points:
    The PriorityQueue is based on the Priority Heap.
    The elements of the priority queue are ordered according to the natural ordering, and elements must implement Comparable, or by a 
    Comparator provided at queue construction time, depending on which constructor is used.  
    The size of the Priority Queue is dynamic, this means it will increase or decrease as per the requirement.



    | Interview Question                                        | Answer/Code Snippet                                                                                                                                    |
| --------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
|   1. Is PriorityQueue ordered like a sorted list?         | ❌ No. Internally uses a heap. The   head   (peek) is guaranteed to be the   smallest element (min-heap)  , but the rest is   not necessarily sorted  . |
|   2. How to remove the smallest element?                  | `pq.poll()` removes the head (smallest element).                                                                                                       |
|   3. How to check the head element without removing it?   | `pq.peek()` returns the head element without removal.                                                                                                  |
|   4. Can PriorityQueue contain duplicates?                | ✅ Yes, duplicates are allowed.                                                                                                                         |
|   5. Can it contain nulls?                                | ❌ No. Adding null throws `NullPointerException`.                                                                                                       |
|   6. Is it thread-safe?                                   | ❌ No. Use `PriorityBlockingQueue` for concurrency.                                                                                                     |
|   7. Can we make a max-heap?                              | ✅ Yes, using a custom Comparator: `new PriorityQueue<>(Comparator.reverseOrder())`.                                                                    |
|   8. How to remove a specific element?                    | `pq.remove(element)` removes the first occurrence.                                                                                                     |
|   9. How to convert PriorityQueue to array?               | `pq.toArray()`.                                                                                                                                        |
|   10. How is PriorityQueue implemented?                   | Internally uses a   binary heap  .                                                                                                                     |
|   11. What is the time complexity of add/poll/peek?       | All are   O(log n)   except `peek()` which is   O(1)  .                                                                                                |
|   12. Does PriorityQueue guarantee FIFO ordering?         | ❌ No. Only ordering by priority is guaranteed.                                                                                                         |

  */

public class PriorityQueueClass 
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(111);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        System.out.print(pq);

        //Printing the top element
        System.out.println(pq.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq.poll());

        System.out.println(pq);
        // 4️⃣ Remove a specific element
        pq.remove(3);
        System.out.println("After removing 3: " + pq);

        // Check if element exists
        System.out.println("Contains 2? " + pq.contains(2));

        //  Get size of the PriorityQueue
        System.out.println("Size: " + pq.size());

        // Convert to array
        Object[] arr = pq.toArray();
        System.out.print("Array: ");
        for (Object element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Clear all elements
        pq.clear();
        System.out.println("After clear: " + pq);

        //  Custom Comparator (Max-Heap)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(20);
        maxHeap.add(5);
        System.out.println("Max-Heap: " + maxHeap);

        //  Using offer() instead of add()
        maxHeap.offer(25);
        System.out.println("After offer(25): " + maxHeap);

        

    }
    
}
