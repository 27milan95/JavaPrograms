package javaPrograms;

public class String__Reverse {

	public static void main(String[] args) {
		String str = "Automation";
		System.out.println(reverseUsingBuffer(str));

	}
	
	public static String reverseString(String word) {
		String reverse = "";
		for(int i=word.length()-1; i>=0;i--) {
			reverse = reverse + word.charAt(i);
		}
		return reverse;
	}
	
	public static String reverseUsingBuffer(String word) {
		String result ="";
		StringBuffer str = new StringBuffer(word);
		return  result = str.reverse().toString();
	}

}
