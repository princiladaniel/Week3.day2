package action;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleOccuranceMap {

	public static void main(String[] args) {
		/*
		 * Classroom Assignment 3: (Map) 
		 * Single Number (Print only single occurance
		 * numbers) int[] nums = {1,2,1,3,2,5}; --> 3,5 !
		 */
		int[] nums= {1,2,1,3,2,5};
		Map<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
		for (int i = 0; i < nums.length; i++) {
		//map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
			if(map.containsKey(nums[i])) {
				map.put(nums[i],map.get(nums[i]+1));
			}
			else {
				map.put(nums[i], 1);
			}
	}
		
System.out.println(map);
}
	}
