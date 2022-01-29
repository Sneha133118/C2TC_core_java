package Types;
class Trees{
	void breath(){
		System.out.println("Breathing");
	}
}
class fruits1 extends Trees{
	void color() {
		System.out.println("yellow");
	}
}
class mango1 extends fruits1{
	void type() {
		System.out.println("hapus");
	}
}

public class Multi {

	public static void main(String[] args) {
		mango1 mg1=new mango1();
		mg1.type();
		mg1.color();
		mg1.breath();
	
	}

}
