package javaPrograms;

public class Array__ValidateSortedArray {

	public static void main(String[] args) {
		int[] nums = {4,-3,-2,-1};
		System.out.println(isSorted(nums));
	}
	
	public static boolean isSorted(int[] nums) {
		for(int i =1; i < nums.length; i++) {
			if(nums[i-1] != nums[i]-1) {
				return false;	
			} 
		} return true;
	}

}
