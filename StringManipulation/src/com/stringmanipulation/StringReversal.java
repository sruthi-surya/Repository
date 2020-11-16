package com.stringmanipulation;



public class StringReversal {
   public static void main(String[] args) {
	   
	String sample= "Learning";
	String result = "";
	for(int i=(sample.length()-1);i>=0;i--) {
		result=result+sample.charAt(i);
	}
	System.out.println("String Reversed: "+result);
  }
}