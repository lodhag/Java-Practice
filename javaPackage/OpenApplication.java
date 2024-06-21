/*To open the application through selenium*/
package javaPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args)throws Exception {
		//setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver","D:\\Data\\eclipse-workspace\\chromedriver.exe");
		
		//Launching Chrome browser Instance
		
		WebDriver driver = new ChromeDriver();
		
		//Open url using get() method
		
		driver.get("https://www.facebook.com/");
		
		//Maximize the window
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//Delete all cookies
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		//open url using navigate() method
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		
		//Refresh the Page
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//Navigate to back 
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Navigate to forward
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//Fetch Current URL
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		//Get Title of the web page
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		//Close the browser
		
		driver.close();	
	}
}
