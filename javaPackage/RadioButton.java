package javaPackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {

	public static void main(String[] args) throws Exception{
		
		//setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver","D:\\Data\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		
		//1st way
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(1000);
		
	//	driver.findElement(By.xpath("//))

	}

}
