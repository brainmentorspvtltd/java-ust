import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

interface Card{
	void applyForCard();
	void cardHolderDetails();
	void schemes();
	void bonus();
	
}
class CardAdapter implements Card{

	@Override
	public void applyForCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cardHolderDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void schemes() {
		// TODO Auto-generated method stub
		System.out.println("Schmes for All Cards is 20% Off on every Purchase..");
	}

	@Override
	public void bonus() {
		// TODO Auto-generated method stub
		
	}
	
}
class SilverCard extends CardAdapter{
	@Override
	public void applyForCard(){
		System.out.println("Silver Card Apply Process..");
	}
}

class GoldCard extends CardAdapter{
	@Override
	public void applyForCard(){
		System.out.println("Gold Card Apply Process..");
	}
	@Override
	public void bonus() {
		System.out.println("Gold Card Bonus....");
		
	}
}
 

class Login extends JFrame {
Login(){
	setTitle("My Login Frame");
	setSize(400,400);
	setVisible(true);
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e){
			
			int choice = JOptionPane.showConfirmDialog(Login.this, 
					"Do u want to close this window","",JOptionPane.YES_NO_OPTION);
			if(choice == JOptionPane.YES_OPTION){
				System.exit(0);
			}
			else{
				return ;
			}
		}
	});
}
	
}

public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login = new Login();
		SilverCard s = new SilverCard();
		s.applyForCard();
		GoldCard g = new GoldCard();
		g.applyForCard();
		g.bonus();
		WindowAdapter w;
		WindowListener q;
		
	}

}
