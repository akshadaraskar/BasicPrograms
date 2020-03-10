package com.basicpgm;

import java.util.Scanner;

public class ReverseNumber 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int d ,rev=0,r;
		System.out.println("Enter Number which you want be Reverse Number");
		int number=sc.nextInt();
		d=number;
		while(number!=0)
		{
			r=number%10;
			rev=rev*10+r;//only this is change
			number=number/10;
		}
		System.out.println("Reverse Number:"+rev);

	}
}
/*
Enter Number which you want be Reverse Number
225
Reverse Number:522
*/