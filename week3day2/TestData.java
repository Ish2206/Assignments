package week3.week3day2;

public class TestData 
{
	public void enterCredentials()
	{
		System.out.println("Credentials entered");
	}
	public void navigateToHomePage()
	{
		System.out.println("Homepage got loaded");
	}
	public static void main(String[] args) 
	{
		System.out.println("LoginTestData class");
		System.out.println("--------------------");
		LoginTestData td = new LoginTestData();
		td.enterCredentials();
		td.enterUserName();
		td.enterPassword();
		td.navigateToHomePage();
		System.out.println("========================");
		System.out.println("LoginTestData2 class");
		System.out.println("--------------------");
		LoginTestData2 td1 = new LoginTestData2();
		td1.enterCredentials();
		td1.enterUserName();
		td1.enterPassword();
		td1.navigateToHomePage();
	}
}
