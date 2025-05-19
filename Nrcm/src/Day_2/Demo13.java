package Day_2;

public class Demo13 {
	int a;
	int b;
	public  Demo13(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
		
	}
	public static void main(String[] args) {
		Demo13 d2=new Demo13(12,7);
		d2.add();
		
	}

}
