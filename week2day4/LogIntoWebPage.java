package week2.week2day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIntoWebPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch URL
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		//Enter Email
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//Enter Password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		Thread.sleep(4000);
		//Click Login Button
		driver.findElement(By.name("login")).click();
		//Click on find your account and log in
		driver.findElement(By.linkText("Find your account and log in.")).click();
		//Get title and verify
		String title = driver.getTitle();
		if(title.contains("Forgotten"))
		{
		System.out.println(title);
		}
	}

}
