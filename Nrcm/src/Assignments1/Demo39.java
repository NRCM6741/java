package Assignments1;
interface Ac{
	void setTemp();
}
interface Light{
	void dim();
}
interface Fan{
	void speed();


interface Device extends Ac,Light,Fan{
	void on();
	void off();
}
class Smartcontroller implements Device{
	public void setTemp() {
		System.out.println("16");
	}
	public void dim() {
		System.out.println("light glows dim");
	}
	public void speed() {
		System.out.println("Set fan to 5");
	}
	public void on() {
		System.out.println("turn on the device");
	}
	public void off() {
		System.out.println("turn off the device");
	}
	
}


public class Demo39 {
	public static void main(String[] args) {
		Smartcontroller s=new Smartcontroller();
		s.on();
		s.off();
		s.setTemp();
		s.speed();
		s.dim();
		
	}

}
}
