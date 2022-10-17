package sampleCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargeNumber {

	public static void main(String[] args) {
		//using list
		Integer[] data = { 3, 2, 11, 4, 6, 7 };
		List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(data));
		
		Collections.sort(dataList);
		System.out.println("The Second Largest Number is " + dataList.get(dataList.size() - 2));
		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */
		int [] data = { 3, 2, 11, 4, 6 };
		//a) Create a empty Set Using TreeSet
		Set<Integer> set=new TreeSet<Integer>();
		//b) Declare for loop iterator from 0 to data.length and add into Set 
		for (int i = 0; i < data.length; i++) {
			set.add(data[i]);
		}
		//c) converted Set into List
		List<Integer> dataList = new ArrayList<Integer>(set);
		//d) Print the second last element from List
		System.out.println("The Second Largest Number is " + dataList.get(dataList.size() - 2));
		
		

	}

}
