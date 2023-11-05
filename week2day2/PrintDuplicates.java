package week2.week2day2;

import java.util.Arrays;

public class PrintDuplicates 
{
	public static void main(String[] args) 
	{
		int[] numbers = {2,5,7,7,5,9,2,3};
		Arrays.sort(numbers);
		for(int i=0; i<numbers.length-1; i++)
		{
			if(numbers[i]==numbers[i+1])
			{
				System.out.println("The Duplicate Numbers are " + numbers[i]);
			}
		}		
	}
}
