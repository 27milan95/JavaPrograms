package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class Array___UncommonElement {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {3,4,5,6};
		
		System.out.println(uncommonElement(arr1, arr2));
	}
	
	public static Set uncommonElement(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> commonset = new HashSet<>();
		Set<Integer> unionset = new HashSet<>();
		
		for(int num1 :nums1 ) {
			set.add(num1);
		}
		
		for(int num2 : nums2) {
			if(set.contains(num2)) {
				commonset.add(num2);
			}
		}
		
		for(int num1 : nums1) {
			for(int num2 : nums2) {
				unionset.add(num1);
				unionset.add(num2);
			}
		}  unionset.removeAll(commonset);
		return unionset;
	}

}
