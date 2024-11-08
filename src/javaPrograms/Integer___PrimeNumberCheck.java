package javaPrograms;

public class Integer___PrimeNumberCheck {

	public static void main(String[] args) {
		int n=73;
		System.out.println(isPrimeNumber(n));
	}
	
	public static boolean isPrimeNumber(int n) {
		if(n==0 || n==1) {
			return false;
		}
		
		for(int i=2; i<n;i++) {
			if(n%i == 0) {
				return false;
			} 
		} return true;
	}

}
