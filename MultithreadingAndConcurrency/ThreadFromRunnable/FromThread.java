package MultithreadingAndConcurrency.ThreadFromRunnable;

public class FromThread extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println("Inside the from THREAD"+i+1);
    }

}