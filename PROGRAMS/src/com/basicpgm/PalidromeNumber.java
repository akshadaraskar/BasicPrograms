package com.basicpgm;

import java.util.Scanner;

public class PalidromeNumber 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int d ,rev=0,r;
		System.out.println("Enter Number which you want be palidrome Number");
		int number=sc.nextInt();
		d=number;
		while(number!=0)
		{
			r=number%10;
			rev=rev*10+r;//only this is change
			number=number/10;
		}
		if(rev==d)
		{
			System.out.println("Number is palidrome");
		}
		else
		{
			System.out.println("Number is not palidrome");	
		}

	}
}
/*
Enter Number which you want be palidrome Number
8
Number is palidrome

Enter Number which you want be palidrome Number
15
Number is not palidrome
*/