package week3.week3day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Find2ndLargest 
{
	public static void main(String[] args) 
	{
		int[] array = {3, 2, 11, 4, 6, 7};
		List<Integer> list = new ArrayList<Integer>();
		for (int i : array) 
		{
			list.add(i);
		}
		System.out.println("The converted array : " + list);
		Collections.sort(list);
		System.out.println("The sorted list is : " + list);
		int size = list.size()-2;
		System.out.println("The second largest number in the list is : " + list.get(size));
	}
}
