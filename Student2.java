import java.util.*;

public class Student2 {
    // Instance variables
    int[][] marks;
    int student;
    int subject;

    // Static variable
    static int no_ofstudents = 0;

    // Method to get student and marks details
    public void getStudentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        student = sc.nextInt();

        System.out.print("Enter the number of subjects: ");
        subject = sc.nextInt();

        marks = new int[student][subject];
        no_ofstudents = student;

        for (int i = 0; i < student; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < subject; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();  // fixed to nextInt()
            }
        }
    }

    // Method to calculate and display average
    public void avgCalculate() {
        System.out.println("\n--------- Student Summary ---------");

        for (int i = 0; i < student; i++) {
            int total = 0;

            System.out.print("Student " + (i + 1) + " Marks: ");
            for (int j = 0; j < subject; j++) {
                System.out.print(marks[i][j] + " ");
                total += marks[i][j];
            }

            double average = (double) total / subject;
            System.out.printf(" | Average: %.2f\n", average);
        }

        System.out.println("\nTotal number of students processed: " + no_ofstudents);
    }

    // Main method
    public static void main(String[] args) {
        Student2 obj = new Student2();
        obj.getStudentDetails();
        obj.avgCalculate();
    }
}