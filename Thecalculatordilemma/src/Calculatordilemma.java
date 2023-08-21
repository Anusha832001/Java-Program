import java.util.Scanner;
public class Calculatordilemma
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the two number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("enter the operation");
		String operation=scan.next();
		switch(operation)
		{
		case "+":
		{
			System.out.println("addition result is" +(num1+num2));
			break;
		}
		case "-":
		{
			System.out.println("subtaction results is " +(num1-num2));
			break;
		}
		case "*":
		{
			System.out.println("multiply results" +(num1*num2));
			break;
		}
		case "/":
		{
			System.out.println("division results" +(num1/num2));
			break;
		}
		}
	}
}
