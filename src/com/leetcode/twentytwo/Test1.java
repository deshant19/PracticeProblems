package com.leetcode.twentytwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myList = Arrays.asList("Friday", "Friday", "Jan", "Feb");
		
		Interview newList = new Interview();
		
		for(String s:myList) {
			newList.add(s);
		}
		
		newList.count();

	}

}

class Interview extends LinkedList<String> {
	
	private static final long serialVersionUID = 1L;

	public void count(){
		
		Map<String, Integer> frequencyMap = new HashMap<>();
		
		this.forEach(word ->
	       frequencyMap.merge(word, 1, (k, v) -> k + v));
		
		for(String s: this) {
			if(frequencyMap.containsKey(s)) {
				frequencyMap.put(s, frequencyMap.get(s)+1);
			} else {
				frequencyMap.put(s, 1);
			}
		}
		
		System.out.println(frequencyMap);
	}
}
