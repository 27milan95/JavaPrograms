package javaPrograms;

public class Integer___FibonacciSeries {

	public static void main(String[] args) {
		int n =-2;
		fibonacciSeries(n);
	}
	
	public static void fibonacciSeries(int n) {
		int first = 0;
		int second = 1;
		
		for(int i=0; i<n ;i++) {	
			System.out.println(first + " ");
			int nextterm = first + second;
			first = second;
			second = nextterm;
		}
	}

}
