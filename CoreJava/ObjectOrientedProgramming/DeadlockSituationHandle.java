package CoreJava.ObjectOrientedProgramming;


//Deadlock situation in java
/*public class Deadlock {
    // Object locks that are required by the threads for execution.
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        // Creating one thread and its implemented anonymous method.
        Thread thread1 = new Thread(() -> {
            // Acquiring locks in a consistent order.
            synchronized (lock1) {
                System.out.println("Thread 1 acquired lock 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock2) {
                    System.out.println("Thread 1 acquired lock 2");
                }
            }
        });

        // Creating another thread and its implemented anonymous method.
        Thread thread2 = new Thread(() -> {
            // Acquiring locks in the same consistent order.
            synchronized (lock1) {
                System.out.println("Thread 2 acquired lock 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock2) {
                    System.out.println("Thread 2 acquired lock 2");
                }
            }
        });

        // Starting both the threads.
        thread1.start();
        thread2.start();
    }
}
 */

public class DeadlockSituationHandle 
{
    // Object locks that are required by the threads for execution.
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) 
    {
        // Creating one thread and its implemented anonymous method.
        Thread thread1 = new Thread(() -> 
        {
            // Acquiring locks in a consistent order.
            synchronized (lock1) 
            {
                System.out.println("Thread 1 acquired lock 1");
                try 
                {
                    Thread.sleep(100);
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }

                synchronized (lock2) {
                    System.out.println("Thread 1 acquired lock 2");
                }
            }
        });

        // Creating another thread and its implemented anonymous method.
        Thread thread2 = new Thread(() -> 
        {
            // Acquiring locks in the same consistent order.
            synchronized (lock1) 
            {
                System.out.println("Thread 2 acquired lock 1");
                try 
                {
                    Thread.sleep(100);
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }

                synchronized (lock2) {
                    System.out.println("Thread 2 acquired lock 2");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
