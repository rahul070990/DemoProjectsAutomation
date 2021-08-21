package DemoProjectSelenium.DemoProjectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//WebDriver driver1 =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul-shar\\chromedriver_win32 (17)\\chromedriver.exe");
		
		//Method to open URL
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		//
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
	      // Capture x and y offset positions of element
	      int xOffset = gmailLink.getRect().getX();
	      System.out.println("Value of xOffSet is: " +xOffset);
	      
	      
	      int yOffset = gmailLink.getRect().getY();
	      System.out.println("Value of yOffSet is: " +yOffset);
	      
	      Actions actionProvider = new Actions(driver);
	      // Performs mouse move action onto the offset position
	      Thread.sleep(3000);
	      actionProvider.moveByOffset(xOffset, yOffset).build().perform();
	      Thread.sleep(2000);
	   
	  
		driver.close();

	}

}
