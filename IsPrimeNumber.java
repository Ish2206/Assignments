package week2.day1;

public class IsPrimeNumber 
{
	public static void main(String[] args)
	{
		int n = 13;
		for(int i=2; i<=n-1; i++)
		{
			if(n%i!=0)
			{
				System.out.println(n+" is a Prime Number");
				break;
			}
			else
			{
				System.out.println(n+" is not a Prime Number");
				break;
			}
		}

	}

}
