package week2.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
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
			//click accounts
			driver.findElement(By.linkText("Accounts")).click();
			//create account
			driver.findElement(By.linkText("Create Account")).click();
			//to enter  account NAME 
			driver.findElement(By.id("accountName")).sendKeys("vi");
			//enter country code
			driver.findElement(By.id("primaryPhoneCountryCode")).sendKeys("91");
			//enter phone number
			driver.findElement(By.id("primaryPhoneNumber")).sendKeys("9943523292");
			//enter mail id
			driver.findElement(By.id("primaryEmail")).sendKeys("jeeva2295@gmail.com");
			//to submit create account button
			driver.findElement(By.className("smallSubmit")).click();
			System.out.println(driver.getTitle());
	
}
}