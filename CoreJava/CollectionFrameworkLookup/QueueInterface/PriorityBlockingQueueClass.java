package CoreJava.CollectionFrameworkLookup.QueueInterface;

import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;

/* 
    The PriorityBlockingQueue class in Java is part of the java.util.concurrent package.
    It implements a     thread-safe, unbounded priority queue     based on a priority heap.
    
Key Points:
    ✅ Implements both BlockingQueue and PriorityQueue semantics.
    ✅ Supports multiple producers and consumers.
    ✅ Elements are ordered according to their natural ordering (Comparable) or a custom Comparator.
    ✅ Allows duplicates but disallows null elements (NullPointerException if added).
    ✅ Does not block producers (unbounded) but blocks consumers if the queue is empty.


    | Interview Question                                               | Answer/Code Snippet                                                                                                        |
| ---------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
|     1. How does PriorityBlockingQueue differ from PriorityQueue?     | `PriorityBlockingQueue` is     thread-safe     and supports     blocking take()    , while `PriorityQueue` is     not thread-safe    . |
|     2. Is PriorityBlockingQueue bounded?                             | ❌ No, it’s unbounded by default.                                                                                           |
|     3. Can it contain null elements?                                 | ❌ No. Adding null throws `NullPointerException`.                                                                           |
|     4. Does it allow duplicates?                                     | ✅ Yes.                                                                                                                     |
|     5. Is FIFO guaranteed?                                           | ❌ No. Elements are ordered by priority (natural or Comparator).                                                            |
|     6. How does blocking work?                                       | Consumers calling `take()` block if the queue is empty.                                                                    |
|     7. How do producers work?                                        | Producers (threads adding elements) never block—queue grows dynamically.                                                   |
|     8. How does thread safety work?                                  | Internally uses locks to safely handle multiple threads.                                                                   |
|     9. How to initialize from a collection?                          | Pass any collection to the constructor: `new PriorityBlockingQueue<>(collection)`.                                         |
|     10. Does it use a heap?                                          | ✅ Yes, implemented using a     priority heap    .                                                                              |

  */

public class PriorityBlockingQueueClass {
    public static void main(String[] args) {
        // 1️⃣ Create PriorityBlockingQueue with default natural ordering (min-heap)
        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();
        pbq.add(34);
        pbq.add(23);
        pbq.add(45);
        pbq.add(1);
        System.out.println("PriorityBlockingQueue (natural order): " + pbq);

        // 2️⃣ Peek at the head element (smallest)
        System.out.println("Peek element: " + pbq.peek());

        // 3️⃣ Poll the head element (remove)
        System.out.println("Poll element: " + pbq.poll());
        System.out.println("After poll: " + pbq);

        // 4️⃣ Bulk initialization from a Vector
        Vector<Integer> v = new Vector<>();
        v.add(99);
        v.add(100);
        v.add(101);

        PriorityBlockingQueue<Integer> copyQueue = new PriorityBlockingQueue<>(v);
        System.out.println("CopyQueue from Vector: " + copyQueue);

        // 5️⃣ Demonstrate thread-safe insertion
        pbq.offer(55);
        System.out.println("After offer(55): " + pbq);

        // 6️⃣ Demonstrate size
        System.out.println("Size: " + pbq.size());

        // 7️⃣ Remove a specific element
        pbq.remove(23);
        System.out.println("After removing 23: " + pbq);

        // 8️⃣ Check for element presence
        System.out.println("Contains 34? " + pbq.contains(34));

        // 9️⃣ Clear all elements
        pbq.clear();
        System.out.println("After clear: " + pbq);
    }
}
