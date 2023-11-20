package week3.week3day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringList 
{
	public static void main(String[] args) 
	{
		String[] array = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> name = new ArrayList<String>();
		for (String i : array) 
		{
			name.add(i);
		}
		System.out.println(name);
		Collections.sort(name);
		System.out.println(name);
		for (int i = name.size()-1; i >= 0; i--) 
		{
			System.out.println(name.get(i));
		}
	}
}
