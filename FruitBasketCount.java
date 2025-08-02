/***************************************************

Program no	:11
Program Name	:FriutBasketCount.java
Author		:Eswar
Date		:14/07/2025
Purpose		:Implementation of arrays
		 creating,Accessing,Intialising,Traversing

****************************************************/
import java.util.Scanner;

public class FruitBasketCount
{
	public void CountFruitBaskets()
	{
		Scanner console =new Scanner(System.in);

		// prompt the users number of baskets

		System.out.print("Enter the number of Baskets:");
		int n = console.nextInt();
		
		//creating an array
		int baskets[] = new int[n];
		
		//Initialize an array
		for(int i = 0;i<n;i++)
		{
			System.out.print("Enter the apples at the basket["+(i+1)+"]:");
			baskets[i] =console.nextInt();
		}
		
		int total = 0;
		int max = baskets[0];
		int maxIndex = 0;
		//Acessing an array
		for(int i = 0;i<n;i++)
		{
			total+=baskets[i];
			if(baskets[i]>max)
			{
				max=baskets[i];
				maxIndex=i;
			}
			
		}
		System.out.println("Total number of apples in basket: "+total);
		System.out.println("Maximum apples in basket: "+max);
		System.out.println("Basket number with max apples : "+(maxIndex+1));
			 
		
	}

	public static void main(String args[])
	{
		FruitBasketCount obj = new FruitBasketCount();
		obj.CountFruitBaskets();
		
	}
}
	
