interface DB{ // What to Do
	public static final int MAX_CONNECTION = 100; 
	void open(); // public abstract void open();
	void close(); // public abstract void close();
}
// class How to do
class OracleDB implements DB{
	@Override
	public void open(){
		System.out.println("Logic to Open a DB Connection in Oracle");
	}
	@Override
	public void close(){
		System.out.println("Code to Close a DB Conneciton in Oracle");
	}
}
class MySQLDB implements DB{
	@Override
	public void open(){
		System.out.println("Logic to Open a DB Connection in MYSQL");
	}
	@Override
	public void close(){
		System.out.println("Code to Close a DB Conneciton in MYSQL");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
