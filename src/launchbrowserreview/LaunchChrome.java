package launchbrowserreview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		//run on Java Application
		
//		WebDriver wd = new ChromeDriver();//ChromeDriver implements WebDriver// wd = always called driver
		
		System.setProperty("webdriver.chrome.driver", "Driver_New\\chromedriver.exe");	//must be before the driver// add driver executable
		WebDriver driver = new ChromeDriver();	//just an object//.exe= for launching any application on window//
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("btnK")).click();	//why not click?
		
		Thread.sleep(3000);
		driver.close();
		
		
	}
	

}
