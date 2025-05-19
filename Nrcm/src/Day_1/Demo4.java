package Day_1;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="HelloWorld";
		int countl=0;
		for(int i=0;i<s1.length()-1;i++) {
			char ch=s1.charAt(i);
			if(ch=='l')
			{
				countl++;
			}
		   
		}
		 System.out.println(countl);
	}

}
