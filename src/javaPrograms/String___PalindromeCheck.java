package javaPrograms;

public class String___PalindromeCheck {

	public static void main(String[] args) {
		String str = "";
		
		System.out.println(isStringPalindrome(str));
	}
	
	public static boolean isStringPalindrome(String word) {
		if(word.length() == 1) {
			return true;
		}
		
		if(word.length()<1) {
			return false;
		}
		
		String temp = word;
		String reverse = "";
		StringBuilder str = new StringBuilder(temp);
		reverse = str.reverse().toString();
		
		if(word.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}

}
