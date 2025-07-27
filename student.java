/*****************************
program no.	:14
programname  	:Student.java 
AUthor		:Eswar
Date		:22-07-2025
purpose		:Implementation of arrays
***********************************/
//logic class
public class Student
{
	//add instance variables inside a class 
	public String name;
	public int rollNo;
	public char grade;
	
	//Adding instance methods inside a class

	public void setDetails(String Student_name,int Student_rollNo,char Student_grade)
	{
		name=Student_name;
		rollNo=Student_rollNo;
		grade=Student_grade;
	
	}
	//add get methods which returns object details(Student)
	
	public String getDetails()
	{
		String details="Student RollNo: "+rollNo+"\n"+"Student Name: "+name+"\n"+"Student Grade: "+grade+"\n";
		return details;
	}
  	public void updateGrade(char newGrade)
	{
		grade=newGrade;
	}
	public String getStudentStatus()
	{
		if(grade=='A'||grade=='B'||grade=='C')
		{
			return "pass";
		}
		else
			return "Fail";
	}
}
//drive class
class StudentTest
{
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student();
		
		s1.setDetails("Eswar",101,'F');
		s2.setDetails("Lokesh",102,'A');
		
		System.out.println("--------------Result Announcement--------");
		System.out.print("Student 1"+"\n");
		System.out.println(s1.getDetails());
		System.out.println("Status: "+s1.getStudentStatus());
		
		System.out.print("Student 2"+"\n");
		System.out.println(s2.getDetails());
		System.out.println("Status: "+s2.getStudentStatus());
		
		System.out.println("---------Result Announcement after revaluation-----");
		s1.updateGrade('A');
		System.out.print("Student 1"+"\n");
		System.out.println(s1.getDetails());
		System.out.println("Status :"+s1.getStudentStatus());
		
		System.out.print("Student 2"+"\n");
		System.out.println(s2.getDetails());
		System.out.println("Status: "+s2.getStudentStatus());
	}
}
		