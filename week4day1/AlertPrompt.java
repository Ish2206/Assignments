package week4.week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPrompt 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/parent::div//span[text()='Show']")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.sendKeys("Ishwarya");
		alert.accept();
		String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text);
	}
		
}
