package Day_2;

public class Test25 implements Runnable {
	 public void run() {
		 System.out.println("hi");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test25 t1=new Test25();
		Test25 t4=new Test25();
		Thread t2=new Thread(t1);
		Thread t3=new Thread(t4);
		
		System.out.println("hello");
		t1.run();
		t4.run();
		

	}

}
