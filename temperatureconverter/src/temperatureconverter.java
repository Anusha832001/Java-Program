import java.util.Scanner;
public class temperatureconverter {
		public static void main(String[]args)
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option 1-2");
		double option=scan.nextDouble();
		}
		if(option==1)
		{
			System.out.println("enter the temperature in celsius");
			double celsius=scan.nextDouble();
			double F=double celsiusToFahrenheit(celsius);
			System.out.println(celsius + "c  is equivalent to" +F);	
		}
		else if(option==2)
		{
			System.out.println("enter the temperature in Fahrenheit");
			double Fahrenheit =scan.nextDouble();
			double c=double Fahrenheittocelsius(Fahrenheit);
			System.out.println(Fahrenheit + "F  is equivalent to" c);	
			
			
		}
		public static double celsiusToFahrenheit(double celsius)
		{
			 (celsius*9/5) + 32;
		}
		public static double fahrenheitToCelsius(double fahrenheit)
		{
			(fahrenheit - 32)*5/9;
			
		}
			}
	}


}
