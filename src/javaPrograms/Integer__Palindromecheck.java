package javaPrograms;

public class Integer__Palindromecheck {

	public static void main(String[] args) {
		int num = 1;
		System.out.println(isNumberPalindrome(num));
	}
	
	public static boolean isNumberPalindrome(int num) {
		int temp = num;
		int reverse =0;
		
		while(temp !=0) {
			reverse = reverse*10 + temp%10;
			temp = temp/10;
		}
		if(num == reverse) {
			return true;
		} else {
			return false;
		}
	}

}
