package collectionprogram;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
					
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		int count=0;
		String text = "We learn java basics as part of java as sessions in java week1";
		String[] split = text.split(" ");
		//List<String> str=new ArrayList<String>(split);
		Set<String>str=new LinkedHashSet<String>(Arrays.asList(split));
		for (String string : str) {
			System.out.println(string);
		}
				
		System.out.println(str);

		
		
			

	}

}
