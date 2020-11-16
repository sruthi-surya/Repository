package com.stringmanipulation;

import java.util.*;
public class ReverseWords
{
    public static void main(String[] args)
    {
        String input = "God is love";
        reverse(input);
    }
    
    static void reverse(String input)
    {
        Stack<String> sentence = new Stack<>();
        String temp = "";
        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) == ' ')
            {
            	sentence.add(temp);
                temp = "";
            }
            else
            {
                temp = temp + input.charAt(i);
            }
        }
        sentence.add(temp);
        while(!sentence.isEmpty())
        {
            temp = sentence.peek();
            System.out.print(temp + " ");
            sentence.pop();
        }
    }
    
}