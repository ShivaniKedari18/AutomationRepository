package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		String parentHandle = driver.getWindowHandle();
		System.out.println("http://omayo.blogspot.com/"+ parentHandle);
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh : allHandles)
		{
			if (!parentHandle.equals(wh)) 
			{
				//System.out.println("Open a popup window:"+wh);
				 TargetLocator switchto = driver.switchTo();
				 Thread.sleep(2000);
				 switchto.window(wh).close();
			}
		}

	}

}
