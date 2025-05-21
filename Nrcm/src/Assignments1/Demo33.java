package Assignments1;
interface Drivable{
	void drive();
}
interface Flyable{
	void fly();
}
class Floatable{
	void floatOn() {
		System.out.println("floating on water");
	}
}
class Vehicle extends Floatable implements Drivable,Flyable{
	public void drive() {
		System.out.println("Driving on the road");
	}
	public void fly() {
		System.out.println("Flying in the air");
	}
}
class AutoVehicles extends Vehicle{
	void autopilot() {
		System.out.println("Autopilot activated!!");
	}
}

public class Demo33 {
	public static void main(String[] args) {
		AutoVehicles a1=new AutoVehicles();
		a1.drive();
		a1.fly();
		a1.floatOn();
		a1.autopilot();
		
	
	}

}
