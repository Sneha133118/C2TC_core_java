package thread;
class Mythread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++) {
			System.out.println("child Tread");
		}
	}
}
public class Threadgroup {

	public static void main(String[] args) {
		Mythread m=new Mythread();
		Thread t=new Thread(m);
		t.start();
	System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main Thread");
		}

	}
}


