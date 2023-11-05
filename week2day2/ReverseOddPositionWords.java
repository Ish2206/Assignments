package week2.week2day2;

public class ReverseOddPositionWords 
{
	public static void main(String[] args)
	{
		String test = "I am a software tester";
		String temp = "";
		String[] arr = test.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				temp = "";
				String arr1 = arr[i];
				char[] charArray = arr1.toCharArray();
					for(int k=arr1.length()-1;k>=0;k--)
					{
						temp = temp+arr1.charAt(k);
						arr[i] = temp;
					}
			}		
			System.out.print(arr[i]+" ");
		}
	}
}


