package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameLocator {

	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shivani/Desktop/wcsm9webelement/LoginPage.html");
		Thread.sleep(2000);
		
		//identify usernameTB and pass input AS "admin"
		driver.findElement(By.tagName("input")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("Manager");
		
		
		
		
		
		

	}

}
