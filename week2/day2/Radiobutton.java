package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//create the object for chromedriver
		ChromeDriver driver=new ChromeDriver();
		//to maximize window
		driver.manage().window().maximize();
		//load the URL
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		Thread.sleep(2000);
	driver.findElement(By.id("yes")).click();
	System.out.println(driver.findElement(By.id("yes")).isSelected());
	WebElement unchecked = driver.findElement(By.xpath("(//input[@value='0'])[2]"));
	WebElement checked = driver.findElement(By.xpath("(//input[@value='1'])[3]"));
	if(checked.isSelected()) {
		System.out.println("checked is selected");
	}
	else if(unchecked.isSelected()) {
		System.out.println("unchecked is selected");
	}
	driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[6]")).click();
	WebElement age = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[6]"));
	System.out.println(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[6]")).isSelected());
if(age.isSelected()) {
	System.out.println("Age is : 26");
}
	else
	{
		System.out.println("not selected between 21-40");
	
}
	}

}
