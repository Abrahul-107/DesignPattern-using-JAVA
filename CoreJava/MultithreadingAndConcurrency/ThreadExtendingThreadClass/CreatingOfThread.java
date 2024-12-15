package CoreJava.MultithreadingAndConcurrency.ThreadExtendingThreadClass;

public class CreatingOfThread
{
    public static void main(String args[])
    {
        FirstThread thread = new FirstThread();
        thread.start();
        SecondThread thread2 = new SecondThread();
        thread2.start();
    }
}