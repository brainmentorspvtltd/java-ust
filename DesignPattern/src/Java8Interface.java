interface A{
	void show(); // public abstract void show();
	public default void print(){
		System.out.println("I am a Print...");
	}
}
class B implements A{
	public void show(){
		System.out.println("B Show");
	}
}
public class Java8Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.show();
		b.print();
	}

}
