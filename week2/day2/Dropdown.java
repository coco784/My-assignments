package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Dropdown {

	public static void main(String[] args) {
		//Set up the path
				WebDriverManager.chromedriver().setup();
				//create the object for chromedriver
				ChromeDriver driver=new ChromeDriver();
				//to maximize window
				driver.manage().window().maximize();
				//load the URL
				driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
				//driver.findElement(By.id("dropdown1")).click();
		WebElement trainingprogram = driver.findElement(By.id("dropdown1"));
		Select tp= new Select(trainingprogram);
		tp.selectByIndex(2);
		WebElement text = driver.findElement(By.name("dropdown2"));
		Select tp2=new Select(text);
		tp2.selectByVisibleText("Selenium");
		 
	}

}
