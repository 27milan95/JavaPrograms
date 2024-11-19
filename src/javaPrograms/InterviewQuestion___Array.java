package javaPrograms;

import java.util.Arrays;

public class InterviewQuestion___Array {

	public static void main(String[] args) {
		int[] nums = {1,0,2};
		int[] nums1 = sortDigits(nums);
		System.out.println(Arrays.toString(nums1));
		
	}
	
	public static int[] sortDigits(int [] nums) {
		int len =nums.length;
		int one=0;
		int[] nums1 =  new int[len];
		for(int num : nums) {
			if(num == 0) {
				one ++;
			}
		}
		int zero = 0, two=len-1;
		for(int i=0; i < len; i++) {
			if(nums[i] == 0) {
				nums1[zero++] = nums[i];
			} else if(nums[i] == 2) {
				nums1[two--] = nums[i];
			} else {
				nums1[one++] = nums[i];
			}
			
		} return nums1;
	}

}
