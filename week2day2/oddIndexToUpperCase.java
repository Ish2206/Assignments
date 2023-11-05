package week2.week2day2;

public class oddIndexToUpperCase 
{
	public static void main(String[] args)
	{
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for(int i=0; i<charArray.length;i++)
		{
			if(i%2!=0)
			{
				String test1 = test.toUpperCase();
				char[] charArray1 = test1.toCharArray();
				System.out.print(charArray1[i]);
			}	
			else
			{
				System.out.print(charArray[i]);
			}
				
		}
		
	}

}
