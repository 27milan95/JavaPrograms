package javaPrograms;

public class Array___SecomdSmallestElement {

	public static void main(String[] args) {
		int[] numbers = {1,2};
		int secondSmallest= secondSmallestNumber(numbers);
		if(secondSmallest != Integer.MAX_VALUE ) {
			System.out.println(secondSmallest);
		}
	}
	
	public static int secondSmallestNumber(int[] numbers) {
		if(numbers.length<2) {
			return Integer.MAX_VALUE;
		}
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest =Integer.MAX_VALUE;
		
		for(int number : numbers) {
			if(number < smallest) {
				secondSmallest = smallest;
				smallest = number;
			} else if(number != smallest && number < secondSmallest) {
				secondSmallest = number;
			}
		} return secondSmallest;
	}

}
