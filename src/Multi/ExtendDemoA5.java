package Multi;

class MyThreadA5 extends Thread 
{
	public void run()//need to write for thread in run method
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("@Child Thread :"+i);
		}
	}
}
public class ExtendDemoA5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadA5 t=new MyThreadA5();
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread :"+i);
		}

	}

}
