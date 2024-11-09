package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array___MergeArray {

	public static void main(String[] args) {
		int[] nums1 = {1,3,5};
		int[] nums2 = {2,4,6,7};
		int[] result = mergeArray(nums1, nums2);
		System.out.println(Arrays.toString(result));
	}
	
	public static Set mergeArray1(int[] nums1, int[] nums2) {
		//int[] nums = new int[nums1.length + nums2.length];
		Set<Integer> nums = new HashSet<>();
		for(int num1 : nums1) {
			for(int num2 : nums2) {
				if(num1 < num2) {
					nums.add(num1);
				}
				else {
					nums.add(num2);
				}
			}
		}
		
		return nums;
	}
	
	public static int[] mergeArray(int[] nums1, int[] nums2) {
		int numsLength = nums1.length + nums2.length;
		int[] nums = new int[numsLength];
		int i=0, j=0, k=0;
		
		while(i < nums1.length && j< nums2.length) {
			if(nums1[i] < nums2[j]) {
				nums[k++] = nums1[i++];
			} else {
				nums[k++] = nums2[j++];
			}
		}	
			while(i < nums1.length) {
				nums[k++] = nums1[i++];
			} 
			
			while(j < nums2.length) {
				nums[k++] = nums2[j++];
			}
		
		return nums;
	}

}
