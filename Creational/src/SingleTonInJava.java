class Customer{
	int id;
	String name;
	double balance;
}
public class SingleTonInJava {

	public static void main(String[] args) {
		Customer amit = new Customer();
		Customer ram = new Customer();
		//Runtime r1 = new Runtime();
		// Runtime class is a singleton class
		Runtime r = Runtime.getRuntime(); // I will provide a Heap Details
		Runtime r2 = Runtime.getRuntime();
		if(r==r2){
			System.out.println("Same Ref");
		}
		else{
			System.out.println("Not Same Ref");
		}
		
		// TODO Auto-generated method stub

	}

}
