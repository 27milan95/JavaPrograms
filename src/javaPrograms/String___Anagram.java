package javaPrograms;

import java.util.Arrays;

public class String___Anagram {

	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";
		
		System.out.println(isAnagram(str1, str2));
		
	}

	public static boolean isAnagram(String str1, String str2) {
		if(str1==null || str2==null || str1.length()!=str2.length()) {
			return false;
		}
		
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) {
			return true;
		} else {
			return false;
		}
	}
}
