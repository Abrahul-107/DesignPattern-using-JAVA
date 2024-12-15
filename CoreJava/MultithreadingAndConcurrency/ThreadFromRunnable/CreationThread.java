package CoreJava.MultithreadingAndConcurrency.ThreadFromRunnable;

public class CreationThread 
{ 
    public static void main(String[] args) 
    {
        System.out.println("Main thread is started");

        //Using Thread class 
        Thread thread = new FromThread();
        thread.start();
        
        //Using runnable interface 
        Thread thread2 = new Thread(new FromRunnable(),"thread2");
        thread2.start();
        System.out.println("Main thread is exiting"+ thread2);
        
    }    
}
