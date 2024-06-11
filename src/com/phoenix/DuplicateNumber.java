package com.phoenix;

public class DuplicateNumber {

	public static void main(String[] args) {
		int [] numbers =  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,88,72,73,74,76,77,78,79,80,
				81,82,83,1,84,85,86,87,88,89,90,1,91,92,93,94,95,96,97,98,99,100};
		int[] array = new int[numbers.length];
		int n=0;
		for(int i=0; i<numbers.length-1;i++)
		{
			for(int j=i+1;j<numbers.length; j++)
			{
				if(numbers[i] == numbers[j])
				{
					array[n++] = numbers[i];
					break;
				}			
			}
		}
		
		for(int i=0; i<array.length;i++)
		{
			if(array[i]!=0)
			{
				System.out.println("The duplicate number is : "+ array[i]);
			}
		}
		
		
		

	}

}
