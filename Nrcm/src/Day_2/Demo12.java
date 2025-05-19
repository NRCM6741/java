package Day_2;

public class Demo12 {
	private String firstName;
	private String lastName;
	private String emailid;
	private long phonenumber;
	public void setFirstName(String fn) {
		firstName=fn;
		
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public void setEmailId(String ei) {
		emailid=ei;
		
	}
	public void setPhoneNumber(long pn) {
		phonenumber=pn;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmailId() {
		return emailid;
	}
	public long getPhoneNumber() {
		return phonenumber;
	}
	public static void main(String[] args) {
		Demo12 d1=new Demo12();
		d1.setFirstName("Archana");
		d1.setLastName("Meenapally");
		d1.setEmailId("meenapallyarchana@gmail.com");
		d1.setPhoneNumber(12334233245l);
		System.out.println(d1.getFirstName());
		System.out.println(d1.getLastName());
		System.out.println(d1.getEmailId());
		System.out.println(d1.getPhoneNumber());
	
	}

}
