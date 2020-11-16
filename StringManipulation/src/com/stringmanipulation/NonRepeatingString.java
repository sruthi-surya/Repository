package com.stringmanipulation;
import java.util.LinkedHashMap; 
import java.util.Map; 


		public class NonRepeatingString {
		     public static void main(String[] args) {
		    	 
		  	String sentance = "Java is simple";  
		    char inputArray[] = sentance.toCharArray();            
			Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
			for(Character c: inputArray) {
				if(charMap.containsKey(c)) {
					charMap.put(c, charMap.get(c)+1);
				} else {
					if(!(c==' ')) { 
						charMap.put(c,1);
					}
				}
			}        
			System.out.println("Non repeated character");
			for(Map.Entry<Character,Integer> val : charMap.entrySet()) {
				if(val.getValue()==1) {
					System.out.println(val.getKey());
					break;
				}
			} 
		    }  
		

}
