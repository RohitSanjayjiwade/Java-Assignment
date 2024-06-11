package com.phoenix;

import java.util.Scanner;

public class ReversedWord {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter The String : ");
		String inputString = sc.nextLine();
		
		String reversedWordString = reverseWord(inputString);
		
		System.out.println("The reversed Word String is : "+ reversedWordString);

	}

	private static String reverseWord(String str) {
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		int start = 0;
		for(int num = 0; num<=length; num++)
		{
			if(num == length || charArray[num] == ' ')
			{
				revrse(charArray, start, num-1);
				start = num+1;
			}
		}
		return new String(charArray);
	}

	private static void revrse(char[] charArray, int start, int i) {
		
		while(start<i)
		{
			char temp = charArray[start];
			charArray[start] =  charArray[i];
			charArray[i] = temp;
			start ++;
			i--;
		}
		
	}

}
