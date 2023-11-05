package week2.week2day2;

import java.util.Arrays;

public class FindMissingElement 
{
	public static void main(String[] args) 
	{
		int[] array = {1,4,3,2,8,5,6,7,11,9};
		Arrays.sort(array); 
		int sum = 0;
		for(int i=0;i<array.length;i++)
		{
			sum=array[i]+sum;
		}
		System.out.println("The sum of all the values in an array is : " + sum);
		int max = array[array.length-1];
		System.out.println("The maximum number is : " + max);
		int missNum = (max*(max+1)/2)-sum;
		System.out.println("The missing Number is : " + missNum);
	}
}
