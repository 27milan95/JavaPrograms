package javaPrograms;

public class Integer___Armstrong {

	public static void main(String[] args) {
		int num = 2;
		System.out.println(isArmstrong(num));
	}
	
	public static boolean isArmstrong(int num) {
		int temp = num;
		int r, sum =0;
		while(num>0) {
			r = num%10;
			num = num/10;
			sum = sum + r*r*r;
		}
		if(temp == sum) {
			return true;
		} else {
			return false;
		}
	}

}
