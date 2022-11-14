package week2.day2;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HandleDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to handle dropdown 
		//what is your favourite automation tool?
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
		// create object for select class
		Select drop=new Select(tool);
		drop.selectByIndex(1) ;
		//choose Country
		//to click 
		driver.findElement(By.id("j_idt87:country_label")).click();
		//to select country
		driver.findElement(By.id("j_idt87:country_3")).click();
		
		
		
		
	}

}
