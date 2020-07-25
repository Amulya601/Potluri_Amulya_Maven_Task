package com.newyear;
import java.util.Scanner;
public class Gift {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of Chocolates:");
		int noOfChocolates=sc.nextInt();
		System.out.print("Number of Sweets:");
		int noOfSweets=sc.nextInt();
		int[] chocolates=new int[noOfChocolates];
		int[] sweets=new int[ noOfSweets];
		for(int i=0;i<noOfChocolates;i++)
		{
			System.out.print("Enter the weight of "+(i+1)+" chocolate:");
			chocolates[i]=sc.nextInt();
		}
		Chocolates c1=new Chocolates();
		int chocolateWeight=c1.totalWeightOfC(chocolates, noOfChocolates);
		for(int i=0;i< noOfSweets;i++)
		{
			System.out.print("Enter the weight of "+(i+1)+" sweet:");
			sweets[i]=sc.nextInt();
		}
		
		int sweetWeight=c1.totalWeightOfS(sweets,  noOfSweets);
		System.out.print("Minimum weight of chocolates:");
		int min=sc.nextInt();
		System.out.print("Maximum weight of the chococlates:");
		int max=sc.nextInt();
		int totalchocycandy=c1.totalCandies(min,max,chocolates,noOfChocolates);
		int totalsweetcandy=c1.totalCandies(min,max,sweets, noOfSweets);
		int totalnoofcandy=totalchocycandy+totalsweetcandy;
		if(totalnoofcandy>=1)
			System.out.print("Hurray....!! You recieved "+totalnoofcandy+" chocolates....");
		else
			System.out.print("You recieved only "+totalnoofcandy+" Chocolates , Better luck next time.");
		
		
		
	}

}
