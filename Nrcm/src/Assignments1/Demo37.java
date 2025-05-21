package Assignments1;
interface Root{
	void carrot();
}
class Greenveg{
	void heathy() {
		System.out.println("green leafy vegetables are rich in iron");
	}
}
class Veg extends Greenveg implements Root{
	public void carrot() {
		System.out.println("it is good for eyes");
	}
	public void beetroot() {
		System.out.println("Good for skin");
	}
}
class Fruits{
	void red() {
		System.out.println("Apple,Strawberry are the red color fruits");
	}
}
class SourFruits extends Fruits{
	void name() {
		System.out.println("lemon");
	}
}

public class Demo37 {
	public static void main(String[] args)
	{
		Veg v=new Veg();
		SourFruits s=new SourFruits();
		v.carrot();
		v.heathy();
		v.beetroot();
		s.red();
		s.name();
		
	}

}
