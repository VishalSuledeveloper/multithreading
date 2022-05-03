package Multi;
class MyThreadDemoA5 extends Thread
{
	public void run()
	{
		for (int i=0;i<3;i++)
		{
			System.out.println("Child Thread ID :"+ Thread.currentThread().getId());
			System.out.println("Child Thread Name :"+Thread.currentThread().getName());
			Thread.currentThread().setName("Vishal");
			System.out.println("After change child Thread Name:"+Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName()+"Priority is:"+Thread.currentThread().getPriority());
		}
		
		for (int i=0;i<3;i++)
		{
			System.out.println("Sibling Thread ID :"+ Thread.currentThread().getId());
			System.out.println("Sibling Thread Name :"+Thread.currentThread().getName());
			Thread.currentThread().setName("Sachin");
			System.out.println("After change Sibling Thread Name:"+Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName()+"Priority is:"+Thread.currentThread().getPriority());
		}
	}
	
	
}

public class ThreadExtendDemoA5 {

	public static void main(String[] args) {
		MyThreadDemoA5 t1=new MyThreadDemoA5();
		t1.start();
		
		System.out.println("Parent Thread ID: "+ Thread.currentThread().getId());
		System.out.println("Parent Thread Name : "+Thread.currentThread().getName());
		Thread.currentThread().setName("Subhash");
		System.out.println("After change Parent Thread Name:"+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()+"Priority is:"+Thread.currentThread().getPriority());
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Parent Thread"+i);
		}
		

	}

}