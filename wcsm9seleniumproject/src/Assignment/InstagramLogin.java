package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//identify usernameTextBox and Pass input
		driver.findElement(By.xpath("//input[contains(@name,\"username\")]")).sendKeys("12345");
		//identify PasswordTextBox and Pass input
		driver.findElement(By.xpath("//input[contains(@name,\"password\")]")).sendKeys("manager");
		//identify LoginButton and click
		driver.findElement(By.xpath("//div[text()=\"Log in\"]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
