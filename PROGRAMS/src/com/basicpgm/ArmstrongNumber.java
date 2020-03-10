package com.basicpgm;

import java.util.Scanner;
//Armstrong Number=153=1+125+27=153
public class ArmstrongNumber {

	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int d ,rev=0,r;
		System.out.println("Enter Number which you want be Armstrong Number");
		int number=sc.nextInt();
		d=number;
		while(number!=0)
		{
			r=number%10;
			rev=rev+(r*r*r);
			number=number/10;
		}
		if(rev==d)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");	
		}

	}

}

/* Enter Number which you want be Armstrong Number
153
Number is Armstrong

Enter Number which you want be Armstrong Number
 
8
Number is not Armstrong
*/