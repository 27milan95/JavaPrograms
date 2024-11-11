package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class Integer___primeNumberInRange {

	public static void main(String[] args) {
		int m =55;
		int n = 100;
		PrimeNumbersFor(m, n);
		
		
	}
	
	public static void PrimeNumbersFor(int m, int n) {
	int i, j;
		for( i =m; i<n; i++) {	
			if(i==0 || i==1) {
				continue;
			}
			for( j=2; j<i; j++) {
				if(i%j == 0) {
					break;
				}
			}
			
			if(i==j) {
				System.out.println(i+ " ");
			}
			
		}
	}
}
