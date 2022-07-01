package collectioncode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		Integer[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> data=new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(data);
		
		Set<Integer>set=new LinkedHashSet<Integer>();
		for (Integer value : data) {
			if((data.indexOf(value))!=(data.lastIndexOf(value))) {
				set.add(value);
			}
		
		}
		System.out.println(set);
		
		
		
		
		
		
		
		
		
		
		
	}

}
