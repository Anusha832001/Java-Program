import java.util.Scanner;
public class Taxcalculator 
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the purchase amount and taxrate");
		double purchaseamount=scan.nextDouble();
		double taxrate=scan.nextDouble();
		double taxamount=calculateTotalWithTax(purchaseamount,taxrate);
		System.out.println(taxamount); 
		
	}
	public static double calculateTotalWithTax(double purchaseamount,double taxrate)
	{
		double taxamount=((purchaseamount*taxrate)+purchaseamount);
		return taxamount;
	}
}
	
		
		