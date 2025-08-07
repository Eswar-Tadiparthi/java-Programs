import java.util.Scanner;
public class HonorsEligibility
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// Input student details
		System.out.print("Enter Roll Number (int): ");
		int rollNo = sc.nextInt();

		System.out.print("Enter Year of Study (short): ");
		short year = sc.nextShort();

		System.out.print("Enter Section (byte): ");
		byte section = sc.nextByte();

		System.out.print("Enter Average Study Hours/Day (float): ");
		float studyHours = sc.nextFloat();

		System.out.print("Enter CGPA (double): ");
		double cgpa = sc.nextDouble();

		System.out.print("Enter Grade (char): ");
		char grade = sc.next().charAt(0);

		System.out.print("Whether the student is interested honors (true/false): ");
		boolean honors = sc.nextBoolean();

		// Display student record
		System.out.println("\n-------------- Student Record --------------");
		System.out.println("Roll No			: " + rollNo);
		System.out.println("Year			: " + year);
		System.out.println("Section			: " + section);
		System.out.println("Study Hours/Day		: " + studyHours);
		System.out.println("CGPA			: " + cgpa);
		System.out.println("Grade			: " + grade);
		System.out.println("Interested in Honors	: " + honors);

		// Honors Eligibility Check
		if (cgpa >= 8.5 && grade == 'A')
		{
			System.out.println("Student is eligible for honors.");
		}
		else
		{
			System.out.println("Student is not eligible for honors.");
		}

		sc.close();
	}
}