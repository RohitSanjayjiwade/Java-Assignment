package com.phoenix;

import java.util.Scanner;

public class PurchaseChecker {

	public static void main(String[] args) {
		int [] notes = {1,2,3,4};
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter The Price of Item : ");
		int price = sc.nextInt();
		
		String result = canPurchase(notes, price);
		
		System.out.println(result);
	}

	private static String canPurchase(int[] notes, int price) {
		int [] value = {10,50,100,200};
		
		int totalMoney = 0;
		for(int num=0; num<notes.length;num++)
		{
			totalMoney += notes[num] * value[num];
		}
		
		if(totalMoney >= price)
		{
			return "I can purchase";
		}
		else
		{
			return "I need more money";
		}
	}

}
