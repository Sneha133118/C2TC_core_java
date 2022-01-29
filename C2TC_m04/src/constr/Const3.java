package constr;

public class Const3 {
String name;
int roll,age;
public Const3(String name,int roll,int age)
{
	this.name=name;
	this.roll=roll;
	this.age=age;
	
}
	public static void main(String[] args) {
		Const3 c1=new Const3("sneha",2,25);
		Const3 c2=new Const3("swaraj",5,18);
		System.out.println(c1.name+" "+c1.roll+" "+c1.age);
		System.out.println(c2.name+" "+c2.roll+" "+c2.age);
	}

}
