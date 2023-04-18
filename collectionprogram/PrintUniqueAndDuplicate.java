package salesforcecase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintUniqueAndDuplicate {

	public static void main(String[] args) {
		
		List<String> myList=new ArrayList<String>();

		myList.add("Shakthi");
		myList.add("George");
		myList.add("Arun");
		myList.add("Chandru");
		myList.add("Eshwar");
		myList.add("Bala");
		myList.add("Farook");
		myList.add("Arun");
		myList.add("Bala");
		List<String> unique=new ArrayList<String>();
		Collections.sort(myList);
		for(int i=0;i<myList.size();i++) {
		
			int inc=0;
			for(int j=i+1;j<myList.size();j++) {
				
				if(myList.get(i)==myList.get(j))
				{
					inc++;
					System.out.println(myList.get(j));
				}
			}
				if(inc==0) {
			
					String output = myList.get(i);
					unique.add(output);
					
				}
			}
		System.out.println(unique);
	}
}

