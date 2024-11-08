package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String___VowelsAndConsonants {

	public static void main(String[] args) {
		String str = "automation $%^";
		System.out.println(countVowelConsonant(str));
	}
	
	public static String countVowelConsonant(String str){
		int vowel = 0;
		int consonant =0;
		List<Character> list = Arrays.asList('a','e','i','o','u');
		for(int i=0; i <str.length(); i++) {
			if(list.contains(str.toLowerCase().charAt(i))) {
				vowel++;
			} else if(str.charAt(i) > 96 && str.charAt(i)< 123) {
				consonant++;
			}
		}
		
		return "the vowel count are " + vowel + " and consonant count are " + consonant;
	}

}
