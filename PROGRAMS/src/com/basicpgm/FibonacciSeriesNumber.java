package com.basicpgm;

import java.util.Scanner;

public class FibonacciSeriesNumber 
{
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int t1,t2=0,t3=1;
		System.out.println("Enter Number which you want be FibonacciesSeries Number");
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			t1=t2;
			t2=t3;
			t3=t1+t2;
			
			System.out.println("FibonacciesSeries Number :"+t3);
		}
		
	}
	
}
/*

Enter Number which you want be FibonacciesSeries Number
5
FibonacciesSeries Number :1
FibonacciesSeries Number :2
FibonacciesSeries Number :3
FibonacciesSeries Number :5
FibonacciesSeries Number :8

*/