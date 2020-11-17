package com.stringmanipulation;

public class Palindromsubstringcount {

	    public static void main(String args[]) throws Exception { 
	    	String inputString = "aabbee";
			int count = 0;
			System.out.println("The palindromic substrings: ");
			for (int i = 0; i < inputString.length() - 1; i++) {
				for (int j = i; j <= inputString.length() - 2; j++) {
					if (check(inputString.substring(i, j + 2))) {
						System.out.print(inputString.substring(i, j + 2) + " ");
						count++;
					}
				}
			}
		}

		private static boolean check(String input) {
			int len = input.length() - 1;
			boolean isPalindrome = true;
			for (int i = 0; i < input.length() / 2; i++) {
				if (input.charAt(i) != input.charAt(len)) {
					isPalindrome = false;
					break;
				}
				len--;
			}
			return isPalindrome;
		}
}