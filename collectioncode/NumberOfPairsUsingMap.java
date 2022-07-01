package collectioncode;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NumberOfPairsUsingMap {

	public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,1,2,1,3,4,5,6,7,2,2,3,2,1,1,1,3,1);
        Collections.sort(input);
        Map<Integer,Integer> outputMap = new LinkedHashMap<>();
        for(int i=0;i<input.size();i++){
            if(input.size() == i+1){
                outputMap.put(input.get(i),outputMap.getOrDefault(input.get(i),0));
                break;
            }
            if(input.get(i) == input.get(i+1)){
                outputMap.put(input.get(i),outputMap.getOrDefault(input.get(i),0)+1);
                i++;
            } else {
                if(!outputMap.containsKey(input.get(i))){
                    outputMap.put(input.get(i),outputMap.getOrDefault(input.get(i),0));
                }

            }
        }
           System.out.println(outputMap);
       
    }


	}

