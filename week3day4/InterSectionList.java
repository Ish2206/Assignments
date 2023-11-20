package week3.week3day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterSectionList 
{
	public static void main(String[] args)
	{
		int[] array1 = {8, 3, 2, 11, 4, 6, 7};
		int[] array2 = {1, 2, 8, 4, 9, 7};
		List <Integer> list1 = new ArrayList<Integer>();
		for (int i : array1) 
		{
			list1.add(i);
		}
		System.out.println(list1);
		List <Integer> list2 = new ArrayList<Integer>();
		for(int j : array2)
		{
			list2.add(j);
		}
		System.out.println(list2);
		for (int i = 0; i < list1.size(); i++) 
		{
			for (int j = 0; j < list2.size(); j++) 
			{
				if(list1.get(i)==list2.get(j))
				{
					System.out.println(list1.get(i));
				}
			}
		}
	}
}
