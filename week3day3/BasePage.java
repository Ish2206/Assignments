package week3.week3day3;

public class BasePage 
{
//	- Create a subclass named LoginPage.
//	- Override the performCommonTasks() method in the LoginPage class.
//	- Demonstrate the concept by creating objects for both classes and calling their methods.
	public void findElement()
	{
		System.out.println("Element is found");
	}
	public void clickElement()
	{
		System.out.println("Element is clicked");
	}
	public void enterText(String text)
	{
		System.out.println("The text entered is " + text);
	}
	public void performCommonTasks()
	{
		System.out.println("Perform Login");
	}
	public static void main(String[] args) 
	{
		BasePage bp = new BasePage();
		bp.findElement();
		bp.clickElement();
		bp.enterText("Hi");
		bp.performCommonTasks();
	}
}
