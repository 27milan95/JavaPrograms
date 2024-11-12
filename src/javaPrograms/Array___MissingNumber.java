package javaPrograms;

public class Array___MissingNumber {

	public static void main(String[] args) {
		int[] numbers  = {1,2,3,4,5,6,7,9};
		System.out.println(missingNumber(numbers));
	}
	
	public static int missingNumber(int[] numbers) {
		int sum1=0, sum2=0;
		
		for(int i=0; i<numbers.length; i++) {
			sum1 =sum1 + numbers[i];
		}
		
		for(int i=0; i<=numbers.length+1; i++) {
			sum2 = sum2 + i;
		} return sum2-sum1;
	}

}
