package week2.week2day1;

public class IsPrimeNumber 
{
	public static void main(String[] args)
	{
		int n = 17,flag=0;
		for(int i=2; i<=n-1; i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not a Prime Number");
				flag=1;
				break;
			}	
		}
			if(flag==0)
			{
				System.out.println(n+" is a Prime Number");
			}
	}
}
