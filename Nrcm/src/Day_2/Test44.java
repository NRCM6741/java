package Day_2;

public class Test44 implements Runnable {
	 public void run() {
		 System.out.println("hi");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test44 t1=new Test44();
		Thread t2=new Thread(t1);
		Thread t3=new Thread(t1);
		
		System.out.println("hello");
		t2.start();
		t3.start();
		

	}

}
