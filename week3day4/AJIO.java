package week3.week3day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AJIO 
{
	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@aria-label='Allow Location' and @type='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Search AJIO']")).sendKeys("bags");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Search AJIO']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String count = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("The number of items found : " + count);
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		System.out.println("The list of Brands are as follows: ");
		for (int i = 0; i < brand.size(); i++) 
		{
			WebElement Element = brand.get(i);
			System.out.println(Element.getText());
		}
		System.out.println("================================================");
		List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("The list of bag names are : ");
		for (int i = 0; i < bagName.size(); i++) 
		{
			WebElement bags = bagName.get(i);
			System.out.println(bags.getText());
		}
		
		
		
	}

}
