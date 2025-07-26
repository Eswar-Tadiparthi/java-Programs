45/***************************************************

Program no	:08
Program Name	:Customer.java
Author		:Eswar
Date		:09/07/2025
Purpose		:Implementation of Types of Variables

****************************************************/

import java.util.Scanner;

public class BaseMeal
{

	//static variable 
	static String restaurant_name = "Tasty Bites";

	//static variable 
	static double total_sales = 0.0;

	//instance variable
	double baseMeal_cost;

	
	public void CalculateTotalCost()
	{

		Scanner console = new Scanner(System.in);

		//Read base meal cost
		System.out.print("Enter the base Meal cost:");
		baseMeal_cost = console.nextDouble();

		System.out.print("Enter the percentage of tip:");
		double tipPercent = console.nextDouble();

		System.out.print("Enter the percentage of tax:");

		double taxPercent = console.nextDouble();

		double tip = baseMeal_cost * (tipPercent/100);
		double tax = baseMeal_cost * (taxPercent/100);

		double total_cost = baseMeal_cost+tip+tax;

		System.out.println("-----------Recipt-----------");
		System.out.println("Reataurant:"+restaurant_name);
		System.out.println("Base meal cost:Rs. "+baseMeal_cost);
		System.out.println("Tip:Rs. "+tip);
		System.out.println("Tax:Rs. "+tax);
		System.out.println("Total meal cost:Rs. "+total_cost);
		System.out.println("----------------------------");

		total_sales+=total_cost;

	}// Calculate Totalcost method closed

	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		String choice=null;
	        do
		{
			BaseMeal obj = new BaseMeal();
			obj.CalculateTotalCost();

			System.out.println("Are you a next Customer(Yes/No)");
			choice =console.next();

			}while(choice.equalsIgnoreCase("Yes"));

			System.out.println("The Total Sales : "+total_sales);

     }//main method closed

}//class closed