package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://affiliate.flipkart.com/login");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("Admin@gmail.com");
	
		
		driver.findElement(By.id("inputPassword")).sendKeys("admin");
		driver.findElement(By.id("submitLogin")).click();

}
}
