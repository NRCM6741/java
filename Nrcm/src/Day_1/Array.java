package Day_1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,2};
		int a1[]=new int[a.length];
		int min=a[0];
		
		//for (int x:a) {
		for(int i=1;i<a.length;i++) {
			if(a[i]>min) {
				min=a[i];
			
			}
		}
		System.out.println(min);
				

	}

}
