package week2.week2day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectDropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/");
		Thread.sleep(2000);
		//Enter Username
		driver.findElement(By.id("username")).sendKeys("demoCSR");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(4000);
		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ishwarya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		Thread.sleep(2000);
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source = new Select(sourceDD);
		source.selectByIndex(3);
		Thread.sleep(2000);
		WebElement markCampDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select markCamp = new Select(markCampDD);
		markCamp.selectByVisibleText("Automobile");
		Thread.sleep(2000);
		WebElement ownerDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select owner = new Select(ownerDD);
		owner.selectByValue("OWN_CCORP");
		Thread.sleep(3000);
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		if(title.contains("View Lead"))
		{
			System.out.println("Lead Created Succesfully");
		}
		System.out.println(title);
		Thread.sleep(2000);
		driver.close();		
	}
}
