package javaPrograms;

public class Array___LargestSmallestElements {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,6,7};
		System.out.println(largestElement(numbers));
		
	}
	
	public static int largestElement(int[] numbers) {
		int largest = numbers[0];
		for(int num : numbers) {
			if(num > largest) {
				largest = num;
			}
		} return largest;
	}
	
	public static int smallestElement(int[] numbers) {
		int smallest = numbers[0];
		for(int num : numbers) {
			if(num < smallest) {
				smallest = num;
			}
		} return smallest;
	}

}
