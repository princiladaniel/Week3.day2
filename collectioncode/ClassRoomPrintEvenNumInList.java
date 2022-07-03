package week4.day1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class ClassRoomPrintEvenNumInList {

	public static void main(String[] args) {

		//2. Print the even numbers in the list
		int[] num= {1,12,22,34,31,97,1154,32,2445,57,88};
		List<Integer>lst=new ArrayList<Integer>();
		for (int i = 0; i <num.length; i++) {
			lst.add(num[i]);
			if(num[i]%2==0) {
				System.out.print(Arrays.asList(num[i]));
			}
			
		}
		System.out.println(lst);
	}

	
	
}
