package javaPrograms;

public class Integer___GCD {

	public static void main(String[] args) {
		int a =120;
		int b = 300;
		System.out.println(GCD(a, b));
	}
	
	public static int GCD(int a,int b) {
		int g=0;
		for(int i=1; i<=a ; i++) {
			if(a%i==0 && b%i ==0) {
				g=i;
			}
		} return g;
	}

}
