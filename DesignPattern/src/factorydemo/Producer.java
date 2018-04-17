package factorydemo;

public class Producer implements IProducer {
	@Override
	public void callMe(){
		System.out.println("Call Me Producer...");
	}
	public void dontCallMe(){
		System.out.println("Don't Call Me Producer");
	}
	

}
