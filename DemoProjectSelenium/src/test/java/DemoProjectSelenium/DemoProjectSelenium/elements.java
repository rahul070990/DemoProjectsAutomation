package DemoProjectSelenium.DemoProjectSelenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul-shar\\chromedriver_win32 (17)\\chromedriver.exe");
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		
		
//		driver.findElement(By.id("windowButton")).click();
//		driver.findElement(By.id("messageWindowButton")).click();
		
		driver.findElement(By.id("tabButton")).click();
		String parent_Window= driver.getWindowHandle();
		
		
		
		
		Set<String> child_Window= driver.getWindowHandles();
		Iterator<String> iterator= child_Window.iterator();
		
		Thread.sleep(2000);
		
		while(iterator.hasNext()) {
			String childW=iterator.next();
			if(!parent_Window.equalsIgnoreCase(childW)) {
				driver.switchTo().window(childW);
				Thread.sleep(5000);
				WebElement child_PageText= driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
				System.out.println("ChildWindow sample text is: " +child_PageText.getText());
				
			}
			
		}
		driver.switchTo().window(parent_Window);
		System.out.println("Title of parent window is: " +driver.getTitle());
		driver.close();
		
		
		
		
		
		
//	List<WebElement> options=driver.findElements(By.xpath("//input[@name='name']"));
//	
//	System.out.println(options.size());
//	for(int i=0;i<options.size();i++) {
//		System.out.println(options.get(i).getAttribute("id"));
//		
//		
//	}
		
//		driver.findElement(By.xpath("//input[@value='checkbox1']")).click();
//		Thread.sleep(1000);
//		boolean flag=driver.findElement(By.xpath("//input[@value='checkbox1']")).isSelected();
//		
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		if(flag=true) {
//			
//			System.out.println("Element is selected");
//			
//		}
//		
//		else{
//			
//			System.out.println("Element is not selected");
//			
//		}
//		
//		
////		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Rahul");
////		
////		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
//		
	
		
		
	}

}
