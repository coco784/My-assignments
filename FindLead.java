package week2.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLead {
public static void main(String[] args) {
	//Set up the path
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
			//findlead
			driver.findElement(By.linkText("Find Leads")).click();
			//name and id 
			driver.findElement(By.linkText("Name and ID")).click();
			System.out.println(driver.getTitle());
			//firstname text box
			driver.findElement(By.id("ext-gen248")).sendKeys("Abi");
			//lastname text box
			driver.findElement(By.id("ext-gen250")).sendKeys("Subramani");
			//companyName
			driver.findElement(By.id("ext-gen252")).sendKeys("Testleaf");
			System.out.println(driver.getTitle());
			driver.findElement(By.id("ext-gen334")).click();
			
			
	
}
}
