package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicateInInteger {

	public static void main(String[] args) {
		Integer a[]= {0,4,5,6,4,5,1,3,3,2,1};
		List<Integer> lst=new ArrayList<Integer>(Arrays.asList(a));
		for (int i = 0; i < lst.size(); i++) {
			
			for (int j = i+1; j <lst.size(); j++) {
				
				if(lst.get(i)==lst.get(j)) {
					
				
		   		System.out.println(lst.get(i));	
				}
			}
		}
		}
			
		}
		
			
		
		
	

