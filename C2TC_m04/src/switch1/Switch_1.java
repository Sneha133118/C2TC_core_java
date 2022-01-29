package switch1;
import java.util.Scanner;

public class Switch_1 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		Integer n=obj.nextInt();
		switch(n)
		{
		case 0:
			System.out.println(0);
			break;
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		default:
			System.out.println("invalid");
			break;
		}
}
}