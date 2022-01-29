package Types;
class Trees1{
	void breath(){
		System.out.println("Breathing");
	}
}
class fruits2 extends Trees1{
	void color() {
		System.out.println("yellow");
	}
}
class mango2 extends Trees1{
	void type() {
		System.out.println("hapus");
	}
}

public class hierar{

	public static void main(String[] args) {
		mango2 mg2=new mango2();
		mg2.type();
	    mg2.breath();
	
	}

}