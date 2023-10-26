package in.com.StreamApi;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrectice {
	public static void main(String[] args) {
		
		List<String> name = List.of("ram", "rahul", "dilip", "sagar");
		List<String> newname = name.stream().filter(e ->e.startsWith("r")).collect(Collectors.toList());
		System.out.println(newname);
		
		List<Integer> num= List.of(1,2,3,44,55,6,5,1,2,3,5,6);
		List<Integer> newnum=num.stream().distinct().collect(Collectors.toList());
		Collections.sort(newnum);
		System.out.println(newnum);
		
		List<Integer> num2 = List.of(1,2,3,4,5,6);
		List<Integer> square = num2.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(square);
		
	}

}
