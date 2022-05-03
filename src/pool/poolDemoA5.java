package pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnablePoolA5 implements Runnable
{
	public String name;
	public MyRunnablePoolA5 (String temp)
	{
		name=temp;
		
	}
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId()+"Strted  "+name);
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread"+Thread.currentThread().getId()+"Stopped");
		
	}
}

public class poolDemoA5 {

	public static void main(String[] args) {
		ExecutorService ex1 =Executors.newFixedThreadPool(5);
		ExecutorService ex2 =Executors.newFixedThreadPool(4);
		ExecutorService ex3 =Executors.newFixedThreadPool(3);
		
		
		for (int i=0;i<20;i++)
		{
			Runnable r1 =new MyRunnablePoolA5("Painter"+i);
			ex1.execute(r1);
			Runnable r2 =new MyRunnablePoolA5("Electrician"+i);
			ex2.execute(r2);
			Runnable r3 =new MyRunnablePoolA5("Plumber"+i);
			ex3.execute(r3);
			
		}
		

	}

}
