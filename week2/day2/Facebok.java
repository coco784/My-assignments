package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebok {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		
		
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abi");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("subramani");
driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9500507089");
	driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("jeeva@2295");
	WebElement dob = driver.findElement(By.id("day"));
	Select birth=new Select(dob);
	birth.selectByValue("22");
	
	WebElement month = driver.findElement(By.id("month"));
	Select months=new Select(month);
	months.selectByVisibleText("Nov");
	
	WebElement year = driver.findElement(By.id("year"));
	Select years=new Select(year);
	years.selectByVisibleText("1995");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/label")).click();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	driver.close();
	
	
	
	
	}

}
