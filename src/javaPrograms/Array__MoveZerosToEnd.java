package javaPrograms;

import java.util.Arrays;

public class Array__MoveZerosToEnd {

	public static void main(String[] args) {
		int[] nums = {0,1,2,0,4,0,5,6};
		moveZerosToEnd(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void moveZerosToEnd(int[] nums) {
		int len = nums.length;
		int Nz=0, z=0;
		while(Nz < len) {
			if(nums[Nz] != 0) {
				int temp = nums[Nz];
				nums[Nz] = nums[z];
				nums[z] = temp;
				z++;
				Nz++;
			} else {
				Nz++;
			}
		}
	}

}
