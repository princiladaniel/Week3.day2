package collectionprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionInString {

	public static void main(String[] args) {
		String[] firstarr= {"3","4","5","11","6","7"};
		String[] secondarr= {"2","4","6","8","11","3"};
		List<String>lst1=new ArrayList<String>(Arrays.asList(firstarr));
		List<String>lst2=new ArrayList<String>(Arrays.asList(secondarr));
		for(int i=0;i<lst1.size();i++) {
			for (int j = 0; j <lst2.size(); j++) {
				if(lst1.get(i).contains(lst2.get(j))) {
					System.out.println(lst1.get(i));
					
				}
			}
		}
		
	}

}
