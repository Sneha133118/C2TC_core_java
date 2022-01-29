package thrad1;


public class Thread1 extends Thread {
	
	public void run() {
		System.out.println("Preforming Task 1");
		String threadName = Thread.currentThread().getName(); 
		System.out.println("In run() Thread Name:  "+threadName);
	}
}