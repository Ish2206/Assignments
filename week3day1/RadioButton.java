package week3.week3day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		System.out.println("The Radio button is not selected - " + driver.findElement(By.xpath("//label[text()='Chrome']")).isSelected());
		Thread.sleep(1000);
		boolean text = driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::input[@checked='checked']/following::label")).isSelected();
		String text1 = driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::input[@checked='checked']/following::label")).getText();
		System.out.println(text1);
		boolean select = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isEnabled();
		if(select==true)
		{
			System.out.println("Radio Button selected already");
		}
		else
		{
			driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
			System.out.println("Radio button selected successfully");
		}
	}
}
