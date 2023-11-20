package week4.week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyTheValueAlert 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@class='product-title']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys("600061");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.findElement(By.xpath("//button[@id='product-add-to-cart']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@data-hover='View Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
	}

}
