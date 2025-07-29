/***********************
Program No.      :07
Program Name     :CanteenBilling.java
Author           :kishan
Date             :08/07/2025
Purpose          :Implementation of Types of Variables
***********************/
import java.util.Scanner;
public class CanteenBilling
{
	//instance variable
	double customerBill;
	
	//static variable
	static double totalSales=0;

        //program actuallogic to calculate each customer's bill and total sales for the day
	public void processBill()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of items:");
		int n =sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the item name" + i +":");
			String item_name = sc.next();
			
			System.out.println("Enter the item price "+ i + " : ");
			double item_price +sc.nextDouble();

			double discount=0;
			if(item_price > 500)
			{
				discount = item_price*0.05;
			}
			double final_price =item_price - discount;
			System.out.print("Final price of  "+item_name+" : "+final_price);

			customerBill += final_price;
 
		}
		System.out.println(:the total customer Bill :Rs. "customerBill);
		totalSales += customerBill;

	}
	public static void main(String args[])
	{
		Scanner cosole =new Scanner(System.in);

		String choice;

		
		string choice();
		do
		{
		    canteenBilling customer = new canteenBilling()
		    customer.processBill();
		    system.out.println("Next customer(yes/no)");
		    		

			
			choice = console.next();
			

		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("Total sales of the day" + totalSales);
	}
}