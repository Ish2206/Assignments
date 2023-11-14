package week3.week3day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		if(title.contains("Dashboard"))
		{
			System.out.println("The " + title + " is displayed correctly");
		}
		driver.navigate().back();
		System.out.println(driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//span[text()='Submit']")).getLocation());
		String bgColor = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
		System.out.println(bgColor);
		System.out.println(driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following::span[2]")).getSize());
		driver.close();
	}
	

}
