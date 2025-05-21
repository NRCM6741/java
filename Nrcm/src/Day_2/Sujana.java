package Day_2;

public class Sujana {

	public static void main(String[] args) {
		Runnable r1=new Runnable() {
			public void run() {
				for(int i=0;i<=10;i++) {
				System.out.println("task one");
				if(i==5) {
					try {
						Thread.sleep(2000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				}
			}
		};
		Runnable r2=new Runnable() {
			public void run() {
				System.out.println("task two");
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		Thread t2=new Thread(r2);
		t2.start();

	}

}
