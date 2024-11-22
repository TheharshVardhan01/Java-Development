package Threading;

class MyFirst extends Thread
{
   
    public void run()
    {
        for(int i= 0; i<100; i+=2)
        {
            System.out.println(getName()+":"+i);
        }
    }
}

public class ThreadManager {
  public static void main(String[] args)
  {
    MyFirst mf = new MyFirst();
    mf.start();
    for(int i = 1; i<100; i+=2)
    {
        System.out.println(Thread.currentThread().getName()+i);
    }
  }  
}
