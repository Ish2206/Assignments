package week2.week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Testleaf123");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement IndustryDD = driver.findElement(By.name("industryEnumId"));
		Select Industry = new Select(IndustryDD);
		Industry.selectByIndex(3);
		WebElement OwnerDD = driver.findElement(By.name("ownershipEnumId"));
		Select Owner = new Select(OwnerDD);
		Owner.selectByVisibleText("S-Corporation");
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(sourceDD);
		source.selectByValue("LEAD_EMPLOYEE");
		WebElement markCampDD = driver.findElement(By.id("marketingCampaignId"));
		Select markCamp = new Select(markCampDD);
		markCamp.selectByIndex(6);
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(stateDD);
		state.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}
}
