package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		String parentHandle = driver.getWindowHandle();
		System.out.println("address of parent browser or window"+parentHandle);
		Thread.sleep(2000);
		//click on open a pop window
		driver.findElement(By.partialLinkText("open the popup window")).click();
		//get the address of parent browser as well as child browser
		Set<String> allHandles = driver.getWindowHandles();
		
		//print the address of browser use for each loop
		
		for(String wh:allHandles)
		{
			//System.out.println("");
			
			if(!parentHandle.equals(wh))
			{
				System.out.println("address of child window :"+wh);
			}
			else
			{
				System.out.println("address of parent window :"+wh);
				
			}
		}
		
		
				

	}

}
