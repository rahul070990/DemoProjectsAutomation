package DemoProjectSelenium.DemoProjectSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul-shar\\chromedriver_win32 (17)\\chromedriver.exe");
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("tabButton")).click();
		
		String parent_URL= driver.getWindowHandle();
		
		//Set is used to store the unique values
		Set<String> child_windows=driver.getWindowHandles();
		
		Iterator<String> itr=child_windows.iterator();
		
		while(itr.hasNext()) {
			String child_URL=itr.next();
			if(!parent_URL.equalsIgnoreCase(child_URL)) {
				
				Thread.sleep(3000);
				driver.switchTo().window(child_URL);
				WebElement ele=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
				System.out.println("Text of the element in new Tab is: "  +ele.getText());
				driver.close();
				
			}
	
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
