package com.phoenix;

public class CommonElements {

	public static void main(String[] args) {
		
		int[] L1 = {56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,88,72,73,74,76,77,78,79,80};
		
		int[] L2 = {81,82,83,1,84,85,86,87,88,89,90,1,91,92,93,94,95,96,97,98,99,100};
		
		int[] array = new int[L1.length];
		int n=0;
		for(int i=0; i<L1.length;i++)
		{
			for(int j=0;j<L2.length; j++)
			{
				if(L1[i] == L2[j])
				{
					array[n++] = L1[i];
				}			
			}
		}
		
		for(int i=0; i<array.length;i++)
		{
			if(array[i]!=0)
			{
				System.out.println("Common Elements are : "+ array[i]);
			}
		}

	}

}
