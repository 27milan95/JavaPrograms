package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class Array___CommonElements {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,4};
		int[] nums2 = {3,4,5,6};
		
		commonElements(nums1, nums2);
	}
	
	public static void commonElements(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		
		for(int num1 : nums1) {
			set.add(num1);
		}
		
		for(int num2: nums2) {
			if(set.contains(num2)) {
				System.out.println(num2);
			}
		}
	}

}
