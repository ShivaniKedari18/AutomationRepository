package methodsOfWebDriver;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.google.com/");
	   
	   Thread.sleep(2000);
	   String google = driver.getWindowHandle();
	   System.out.println(driver.getWindowHandles());
	   driver.switchTo().newWindow(WindowType.WINDOW);
	   driver.get("https://www.flipkart.com/");
	   driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']")).sendKeys("8605186368");
	   //driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
	   Thread.sleep(2000);
	   driver.switchTo().window(google);
	   driver.switchTo().activeElement().sendKeys("shivani");
	   

	}

}
