package DemoProjectSelenium.DemoProjectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//WebDriver driver1 =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul-shar\\chromedriver_win32 (17)\\chromedriver.exe");
		
		
		
		//Method to open URL
		driver.get("https://www.madridsoftwaretrainings.com/");
		
		//Another method to navigate to url
		//driver.navigate().to("https://www.madridsoftwaretrainings.com/");
		
		//Method to maximize the window
		driver.manage().window().maximize();
		
		//Method to get the Title
		String webSiteURL= driver.getTitle();
		
		//Print the Title of the WebPage
		System.out.println(webSiteURL);
		
		//Click the AboutUs Element
		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		
		//Navigate back to Home page
		driver.navigate().back();
		
		//Navigate again to AboutUs
		driver.navigate().forward();
		
		//refresh the Webpage
		driver.navigate().refresh();
		
		String pageUrl = "http://www.bing.com";
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String jsOpenNewWindow = "window.open('"+pageUrl+"');";
		js.executeScript(jsOpenNewWindow);
		Thread.sleep(2000);;
		System.out.println("New window has been opened");
		
		//Closes all browsers or one browser
		driver.quit();
		//System.out.println("Both windows has been closed");
		
		
	}

}
