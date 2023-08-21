package com.kodnestjuly_marathon3;
import java.util.Scanner;
public class TheStringJoiner {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first string");
		String str1=scan.nextLine();
		System.out.println("enter the second string");
		String str2=scan.nextLine();
		System.out.println(joinStrings(str1,str2));
		}
	public static String joinStrings(String str1,String str2)
	{
		return str1+str2;
	}

}
