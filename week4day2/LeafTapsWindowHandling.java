package week4.week4day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsWindowHandling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::img")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles(); 
		for (String s : allWindowHandles) 
		{
			driver.switchTo().window(s);
		}
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//td//a")).click();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following::img")).click();
		Thread.sleep(3000);
		Set<String> allWindowHandles1 = driver.getWindowHandles(); 
		for (String s : allWindowHandles1) 
		{
			driver.switchTo().window(s);
		}
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/div/a")).click();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.linkText("Merge")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
