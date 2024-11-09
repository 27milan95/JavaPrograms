package javaPrograms;

import java.util.Arrays;

public class Array___Sort {

	public static void main(String[] args) {
		int[] nums = {1,5,6,2,4,7,9,3,8};
		descendingSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void ascendingSort(int[] nums) {
		int temp;
		for(int i=0; i < nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
	
	public static void descendingSort(int[] nums) {
		int temp;
		for(int i=0; i < nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] < nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}

}
