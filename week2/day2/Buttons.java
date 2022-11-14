package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		//Set up the path
				WebDriverManager.chromedriver().setup();
				//create the object for chromedriver
				ChromeDriver driver=new ChromeDriver();
				//to maximize window
				driver.manage().window().maximize();
				//load the URL
				driver.get("http://testleaf.herokuapp.com/pages/Button.html");
				System.out.println(driver.findElement(By.id("position")).getLocation());
				System.out.println(driver.findElement(By.id("position")).getLocation().getX());
System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
System.out.println(driver.findElement(By.id("size")).getSize());
System.out.println(driver.findElement(By.id("size")).getText());
System.out.println(driver.findElement(By.id("size")).getCssValue("background-color"));
	}

}
