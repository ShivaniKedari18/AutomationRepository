package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amc.amazon.com/ap/signin?openid.return_to=https%3A%2F%2Famc.amazon.com%2F&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_amcentral_us&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&mons_redirect=sign_in");
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("amazon");
		driver.findElement(By.id("signInSubmit")).click();
	}

}
