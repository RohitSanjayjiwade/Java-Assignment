package com.phoenix;

public class HighestNumberRecursion {

	public static void main(String[] args) {
		
		int [] num = {-1,3,5,6,99,12,2};
		
		int result = HighestNumber(num, num.length);
		
		System.out.println("Highest Number is : "+ result);

	}

	private static int HighestNumber(int[] num, int n) {
		if(n==1)
		{
			return num[0];
		}
		
		int max = HighestNumber(num, n-1);
		
		if(num[n-1] > max)
		{
			return num[n-1];
		}
		else
		{
			return max;
		}
	}

}
