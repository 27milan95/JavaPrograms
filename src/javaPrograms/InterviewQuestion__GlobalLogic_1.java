package javaPrograms;

public class InterviewQuestion__GlobalLogic_1 {

	public static void main(String[] args) {
		String str = "m7I8L5a4n";
		separateStringCharNumber(str);
	}
	
	public static void separateStringCharNumber(String str) {
		String lowerCaseString = "";
		String upperCaseString = "";
		String number = "";
		
		for(int i=0; i < str.length(); i++) {
			if(str.charAt(i) < 123 && str.charAt(i) > 96) {
				lowerCaseString = lowerCaseString + str.charAt(i);
			} else if(str.charAt(i) < 91 && str.charAt(i) > 64) {
				upperCaseString = upperCaseString + str.charAt(i);
			}else if (Character.isDigit(str.charAt(i))) {
				number = number+str.charAt(i);
			}
		}
		
		System.out.println(lowerCaseString);
		System.out.println(upperCaseString);
		System.out.println(number);
	}

}
