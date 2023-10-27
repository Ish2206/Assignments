package week1.day2;

public class Report 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/* Printing the values declared in Student Class 
		by creating an object(details) in Report Class */
		Student details = new Student();
		System.out.println("Student Name : "+ details.studentName);
		System.out.println("Roll Number : "+ details.rollNo);
		System.out.println("College Name : "+ details.collegeName);
		System.out.println("Mark Scored : "+ details.markScored);
		System.out.println("CGPA : "+ details.cgpa);
	}

}
