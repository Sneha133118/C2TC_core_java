package Types;

class fruits{
	void color() {
		System.out.println("yellow");
	}
}
class mango extends fruits{
	void type() {
		System.out.println("hapus");
	}
}

public class Single {
	public static void main(String[] args) {
		mango mg=new mango();
		mg.type();
		mg.color();
		
	}

	
}
