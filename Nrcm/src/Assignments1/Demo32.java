package Assignments1;
interface Logger{
	void log(int d);
	
}
interface SecureTransaction{
	void transferFunds();
}
class UserAccount{
	void showBalance(double d) {
		System.out.println("balance:"+d);
	}
}
class Onlinetransaction extends UserAccount implements Logger,SecureTransaction{
	public void transferFunds() {
		System.out.println("transaction Successful!");
	}
	public void log(int d) {
		System.out.println("Account Number:"+d);
	}
}

public class Demo32 {
	public static void main(String[] args) {
		Onlinetransaction o=new  Onlinetransaction();
		o.log(12345);
		o.showBalance(2345.500);
		o.transferFunds();
	}

}
