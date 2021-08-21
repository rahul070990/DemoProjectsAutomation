package DemoProjectSelenium.DemoProjectSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//button[@id='tabButton']
		String parent_url= driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		Set<String> child_url = driver.getWindowHandles();
		Iterator<String> it = child_url.iterator();
		Thread.sleep(2000);
		while(it.hasNext())
		{
			String child_ref= it.next();
			
			if(!parent_url.equalsIgnoreCase(child_ref))
			{
				Thread.sleep(2000);
				driver.switchTo().window(child_ref);
				Thread.sleep(3000);
				String child_Window_Title=driver.getTitle();
				System.out.println("Child Window title is: " +child_Window_Title);
				WebElement txt = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
				System.out.println("Text of txt WebElement is: " +txt.getText());
				System.out.println(txt);
				driver.close();
			}
		}
		
	}

}
