package week2.week2day1;

public class IsPalindrome 
{
	public static void main(String[] args) 
	{
		int input=121;
		int output = 0;
		
		for(int i=input; i>0;)
		{
			int rem=i%10;
			output=(output*10)+rem;
			i=i/10;
		}
		if(input==output)
		{
			System.out.println("Its a palindrome");
		}
		else
		{
			System.out.println("Its not a palindrome");
		}
	}

}
