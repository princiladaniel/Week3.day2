package collectionprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		Integer[] firstarr= {3,4,5,11,6,7};
		Integer[] secondarr= {2,4,5,6,8,11,3};
		List<Integer>lst1=new ArrayList<Integer>(Arrays.asList(firstarr));
		List<Integer>lst2=new ArrayList<Integer>(Arrays.asList(secondarr));
		for(int i=0;i<lst1.size();i++) {
			for (int j = 0; j <lst2.size(); j++) {
				if(lst1.get(i)==(lst2.get(j))) {
					System.out.println(lst1.get(i));
					
				}
			}
		}
		
		
		

	}

}
