package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
	
	public static void main(String[] args) throws InterruptedException {
		//to launch Firefox browser we need to create obj of FirefoxDriver();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Firefox is Open!!");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Firefox is close!!");
		
		
	}

}
