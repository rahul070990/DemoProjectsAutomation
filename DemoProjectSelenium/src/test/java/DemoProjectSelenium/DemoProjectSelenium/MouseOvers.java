package DemoProjectSelenium.DemoProjectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class MouseOvers {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//WebDriver driver1 =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul-shar\\chromedriver_win32 (17)\\chromedriver.exe");
		
		//Method to open URL
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//
		WebElement home= driver.findElement(By.xpath("//a[text()='Home']"));
		
		WebElement td_Home = driver
                .findElement(By
                .xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));    
		
		Actions action= new Actions(driver);
		
		
		//move to that element using moveToElement method
		Action mouseover= action.moveToElement(home).build();
		
		Thread.sleep(2000);
		
		String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor); 
        Thread.sleep(2000);
        
        mouseover.perform();
        Thread.sleep(2000);
        
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor); 
        
		//Mouse moved successfully
		System.out.println("Mouse moved successfully");
		
		driver.close();
		
		
	

	}

}
