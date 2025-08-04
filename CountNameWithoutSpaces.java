import java.util.Scanner;
public class CountNameWithoutSpaces
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name:");
		String name=sc.nextLine();
		String without_space=name.replace(" ","");
		//count the number of characters in a string
		int count =without_space.length();
		//Display the number of characters
		System.out.printf("Ypur name:%10s&Total Length:%5d",name,count);
	}
}
