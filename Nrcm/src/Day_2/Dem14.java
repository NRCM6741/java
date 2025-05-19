package Day_2;

public class Dem14 {
	int x;
	int y;
	public Dem14(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public Dem14(Dem14 t1)
	{
		this.x=t1.x;
		this.y=t1.y;
		System.out.println(x-y);
	}

	public static void main(String[] args) {
		Dem14 t1=new Dem14(12,3);
		Dem14 t2=new Dem14(t1);

	}

}
