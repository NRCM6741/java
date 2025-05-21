package Day_2;
class Test01 extends Thread{
	public void run() {
		System.out.println("good moring");
	}
	
}
class Test02 implements Runnable{
	 public void run() {
		 System.out.println("hello");
	 }
}

public class Test0 {

	public static void main(String[] args) {
		Test01 t1=new Test01();
		Test02 t2=new Test02();
		t1.start();
		Thread t3=new Thread(t2);
		t3.start();

	}

}
