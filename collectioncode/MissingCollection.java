package collectioncode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingCollection {

	public static void main(String[] args) {
		Integer[] num= {1,5,6,7,2,4,7,8,9,10,6,7};
		Set<Integer>set=new TreeSet<Integer>();
		set.addAll(Arrays.asList(num));
		List<Integer> lst=new ArrayList<Integer>(set);
		for (int i = 0; i < lst.size(); i++) {
			if(lst.get(i)!=i+1) {
				System.out.println(i+1);
				break;
			}
		}

	}

}
