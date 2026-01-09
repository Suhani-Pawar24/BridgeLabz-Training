package com.stringbuilder;
import java.util.HashSet;
public class ReverseString 
{
	 public static void main(String[] args) 
	 {
	        String input = "hello";

	        StringBuilder sb = new StringBuilder();
	        sb.append(input);

	        String reversed = sb.reverse().toString();

	        System.out.println(reversed);
	    }
}


	   
