package collectionprogram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnCollectionDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//input=1 to 10  {2,3,6,7,1,5,8,9,10,2,5,6,}
	//String[]=princila  princla
		//print unique char
		String input="Princila";
		Set <Character>name=new HashSet<Character>();
		char[]charArray=input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(!name.add(charArray[i])) {
			
		}
		}
		System.out.println(name);
		
		
	}

}
