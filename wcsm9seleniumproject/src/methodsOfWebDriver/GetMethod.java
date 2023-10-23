package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//TO launch the Chrome need to create obj of ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to launch WebApplication
		
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(4000);
		
		//click on open a pop window link...
		
		driver.findElement(By.partialLinkText("open a popup window")).click();
		Thread.sleep(4000);
		
		//driver.close();
		
		//close the parent as well as child window
		driver.quit();
		
		
		
		

	}

}
