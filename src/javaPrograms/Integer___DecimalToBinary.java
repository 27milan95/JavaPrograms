package javaPrograms;

public class Integer___DecimalToBinary {

	public static void main(String[] args) {
		int num = 45;
		System.out.println(decimalToBinary(num));
		
	}

	public static String decimalToBinary(int num) {
		return Integer.toBinaryString(num);
	}
}
