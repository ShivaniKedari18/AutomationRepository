package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://outlet-in.bookmyshow.com/");
		driver.findElement(By.id("txtUser")).sendKeys("sandhya1111");
		driver.findElement(By.id("txtPass")).sendKeys("11111111");
		driver.findElement(By.id("btnLog")).click();

   }
}
