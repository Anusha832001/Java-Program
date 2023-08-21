package com.kodnestjuly_marathon1;
import java.util.Scanner;
public class ArithmeticOperations {
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the two Numbers");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	System.out.println("enter the two Numbers");
	System.out.println(subtractNumbers(num1,num2));
	int num3=scan.nextInt();
	int num4=scan.nextInt();
	System.out.println("enter the two Numbers");
	System.out.println(multiplyNumbers(num3,num4));
	int num5=scan.nextInt();
	int num6=scan.nextInt();
	System.out.println("enter the two Numbers");
	System.out.println(divideNumbers(num5,num6));
	int num7=scan.nextInt();
	int num8=scan.nextInt();
	System.out.println("enter the two Numbers");
	System.out.println(findRemainder(num7,num8));
}
public static int subtractNumbers(int num1,int num2)
{
	return num2-num1;
}
public static int multiplyNumbers(int num3,int num4)
{
	return num3*num4;
}
public static double divideNumbers(int num5, int num6)
{
	return num5/num6;
}
public static int findRemainder(int num7,int num8)
{
	return num7%num8;
}
}
