package week2.week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbRegistration 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		//Launch URL
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ishwarya");
		driver.findElement(By.name("lastname")).sendKeys("R");
		driver.findElement(By.name("reg_email__")).sendKeys("ishu123@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("ishu123");
		WebElement dateDD = driver.findElement(By.id("day"));
		Select date = new Select(dateDD);
		date.selectByIndex(1);
		WebElement monthDD = driver.findElement(By.id("month"));
		Select month = new Select(monthDD);
		month.selectByValue("7");
		WebElement yearDD = driver.findElement(By.id("year"));
		Select year = new Select(yearDD);
		year.selectByVisibleText("1990");
		driver.findElement(By.name("sex")).click();
	}
}
