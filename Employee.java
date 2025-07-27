/*****************************
program no.	:15
programname  	:Employee.java
AUthor		:Eswar
Date		:25-07-2025
purpose		:Implementation of arrays
***********************************/
import java.util.Scanner;
public class Employee
{
	//add instance variables
	String emp_name;
	int emp_id;
	String emp_department;
	double emp_basicSalary;
	double emp_grossSalary;
	public void setDetails(String name,int id,String dept,double basicSalary)
	{
		emp_name=name;
		emp_id=id;
		emp_department=dept;
		emp_basicSalary=basicSalary;
		calculateGrossSalary();
	}
	public void calculateGrossSalary()
	{
		double hra=0.20*emp_basicSalary;
		double da=0.10*emp_basicSalary;
		emp_grossSalary=emp_basicSalary+hra+da;
	}
	public String getDetails()
	{
	
		String details = "Employee Name: " + emp_name + "\n" +"Employee Id: " + emp_id + "\n" +
                 "Employee Department: " + emp_department + "\n" +
                 "Employee Basic Salary: " + emp_basicSalary + "\n" +
                 "Employee Gross Salary: " + emp_grossSalary;
 
		return details;
	}
	public void displayDetails()
	{
		System.out.println(getDetails());
	}
}
//driver class
class EmployeeTest
{
	public static void main(String args[])
	{
		Scanner console=new Scanner(System.in);
		System.out.print("enter numberof Employee:");
		int n=console.nextInt();
		console.nextLine();
		//create an array of employee objects
		Employee emp[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			emp[i]=new Employee();
			System.out.println("enter Employee"+(i+1));
			System.out.print("enter Employee Name:");
			String name=console.nextLine();
			System.out.print("enter Employee ID:");
			int id=console.nextInt();
			console.nextLine();
			System.out.print("enter Employee Department :");
			String dept=console.nextLine();
			System.out.print("enter Employee Basic Salary:");
			double Salary=console.nextDouble();
			console.nextLine();
			emp[i].setDetails(name, id, dept, Salary);
           	}

       		 for (int i = 0; i < n; i++)
        	{
            		System.out.println("Employee " + (i + 1)+ "details");
            		emp[i].displayDetails();
            		System.out.println();
        	}

        
   	 }
}