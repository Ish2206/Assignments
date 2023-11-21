package week4.week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCWindowHandle 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> window = driver.getWindowHandles();
		List<String> window1 = new ArrayList<>(window);
		String title = driver.switchTo().window(window1.get(1)).getTitle();
		System.out.println(title);
		driver.switchTo().window(window1.get(0)).close();
		
	}

}
