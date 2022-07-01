package collectioncode;

import java.util.HashMap;
import java.util.Map;

public class FindOccuranceUsingMap {

	public static void main(String[] args) {
		String input="java";
		//outpu j-1;a-2;v-1
		//1.create the map need char integer
		//step2.convert my string chararray
		//loop to iterate the charAarray, check char is present or not, keep the datainto map and count
        Map<Character,Integer>map=new HashMap<>();
        char[] charArray = input.toCharArray();
        for (char output : charArray) {
        	if(map.containsKey(output)) {
        		map.put(output,map.get(output)+1 );
        	}
        	else {
        		map.put(output,1);
        	}
			
		}
		System.out.println(map);
		
	}

}
