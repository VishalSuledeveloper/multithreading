package Multi;
class MyRunnableA5 implements Runnable
{
	public void run()
	{
		for (int i=0;i<10;i++) {
			System.out.println("@child thread Running... :"+i);
		}
	}
}


public class RunnableA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnableA5 r=new MyRunnableA5();
		Thread t1=new Thread(r);
		t1.start();
		for (int i=0;i<10;i++) {
			System.out.println("@Parent thread Running... :"+i);
		}

	}

}
