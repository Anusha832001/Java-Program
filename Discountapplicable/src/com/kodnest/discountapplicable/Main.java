package com.kodnest.discountapplicable;
import java.util.Scanner;
public class Main 
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the amount");
		double purchaseAmount=scan.nextDouble();
		checkDiscount(purchaseAmount);
		
	}

	public static void checkDiscount(double purchaseAmount)
	{
		if(purchaseAmount>100);
		{
		System.out.println("discount applicable");
		}
	}
}


