package collectioncode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindIntersection {
 
public static void main(String[] args) {
	Integer[] firstArray = { 3, 2, 11, 4, 6, 7 };//12
	Integer[] secondArray = { 1, 2, 8, 4, 9, 7 };//456

	List<Integer> lst1=new ArrayList<Integer>(Arrays.asList(firstArray));
	List<Integer> lst2=new ArrayList<Integer>(Arrays.asList(secondArray));
  Set<Integer>set=new LinkedHashSet<Integer>();
	for (Integer valuelst1 : lst1) {
	
		if((lst2.indexOf(valuelst1))>-1) {
			
			set.add(valuelst1);
			
		}
		}
		System.out.println(set);
		}
	

		}


	

	

