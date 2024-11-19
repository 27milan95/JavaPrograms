package javaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Array___duplicateToEnd {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,5,9,9,8,7,7};
		duplicateToRight(nums);
	
	}
	
	public static void duplicateToRight(int[] nums) {
		int count = 1, duplicate =0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int num : nums) {
			if(!map.containsKey(num)) {
				map.put(num, count);
			} else {
				map.put(num, map.get(num)+1);
			}
		}
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				duplicate = entry.getKey();
			}
		}
		
		//System.out.println(duplicate);
		int d =0, j=0;
		while(j < nums.length) {
			if(nums[d] == duplicate && nums[j] != duplicate) {
				int temp = nums[d];
				nums[d] = nums[j];
				nums[j] = temp;
				d++;
				j++;
			} else if(nums[d] == duplicate && nums[j] == duplicate) {
				j++;
			} else {
				d++;
				j++;
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
