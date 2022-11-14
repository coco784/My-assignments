package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		//Set up the path
		WebDriverManager.chromedriver().setup();
		//create the object for chromedriver
		ChromeDriver driver=new ChromeDriver();
		//to maximize window
		driver.manage().window().maximize();
		//load the URL
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='example']//input")).click();
System.out.println(driver.findElement(By.xpath("//div[@class='example']//input")).isSelected());
System.out.println(driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input")).isSelected());
System.out.println(driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input")).isSelected());
driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[1]")).click();
driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[2]")).click();
driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[3]")).click();
driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[4]")).click();
driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[5]")).click();
driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[6]")).click();


	}

}
