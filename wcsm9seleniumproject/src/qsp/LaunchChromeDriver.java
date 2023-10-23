package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //to launch Chrome browser we need to create obj of ChromeDriver();
		
		
		WebDriver driver=new ChromeDriver();
		//to maximaze the page
		driver.manage().window().maximize();
		
		System.out.println("Chrome is Open!!");
		Thread.sleep(4000);
		driver.close();
		System.out.println("Chrome is Close!!");
		
		
		
		
	}

}
