package javaPrograms;

import java.util.Arrays;

public class Arrays___MoveZeroToLeft {

	public static void main(String[] args) {
		int[] nums = {1,2,3,0,4,5,0,6,0};
		moveZerosToLeft(nums);
		System.out.println(Arrays.toString(nums));
		
	}
	
	public static void moveZerosToLeft(int[] nums) {
		int len = nums.length;
		int nz=0, z=0;
		while(z < len) {
			if(nums[z] == 0) {
				int temp = nums[z];
				nums[z] = nums[nz];
				nums[nz] = temp;
				nz++;
				z++;
			}  else {
				z++;
			}
		}
	}
	
	

}
