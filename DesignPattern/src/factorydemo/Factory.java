package factorydemo;

import java.util.ResourceBundle;
import static factorydemo.ConfigConstants.CLASS_NAME_KEY;
import static factorydemo.ConfigConstants.CONFIG_NAME;
public class Factory {
	private Factory(){
		
	}
public static IProducer getObject(){
	//IProducer p  = new Producer();
	//IProducer p = new EnhanceProducer();
	ResourceBundle rb = ResourceBundle.getBundle(CONFIG_NAME);
	String className = rb.getString(CLASS_NAME_KEY);
	Object object = null;
	try {
		object = Class.forName(className).newInstance();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} // Upcasted Object
	IProducer p = (IProducer) object ; // Downcasting
	return p;
}
}
