package factorydemo;

public class ClientB {
	public static void main(String[] args) {
		IProducer p = Factory.getObject();
		//IProducer p = new Producer(); //Upcasting
		p.callMe();
		//p.dontCallMe();
		
	}

}
