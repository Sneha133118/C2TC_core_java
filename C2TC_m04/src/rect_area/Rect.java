package rect_area;

import java.util.Scanner;

public class Rect {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
	
System.out.println("Enter a Length");

Integer l=obj.nextInt();
System.out.println("Enter a Breadth");

Integer b=obj.nextInt();
int a;
a=l*b;
System.out.println("Area of rectangle is "+a);


	}

}
