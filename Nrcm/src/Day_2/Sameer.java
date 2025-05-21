package Day_2;

class Test34 extends Thread{
	public void run() {
		System.out.println("good moring");
	}
	
}
class Test001 extends Test34{
	public void run() {
		System.out.println("good afternoon");
	}
}
class Test24 implements Runnable{
	 public void run() {
		 System.out.println("hello");
	 }
}
class Test003 extends Test24{
	public void run() {
		System.out.println("Archana");
	}
}

public class Sameer {

	public static void main(String[] args) {
		Test001 t1=new Test001();
		Test34 t4=new Test34();
		Test24 t5=new Test24();
		Test003 t6=new Test003();
	
		t1.start();
		t4.start();
		Thread t3=new Thread(t5);
		t3.start();
		Thread t7=new Thread(t6);
		t7.start();

	}

}
