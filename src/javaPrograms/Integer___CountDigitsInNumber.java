package javaPrograms;

public class Integer___CountDigitsInNumber {

	public static void main(String[] args) {
		int num = 1234567;
		System.out.println(countDigits1(num));
	}
	
	public static int countDigits(int num) {
		return String.valueOf(num).length();
	}
	
	public static int countDigits1(int num) {
		int i=0;
		while(num>0) {
			num =num/10;
			i++;
		} return i;
	}
}
