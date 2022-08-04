package com.leetcode.twentytwo;

import java.util.LinkedList;
import java.util.Queue;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {3, 6, 7, 9, 5};
		int window = 3;
		 
		 MovingAverage mv = new MovingAverage(window);
		 
		 for(int i=0;i<arr.length;i++) {
			 mv.addElement(arr[i]);
			 
			 System.out.println("Element added is " + arr[i] + ", moving average = "+ mv.getMA());
		 }
		
	}
}

class MovingAverage {
	
	private final int win;
	
	private final Queue<Integer> q = new LinkedList<>();
	
	double sum;
	
	MovingAverage(int win){
		this.win = win;
	}
	
	void addElement(int element) {
		sum += element;
		q.add(element);
		
		if(q.size()>win) {
			int removedInt = q.remove();
			sum -= removedInt;
		}	
	}
	
	double getMA() {
		return sum/q.size();
	}
}
