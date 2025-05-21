package Assignments1;

interface Friend{
	void name();
}
interface Place{
	void place();
}
interface Habits extends Friend,Place{
	void action();
}
class Demo28 implements Habits{
	public void name() {
		System.out.println("Gaurav");
	}
	public void place() {
		System.out.println("Hyderabad");
	}
	public void action() {
		System.out.println("Reading books");
	}
	public void marritalstatus() {
		System.out.println("single");
	}

	public static void main(String[] args) {
		Demo28 d1=new Demo28();
		d1.name();
		d1.place();
		d1.action();
		d1.marritalstatus();
		

	}

}