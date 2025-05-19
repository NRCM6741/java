package Day_2;
class FixedAmount{
	public int amount=10000;
}
abstract class WithdrawlAmount{
	abstract void withdraw(int cash);
}

public class Demo11 extends WithdrawlAmount {
	FixedAmount f1=new FixedAmount();
	void withdraw(int cash) {
		f1.amount-=cash;
		System.out.println("Withdrawn:"+cash);
		System.out.println("Avail balance:"+f1.amount);
	}
	
	public static void main(String[] args) {
		int cash=Integer.parseInt(args[0]);
		Demo11 d=new Demo11();
		d.withdraw(cash);
       
	}

}
