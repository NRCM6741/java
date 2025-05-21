package CollectonFrameWork;
import java.util.*;

public class Sem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,6,3,4};
		Arrays.sort(arr);
		int a=Arrays.binarySearch(arr, 3);
		System.out.println(a);
		for(int i:arr)
		{
		System.out.println(i);
		}
	}

}
