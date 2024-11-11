package javaPrograms;

public class Array___SecondLargestElement {

	public static void main(String[] args) {
		int[] numbers = {24,56,89,74,102,111};
		int secondlargest= secondLargestElement(numbers);
		if(secondlargest != Integer.MIN_VALUE ) {
			System.out.println(secondlargest);
		}
	}
	
	public static int secondLargestElement(int [] numbers) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int number : numbers) {
			 if(number > largest) {
				secondLargest = largest;
				largest = number;
			}	
			 else if(number != largest && number > secondLargest) {
				secondLargest = number;
			} 
		} return secondLargest;
	}
	


}
