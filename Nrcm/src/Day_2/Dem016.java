package Day_2;

public class Dem016 {
	int ssc;
	int inter;
	int btech;
	public Dem016() {
		System.out.println("Welcome to my Profile:Archana");
		
	}
	public Dem016(int ssc) {
		this.ssc=ssc;
		System.out.println("SSC:"+ssc);
	}
	public Dem016(int ssc,int inter) {
		this.ssc=ssc;
		this.inter=inter;
		System.out.println("inter:"+ssc+inter);
	}
	public Dem016(int ssc,int inter,int btech) {
		this.ssc=ssc;
		this.inter=inter;
		this.btech=btech;
		System.out.println("BTECh:"+ 
		ssc + inter + btech);

	}
	public static void main(String[] args) {
		Dem016 t1=new Dem016();
		Dem016 t2=new Dem016(100);
		Dem016 t3=new Dem016(100,936);
		Dem016 t4=new Dem016(100,936,500);
		
		
	}
}
