package week3.week3day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonPriceList 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List <WebElement> priceList = new ArrayList<WebElement>();
		priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println("The PriceList are : ");
		List<Integer> Amt = new ArrayList<Integer>();
		int size = priceList.size();
		int temp = 0;
		for (int i = 0; i < size; i++) 
		{
			WebElement price = priceList.get(i);
			String price1 = price.getText();
			price1 = price1.replaceAll(",", "");
			System.out.println(price1);
			temp = Integer.parseInt(price1);
			Amt.add(temp);
		}
		System.out.println(Amt);
		Collections.sort(Amt);
		System.out.println(Amt);
		System.out.println("The lowest price amount is : " + Amt.get(0));
	}
}
