package Day_2;

public class Threads extends Thread {
	String s;
	public Threads(String name) {
		s=name;
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(s+" is daemon Thread");
		}else {
			System.out.println(s+" is user thread");
		}


	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads t1=new Threads("t1");
		Threads t2=new Threads("t2");
		Threads t3=new Threads("t3");
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.setDaemon(false);
		t3.start();

	}

}
