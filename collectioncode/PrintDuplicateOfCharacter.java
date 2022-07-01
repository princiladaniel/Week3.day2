package collectioncode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PrintDuplicateOfCharacter{

	public static void main(String[] args) {
		//2. [A,B,C,D,E,A,G,F,C] - Duplicate value of this -> A,C

	 Character[] ch= {'A','B','C','D','E','A','G','F','C','A'};
	
	List<Character> chlst=new ArrayList<Character>();
	chlst.addAll(Arrays.asList(ch));
	for (int i = 0; i <chlst.size(); i++) {
		
		for (int j =i+1; j < chlst.size(); j++) {
			
		
		if(chlst.get(i)==chlst.get(j)) {
				
		
		System.out.println(chlst.get(i));
		break;
		
	}
		}
	}
	
	}

}
