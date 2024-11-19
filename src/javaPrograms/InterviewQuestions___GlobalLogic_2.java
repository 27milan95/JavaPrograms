package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class InterviewQuestions___GlobalLogic_2 {

	public static void main(String[] args) {
		int[] nums = {1,31,12,111,321,102};
		System.out.println(printNumberStartfromOne(nums,1));
	}
	
	public static List printNumberStartfromOne(int[] nums, int digit) {
		List<Integer> list = new ArrayList<>();
		int temp;
		for(int num : nums) {
			if(num < 10 && num == digit) {
				list.add(num);
			} else if( num >= 10 && num <= 99) {
				temp = num/10;
				if(temp == digit) {
					list.add(num);
				}
			} else if( num >= 100 && num <= 999) {
				temp = num/100;
				if(temp == digit) {
					list.add(num);
				}
		}
	}
		return list;
}
}
