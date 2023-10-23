package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// to launch Edge browser we need to create obj of EdgeDriver();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println("Edge is open !!");
		
		Thread.sleep(2000);
		
		driver.close();
		System.out.println("Edge is close !!");

	}

}
