class MySingleTon{
	//private static final MySingleTon obj = new MySingleTon(); // Eager Singleton
	private static MySingleTon obj;
	private MySingleTon(){
		
	}
	//public static synchronized MySingleTon getInstance(){
	public static MySingleTon getInstance(){	
	// Lazy Singleton
		synchronized(MySingleTon.class){
		if(obj==null){  // Checking object is not present then create an object
			obj = new MySingleTon();
		}
		}
		return obj;
	}
}
public class SingleTonDemo {

	public static void main(String[] args) {
		MySingleTon obj1 = MySingleTon.getInstance();
		MySingleTon obj2 = MySingleTon.getInstance();
		System.out.println(obj1==obj2?"Same Ref":"Not Same Ref");
		
		// TODO Auto-generated method stub
		//MySingleTon obj = new MySingleTon();

	}

}
