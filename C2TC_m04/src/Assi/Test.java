package Assi;

public class Test {
	public static void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println("In run() Thread Name:  " + threadName);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void run2() {
		String threadName = Thread.currentThread().getName();
		System.out.println("In run2() Thread Name:  " + threadName);

	}

	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread Name:  " + threadName);

		Test.run();
		Test.run2();
	}
}