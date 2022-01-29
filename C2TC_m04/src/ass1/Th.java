package ass1;

import java.util.Scanner;

public class Th {

	public static void main(String[] args) throws Fail {
	int marks;
	System.out.println("Enter the marks of english subject");
	Scanner obj=new Scanner(System.in);
	marks= obj.nextInt();
	if(marks<32)
	{
		throw new Fail("You are fail");
		
	}
	else {
		System.out.println("you are pass");
	}
	
	
	}

}
class Fail extends RuntimeException
{
	Fail(String msg)
	{
		super(msg);
	}
}
