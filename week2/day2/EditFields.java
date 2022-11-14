package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class EditFields {

	public static void main(String[] args) {
		//Set up the path
		WebDriverManager.chromedriver().setup();
		//create the object for chromedriver
		ChromeDriver driver=new ChromeDriver();
		//to maximize window
		driver.manage().window().maximize();
		//load the URL
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("abisubramani953@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Abi");
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		//System.out.println(driver.getPageSource());
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled());
		System.out.println(driver.findElement(By.name("username")).isEnabled());
		
	}

}
