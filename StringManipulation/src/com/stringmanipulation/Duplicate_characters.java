package com.stringmanipulation;

import java.util.Scanner;

public class Duplicate_characters {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the input String");
		Scanner in = new Scanner(System.in);
		String input= in.nextLine();
		int flag=0;
		char inputArray[]=input.toCharArray();
		int count=input.length();
			for(int i=0;i<count;i++ ) {
				for(int j=i+1;j<count;j++) {
			if(inputArray[i]==inputArray[j]) {
				flag=1;
				System.out.println(inputArray[j]);
				
			}
		}	
	  }
	if(flag==0)
		System.out.println("No duplicate values");
			
 }

}
