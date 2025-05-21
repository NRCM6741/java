package Assignments1;
interface Batting{
	void hitBoundary();
	void takeSingle();
}
class Batsman implements Batting{
	public void hitBoundary() {
		System.out.println("Dhoni hits a boundary!!");
	}
	public void takeSingle() {
		System.out.println("jadeja takes a single");
	}
	public void six() {
		System.out.println("Dhoni six is a helicopter short");
	}
}
interface Bowling{
	void bowlYorker();
	void bowlBouncer();
}
class Bowler implements Bowling{
	public void bowlYorker() {
		System.out.println("Bowler delivers a deadly yorker");
	}
	public void bowlBouncer() {
		System.out.println("Bowler throws a sharp bouncer.");
	}
}
interface Fielding{
	void catchBall();
	void wicket();
}
class Fielder implements Fielding{
	public void catchBall() {
		System.out.println("jadeja took a amazing catch");
	}
	public void wicket() {
		System.out.println("Dhoni hit the wicket in 0.2 sec");
	}
}


public class Demo36 {
	public static void main(String[] args) {
		Batsman b=new Batsman();
		Bowler b1=new Bowler();
		Fielder f1=new Fielder();
		b.hitBoundary();
		b.takeSingle();
		b1.bowlYorker();
		b1.bowlBouncer();
		f1.catchBall();
		f1.wicket();
		
	}

}
