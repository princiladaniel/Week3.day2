package collectionprogram;

import java.util.HashMap;
import java.util.Map;

public class LearnFindAllOccurance {
//Input=amazon
//output=a--->2,z-->1,o--->1,n--->1
	public static void main(String[] args) {
		//1.conver String into charArray
		//2.push each char to map
		//if already exist--->get the value and update+1
		//if not create an entry(ch,1)
		String input="PrincilaapRoseline";
		char[]charArray=input.toCharArray();
		Map<Character,Integer>obj=new HashMap<Character,Integer>();
		for (int i = 0; i < charArray.length; i++) {
			//obj.put(charArray[i], 1);
			if(obj.containsKey(charArray[i])) {
			Integer value=obj.get(charArray[i]);
			int newValue=value+1;
			obj.put(charArray[i],newValue );
		}
		else {
			obj.put(charArray[i], 1);
		}
	}
		
	System.out.println(obj);	
		
	}	
	}
	


