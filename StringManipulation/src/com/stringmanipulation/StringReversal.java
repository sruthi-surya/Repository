package com.stringmanipulation;



public class StringReversal {
   public static void main(String[] args) {
	   
	String sample= "Learning";

	char[] charArray = sample.toCharArray();

	StringBuilder builder = new StringBuilder();
	for (int i = (charArray.length) - 1; i >= 0; i--) {
		builder.append(charArray[i]);
	}
	
	System.out.println("Reversed : " + builder.toString());
	
  }
}