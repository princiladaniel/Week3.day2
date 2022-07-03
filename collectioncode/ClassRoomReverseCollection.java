package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassRoomReverseCollection {

	public static void main(String[] args) {
		/* 1. Reverse the collection
[Red, Green, Blue, Yellow, Brown]
[Brown, Yellow, Blue, Green, Red]
2. Print the even numbers in the list
[1,12,22,34,31,97,1154,32,2445,57,88]*/
		String[] str={"Rad","Green","Blue","Yellow","Brown"};
		List<String> lst= new ArrayList<String>(Arrays.asList(str));
		for (int i =lst.size()-1; i>=0 ; i--) {
		
		System.out.println(Arrays.asList(lst.get(i)));
		
		}

	}

}
