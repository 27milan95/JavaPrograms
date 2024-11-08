package javaPrograms;

public class Integer___ReverseNumber {

	public static void main(String[] args) {
		int num = 123;
		System.out.println(reverseTheNumber(num));
	}
	
	public static int reverseTheNumber(int num) {
		int temp = num;
		int reverse =0;
		
		while(temp !=0) {
			reverse = reverse*10 + temp%10;
			temp = temp/10;
		}
		return reverse;
	}

}
