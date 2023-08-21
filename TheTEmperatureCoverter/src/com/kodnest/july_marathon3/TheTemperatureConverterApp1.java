package com.kodnest.july_marathon3;

import java.util.Scanner;

public class TheTemperatureConverterApp1 {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		TheTemperatureConverter temperatureConverter=new TheTemperatureConverter();
		System.out.println("enter the fahrenheit temperature to convert into celsius");
		double fahrenheit=scan.nextDouble();
		double fahrenheitTocelsius= temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(fahrenheitTocelsius);
	}
}
