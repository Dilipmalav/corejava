package in.com.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Evenlist {
	public static void main (String []args) {
		
		List<Integer> li=new ArrayList<Integer>();
		
		li.add(11);
		li.add(22);
		li.add(33);
		li.add(10);
		li.add(8);
		li.add(9);
		li.add(5);
		
		System.out.println(li);
		
//		List<Integer> ev=new ArrayList<Integer>();
//		for(Integer i : li) {   // for each loop
//			if(i%2==0) {        // not us to stream api
//				ev.add(i);
//				
//				System.out.println(ev);
			
				
		// using stream api
				
				Stream<Integer> s = li.stream();
				List<Integer> ns = s.filter(e -> e % 2 ==0).collect(Collectors.toList());
				System.out.println(ns);
				
				
				}
		
	}
	


	
