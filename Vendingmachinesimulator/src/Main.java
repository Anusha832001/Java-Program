import java.util.Scanner;
public class Main
{
	public static void getProduct(String productCode)

	{
		switch(productCode)
		{
		case "PO1":
			System.out.println("Cocacola");
			break;
		case "PO2":
			System.out.println("pepsi");
			break;
		case "PO3":
			System.out.println("fanta");
			break;
		case "PO4":
			System.out.println("JalJeera");
			break;
		case "PO5":
			System.out.println("MountainDew");
			break;
		case "PO6":
			System.out.println("BoatGuava");
			break;
			default:System.out.println("Panaka");
				
			
		}
	}

	public static void main(String[] args)

	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the product code");
		String productCode=scan.next();
		getProduct( productCode);
		

	}

	}

