package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GetPageSource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//get the title of current webpage
		//String titleOfPage = driver.getTitle();
		//System.out.println(titleOfPage);
		System.out.println(driver.getPageSource());
		driver.close();
	
		

	}

}