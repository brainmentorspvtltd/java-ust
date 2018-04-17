interface X{
	default void show(){
		System.out.println("X show");
	}
}
interface Y {
	default void show(){
		System.out.println("Y show");
	}
}
interface Z extends X,Y{
	default void show(){
		X.super.show();
		Y.super.show();
		System.out.println("Z show");
	}
}
class ZZ implements Z{
	
}
public class ProblemInJava8Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZZ obj = new ZZ();
		obj.show();
		

	}

}
