package Day_2;

public class Gaurav extends Thread {
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			if(i==5) {
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		Gaurav g1=new Gaurav();
		g1.start();
		

	}

}
