package thread4;

public class Test {

	public static void main(String[] args) {
		
		Thread  t1 = new Thread(new Task1()); //worker1
		Thread  t2 = new Thread(new Task2()); //worker2
		t1.start();
		t2.start();
	}

}
