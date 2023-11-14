package week3.week3day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox 
{
	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[1]")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[1]")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed());
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[5]")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='State = 1']")).isDisplayed());
//		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[5]")).click();
//		System.out.println(driver.findElement(By.xpath("//p[text()='State = 2']")).isDisplayed());
//		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[5]")).click();
//		System.out.println(driver.findElement(By.xpath("//p[text()='State = 0']")).isDisplayed());
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed());
//		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
//		System.out.println(driver.findElement(By.xpath("//span[text()='Unchecked']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//span[text()='Disabled']/preceding-sibling::div[1]")).isEnabled());
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-item-value='Miami']/div")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Paris']/div")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Barcelona']/div")).click();
		Thread.sleep(1000);
		driver.close(); 
	}
}
