package week2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateLeadUsingSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//create the object for chromedriver
		ChromeDriver driver=new ChromeDriver();
		//to maximize window
		driver.manage().window().maximize();
		//load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//to enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//to click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//get title
		System.out.println(driver.getTitle());
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		// to new create  lead
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println(driver.getTitle());
		//companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abi");
		
		//lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subramani");
		//dropdown
		//to find dropdown
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//to create object for select dropdown
		Select sc=new Select(source);
		//select dropdown options
		sc.selectByIndex(3);
		//to find dropdown industry
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select sc2=new Select(industry);
//sc2.selectByValue("IND_HEALTH_CARE");
//sc2.selectByVisibleText("Non-profit");
sc2.selectByIndex(1);
//create lead button
driver.findElement(By.className("smallSubmit")).click();
//get title
System.out.println(driver.getTitle());

		
		

	}

}
