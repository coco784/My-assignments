package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static void main(String[] args) {
		 //Set up the path
		WebDriverManager.chromedriver().setup();
		//create the object for chromedriver
		ChromeDriver driver=new ChromeDriver();
		//to maximize window
		driver.manage().window().maximize();
		//load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
	}

}
