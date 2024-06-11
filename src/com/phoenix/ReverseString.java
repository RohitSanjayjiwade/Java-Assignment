package com.phoenix;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter the String : ");
		str = sc.nextLine();
		
		String reversedString =  reversedString(str);
		
		System.out.println("The reversed String is : "+ reversedString);
		

	}
	
	public static String reversedString(String str)
	{
		char[] string = str.toCharArray();
		int length = string.length;
		
		for(int num=0; num<length/2; num++)
		{
			char temp = string[num];
			string[num] = string[length-num-1];
			string[length-num-1] = temp;
		}
		
		return new String(string);
	}

}
