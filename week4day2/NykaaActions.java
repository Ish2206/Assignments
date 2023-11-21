package week4.week4day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NykaaActions 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.xpath("//li//a[text()='brands']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oréal Paris");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//div[@class='ss-wrapper']//a"));
		ele2.click();
		driver.findElement(By.xpath("//button[@class=' css-1aucgde']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Colour Protection']")).click();
		WebElement filter = driver.findElement(By.xpath("//span[@class='filter-value']"));
		String val = filter.getText();
		System.out.println(val);
		if(val.contains("Shampoo"))
		{
			System.out.println("Filter is applied with shampoo");
		}
		driver.findElement(By.xpath("//img[@alt=\"L'Oreal Paris Colour Protect Shampoo With UVA & UVB For Colour-Treated Hair\"]")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles(); 
		for (String s : allWindowHandles) 
		{
			driver.switchTo().window(s);
		}
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		WebElement mrp = driver.findElement(By.xpath("//span[text()='MRP:']/following-sibling::span"));
		String amt = mrp.getText();
		System.out.println("MRP is : " + amt);
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		driver.switchTo().frame(0);
		WebElement total = driver.findElement(By.xpath("//div[@id='app']/div/div/div[3]/div/div/div/div[1]/div/div[1]/span"));
		String tot = total.getText();
		System.out.println("The Grand Total is " + tot);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.findElement(By.xpath("//div[@data-testid='back_button']")).click();
		WebElement details = driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/p"));
		String price = details.getText();
		System.out.println("The price is " + price);
		if(tot.equals(price))
		{
			System.out.println("The amounts are matching");
		}
		driver.close();
		driver.switchTo().window(parentWindow);
		driver.close();
	}

}
