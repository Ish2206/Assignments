package week2.week2day1;

public class FindOddNumbers 
{

	public static void main(String[] args) 
	{
		FindOddNumbers num = new FindOddNumbers();
		num.findOdd();
	}
	
	public void findOdd()
	{
		for (int i=0;i<=10;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}
}
