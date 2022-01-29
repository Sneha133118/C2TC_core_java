package thrad1;


public class Test {
	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName(); 
		System.out.println("Thread Name:  "+threadName);
		
		Thread1 thread = new Thread1();
//		thread.run();
		thread.start();
		System.out.println("--End of main---");
		}
}
