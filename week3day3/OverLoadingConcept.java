package week3.week3day3;

public class OverLoadingConcept 
{
	public void reportSteps(String msg, String status) 
	{
		System.out.println("The msg is : " +msg);
		System.out.println("The status is : "+status);
		System.out.println("=====================================");
	}
	
	public void reportSteps(String msg, String status, boolean snap) 
	{
		System.out.println("The msg is : " +msg);
		System.out.println("The status is : "+status);
		System.out.println("Whether to take a snap : "+snap);
	}
	public static void main(String[] args) 
	{
		OverLoadingConcept rs = new OverLoadingConcept();
		rs.reportSteps("Hi", "active");
		rs.reportSteps("Hi", "active", true);
	}

}
