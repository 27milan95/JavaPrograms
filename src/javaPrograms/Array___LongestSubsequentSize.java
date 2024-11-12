package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array___LongestSubsequentSize {

	public static void main(String[] args) {
		int[] arr = {1,2,102,6,7,9,8,10,11};
		System.out.println(longestSubsequentSize(arr));
	}
	
	public static int longestSubsequentSize(int[] arr) {
		Arrays.sort(arr);
		//1,2,3,4,8,56,102
		List<Integer> list = new ArrayList<>();
		int currentstreak =1;
		int longeststreak =1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1]+1 != arr[i]) {
				longeststreak = Math.max(currentstreak, longeststreak);
				currentstreak =1;
			} else {
				currentstreak++;
			}
		}  return longeststreak = Math.max(currentstreak, longeststreak);
		
	}
	
	
}

