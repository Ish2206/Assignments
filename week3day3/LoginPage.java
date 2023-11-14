package week3.week3day3;

public class LoginPage extends BasePage
{
	public void performCommonTasks()
	{
		System.out.println("The Common Tasks is Logging in to the webpage");
	}
	public static void main(String[] args) 
	{
		LoginPage lp = new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.enterText("Hello World");
		lp.performCommonTasks();
	}

}
