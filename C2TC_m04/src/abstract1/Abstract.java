package abstract1;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	abstract class Vehical
	{
		public abstract void NoOfWheels();
		public abstract void m2();
	}
	abstract class Scooty extends  Vehical
	{
		public  void NoOfWheels()
		{
			System.out.println(2);
		}
		
	}
}

