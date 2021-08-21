package DemoProjectSelenium.DemoProjectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//WebDriver driver1 =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul-shar\\chromedriver_win32 (17)\\chromedriver.exe");
		
		//Method to open URL
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		//Element which needs to be dragged from the place
		WebElement drapFrom = driver.findElement(By.xpath("//div[@class='ui-widget-content']/ul/li[2]"));
	   
		//Element which needs to be dragged to the place
		WebElement drapTo = driver.findElement(By.xpath("//tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));
	   
	      
	      Actions actionDragDrop = new Actions(driver);
	   
	      Thread.sleep(3000);
	      actionDragDrop.dragAndDrop(drapFrom, drapTo).build().perform();
	      System.out.println("Element moved from source A to B succesffully");
	      
	      Thread.sleep(2000);
	      
	  
		driver.close();

	}

}
