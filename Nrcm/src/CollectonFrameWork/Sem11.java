package CollectonFrameWork;
import java.util.*;


public class Sem11 {
	public static void main(String[] args) {
		Queue<Integer>q1=new PriorityQueue<Integer>();
		q1.add(12);
		q1.offer(45);
		q1.offer(48);
		q1.offer(78);//it acts as enqueue
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
		
	}

}
