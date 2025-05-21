package Day_2;

public class Test43 extends Thread {
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test43 t1=new Test43();
		System.out.println("hello");
		t1.start();

	}

}
