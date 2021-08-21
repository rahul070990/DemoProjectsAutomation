package DemoProjectA.Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		//Specify the path of your browser driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul-shar\\chromedriver_win32 (17)\\chromedriver.exe");
		
		//Launch the browser
		driver.get("https://www.google.com");
		
		//Maximize browser
		driver.manage().window().maximize();
		
		String pageTitle= driver.getTitle();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		//driver.findElement(By.name("btnK")).click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		
		String google_PageSource= driver.getPageSource();
		System.out.println("PageSource of the title is: " +google_PageSource);
		
		System.out.println("Page of the title is: " +pageTitle);
		
		//Close the browser
		driver.close();
		
		
		
		
		
		
		
	}

}
