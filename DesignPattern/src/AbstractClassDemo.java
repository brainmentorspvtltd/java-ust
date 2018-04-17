abstract class Loan{
	double balance;
	int accountNo;
	void applyForLoan(){
		System.out.println("To Apply a Loan Fill the Loan Form");
	}
}
class HomeLoan extends Loan
{
	void lowROI(){
		
	}
}
class AutoLoan extends Loan{
	void mediumROI(){
		
	}
}
class PersonalLoan extends Loan{
	void highROI(){
		
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeLoan tenYears = new HomeLoan();
		tenYears.lowROI();
		tenYears.applyForLoan();
		//Loan loan = new Loan();
	}

}
