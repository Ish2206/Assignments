package week4.week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("The Price of the First Item is : " + price);
		String rating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("The rating of the first item is : " + rating);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles(); 
		for (String s : allWindowHandles) 
		{
			driver.switchTo().window(s);
		}
		File screenShot1 = driver.getScreenshotAs(OutputType.FILE);
		File location1 = new File("./snaps/beforeclick.png");
		FileUtils.copyFile(screenShot1, location1);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		File screenShot2 = driver.getScreenshotAs(OutputType.FILE);
		File location2 = new File("./snaps/afterclick.png");
		FileUtils.copyFile(screenShot2, location2);
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//b[text()='Cart subtotal']/following::span[2]"));
		Thread.sleep(3000);
		String subTotal = element.getText();
		System.out.println("The subtotal is : " + subTotal);
		subTotal = subTotal.replaceAll(".00", "");
		subTotal = subTotal.replaceAll("₹", "");
		if(price.equals(subTotal))	
		{
			System.out.println("The price values are matching");
		}else
		{
			System.out.println("The price values are not matching");
		}
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow).close();
		driver.quit();
	}
}
