/***************************************************

Program no	:07
Program Name	:Customer.java
Author		:Eswar
Date		:08/07/2025
Purpose		:Implementation of Types of Variables

****************************************************/
import java.util.Scanner;

public class Customer
{
	//instance variable
	double customer_bill;
	
	//Static variable
	static double total_sales=0;
	
	public void processBill()
	{
		Scanner console=new Scanner(System.in);
		System.out.print("Enter the number of items:");
		//local variable
		int n =console.nextInt();

		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter item name "+i+": ");
			console.nextLine();	
			String item_name = console.nextLine();

			System.out.print("Enter item price "+i+": ");
			double item_price = console.nextDouble();
			
			double discount =0.0;
			if(item_price > 500)
			{
				
				discount = item_price*0.05;
			}
	
			double final_price =item_price - discount;
			System.out.println("The Final price of item name "+item_name+": "+final_price); 

			customer_bill += final_price;

		}//for loop closed
  
		System.out.println("The Final Customer bill is "+customer_bill);

		total_sales += customer_bill;

	}//processbill metod closed

	
	public static void main(String args[])
	{
		Scanner console =new Scanner(System.in);
		String choice =null;
		do
		{	
			Customer obj = new Customer();
			obj.processBill();
			System.out.print("Are you next customer(yes/no)");
			choice = console.next();
		}while(choice.equalsIgnoreCase("yes"));

		System.out.println("Total sales of the day"+total_sales);
	}//main method closed 

}//class closed
