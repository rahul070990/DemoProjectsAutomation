package DemoProjectSelenium.DemoProjectSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul-shar\\chromedriver_win32 (17)\\chromedriver.exe");
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		Alert clickMe= driver.switchTo().alert();
		
		Thread.sleep(2000);
		clickMe.accept();
		
		System.out.println("Alert has been selected");
		

	}

}
