package even_odd;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		

System.out.println("Enter a number");

Integer n=obj.nextInt();
if(n%2==0)
	System.out.println("Entered number is even");
else
	System.out.println("Entered number is odd");
	}
	

}
