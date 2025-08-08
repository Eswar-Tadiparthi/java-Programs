/*• Roll Number (int) 
• Year of Study (short) 
• Section (byte) 
• Average Study Hours/Day (float) 
• CGPA (double) 
• Grade (char) 
• Student is interested honors (boolean)  */
import java.util.*;

public class Student {
    // instance variables
    int rollno;
    short year;
    byte section;
    float averageStudyhrs;
    double CGPA;
    char Grade;
    boolean honorintrest;

  

    public void getstudentdetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rollno of student");
        rollno = sc.nextInt();

        System.out.println("Enter the year of student");
        year = sc.nextShort();

        System.out.println("Enter the section of student");
        section = sc.nextByte();

        System.out.println("Enter the avg_study hours of student");
        averageStudyhrs = sc.nextFloat();

        System.out.println("Enter the CGPA of student");
        CGPA = sc.nextDouble();

        System.out.println("Enter the grade of student");
        Grade = sc.next().charAt(0);

        System.out.println("Enter Student intrested in any honurs?(true/false)");
        honorintrest = sc.nextBoolean();

       

    }

    public boolean is_eligible_for_honour() {

        return (CGPA >= 8.2 && Grade == 'A' && honorintrest);

    }

    public void studentdetails() {
        System.out.println("--------student details------------");
        System.out.println("Roll number of the student is : " + rollno);
        System.out.println("Year he studies is : " + year);
        System.out.println("Section :" + section);
        System.out.println("Studies " + averageStudyhrs + " per day");
        System.out.println("CGPA of the student is : " + CGPA);
        System.out.println("Grade of the student is : " + Grade);
        System.out.println("Intrested in honour ? : " + honorintrest);
        System.out.println("-------------------------------------");

    }

    // main method
    public static void main(String[] args) {
        Student obj = new Student();
        obj.getstudentdetails();
        obj.studentdetails();

        if (obj.is_eligible_for_honour()) {
            System.out.println("The student is eligible for academic honors");
        } else {
            System.out.println("The student is Not eligible for academic honors");
        }

    }

}