package CoreJava.MultithreadingAndConcurrency.ThreadFromRunnable;

public class FromRunnable implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println(Thread.currentThread()+"Inside runnable "+i+1);
    }
    
}
