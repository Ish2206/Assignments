package week3.week3day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MissingElementList 
{
	public static void main(String[] args) 
	{
		int[] array = {1, 2, 3, 4, 10, 6, 8, 12, 14};
		List<Integer> list = new ArrayList<Integer>();
		for (int i : array) 
		{
			list.add(i);
		}
		System.out.println("The converted array list : " + list);
		Collections.sort(list);
		System.out.println("The sorted list is : " + list);
		System.out.println("The missing elements are : ");
		for (int i = 0; i < list.size()-1; i++) 
		{
			int ele = list.get(i)+1;
			if(ele!=list.get(i+1))
			{
				System.out.println(ele);
			}
		}
	}
}
