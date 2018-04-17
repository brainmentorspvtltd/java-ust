package factorydemo;

import javax.swing.BorderFactory;

public class ClientA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IProducer p = new Producer(); // Upcasting
		//IProducer p = new EnhanceProducer();
		IProducer p = Factory.getObject();
		p.callMe();
		
		
		//p.dontCallMe();

	}

}
