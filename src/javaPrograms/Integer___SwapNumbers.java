package javaPrograms;

public class Integer___SwapNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		System.out.println(swapNumbers(a, b));
		
	}
	
	public static String swapNumbers(int a, int b) {
		int temp;
		temp = a;
		a=b;
		b=temp;
		
		return a + " & " + b;
	}

}
