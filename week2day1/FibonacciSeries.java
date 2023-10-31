package week2.week2day1;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int range=10,a=0,b=1;
		System.out.println("The fibonacci series are as follows ");
		for(int i=1; i<=range; i++)
		{
				System.out.println(a);
				int c=a+b;
				a=b;
				b=c;
		}
	
	}

}
