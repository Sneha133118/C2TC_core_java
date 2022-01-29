package switch1;

public class Switch2 {

	public static void main(String[] args) {
	int x=10;
	final int y=20;
	switch(x)
	{
	case 10:
		System.out.println(10);
		break;
	case y:
		System.out.println(20);
		break;
	}

}
}