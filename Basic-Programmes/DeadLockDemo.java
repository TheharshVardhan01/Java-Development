class Booking extends Thread
{
  Object train=null;
  Object comp  =null;
    
  public Booking(Object train, Object comp) 
  {
	super();
	this.train = train;
	this.comp = comp;
 }

public void run() 
  {
	System.out.println(getName()+"Booking start");
	synchronized (train)
	{
		System.out.println(getName()+"Book train");
		try
		{
			sleep(100);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		synchronized (comp)
		{
			System.out.println(getName()+"Book comp");
		}
		
	}
	System.out.println(getName()+"Booking end");
  }	
}
class Cancel extends Thread
{
	Object train=null;
	Object comp  =null;
	 
	public Cancel(Object train, Object comp)
	{
		super();
		this.train = train;
		this.comp = comp;
	}

	public void run() 
	   {
		
		System.out.println(getName()+"Cancel start");
		synchronized (comp)
		{
			System.out.println(getName()+"Cacnel comp");
			try
			{
				sleep(100);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			synchronized (train)
			{
				System.out.println(getName()+"Cancel train");
			}
			
		}
		System.out.println(getName()+"Cancel end");
	   }
}
public class DeadLockDemo 
{
 public static void main(String[] args) 
 {
		
   Object train  =new Object();
   Object comp  =new Object();
   Booking bk  =new Booking(train, comp);
   bk.setName("Ankit");
   Cancel cc =new Cancel(train, comp);
   cc.setName("Ankita");
   bk.start();
   cc.start();
 }
   
   
}