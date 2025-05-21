package Day_2;

public class Ayan2 implements Runnable{
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		Thread t1=new Thread(new Ayan2());
		t1.start();

	}

}
