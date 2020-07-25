package com.newyear;

public class Chocolates extends Ranges {
	public int totalWeightOfC(int chocolates[],int n)
	{
		int totalChocolates=0;
		for(int i=0;i<n;i++)
		{
			totalChocolates+=chocolates[i];
		}
		return (totalChocolates);
	}
	public int totalCandies(int min,int max,int chocolates[],int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(chocolates[i]>=min &&chocolates[i]<=max)
				count+=1;
		}
		return (count);
	}
	public int totalWeightOfS(int sweets[],int n)
	{
		int total=0;
		for(int i=0;i<n;i++)
		{
			total+=sweets[i];
		}
		return (total);
	}
	
}


