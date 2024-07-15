package MultithreadingAndConcurrency.ThreadExtendingThreadClass;


//Creation of thread extending the Thread class in java
public class FirstThread extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread1 is running"+i);
        }
    }
}
