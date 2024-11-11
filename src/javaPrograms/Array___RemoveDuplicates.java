package javaPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array___RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = {1,2,3,5,4,1,2,6,5,8,7,1,2};
		System.out.println(removeDuplicates(nums));	
	}
	
	public static Set removeDuplicates(int[] nums) {
		Set<Integer> set = new LinkedHashSet<>();
		for(int num : nums) {
			set.add(num);
		}
		return set;
	}

}
