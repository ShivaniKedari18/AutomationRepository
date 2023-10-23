package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']")).sendKeys("8605186368");
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		Thread.sleep(2000);

	}

}
