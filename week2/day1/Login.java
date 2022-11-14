package week2.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
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
				// to new create  lead
				driver.findElement(By.linkText("Create Lead")).click();
				System.out.println(driver.getTitle());
						//companyname
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				//firstname
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abi");
				
				//lastname
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subramani");
				//create lead button
				driver.findElement(By.className("smallSubmit")).click();
				//get title
				System.out.println(driver.getTitle());
				
	}

}
