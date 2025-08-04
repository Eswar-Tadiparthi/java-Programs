import java.util.Scanner;
public class CountName
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name:");
		String name=sc.nextLine();
		//count the number of characters in a string
		int count =name.length();
		//Display the number of characters
		System.out.printf("Ypur name:%10s&Total Length:%5d",name,count);
	}
}
