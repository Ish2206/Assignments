package week3.week3day4;

import java.util.Set;
import java.util.TreeSet;

public class SetInterface 
{
	public static void main(String[] args) 
	{
		String companyName = "srihari";
		char[] arr = companyName.toCharArray();
		System.out.println(arr);
		Set<Character> compName = new TreeSet<Character>();
		for (char name1 : arr) 
		{
			compName.add(name1);
		}
		System.out.println(compName);	
	}
}
