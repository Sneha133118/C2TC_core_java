package interfacees;
interface A
{
	void Adisplay();
}
interface B
{
	void Bdisplay();
}
class MIE implements A,B
{
	public void Adisplay()
	{
		System.out.println("I am A");
	}
	public void Bdisplay()
	{
		System.out.println("I am B");
	}
}
public class AB {

	public static void main(String[] args) {
		MIE obj=new MIE();
		obj.Adisplay();
		obj.Bdisplay();

	}

}