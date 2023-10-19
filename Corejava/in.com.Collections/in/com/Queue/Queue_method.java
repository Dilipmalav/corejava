package in.com.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_method {
	
	public static void main(String[] args) {
		
		Queue<Integer> num = new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		num.add(16);
		
		//num.element();
		System.out.println(num);
		  
		 num.offer(114);
		 System.out.println(num);
		 
		 System.out.println(num.peek());
		 num.poll();
		 System.out.println(num);
		 
		 num.remove();
		 System.out.println(num);
	}

}
