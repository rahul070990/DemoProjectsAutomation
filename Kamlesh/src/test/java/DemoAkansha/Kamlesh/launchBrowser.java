package DemoAkansha.Kamlesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul-shar\\chromedriver_win32 (17)\\chromedriver.exe");
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='English']")).click();
		WebElement images_element=driver.findElement(By.xpath("//a[text()='Images']"));
		Thread.sleep(1000);
		images_element.click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().back();
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		String page_Source= driver.getPageSource();
		System.out.println(page_Source);
		
		String page_Title=driver.getTitle();
		System.out.println(page_Title);
		
		Thread.sleep(1000);
	

	}
	
	//implemented method
	public void mymethod() {
		
		System.out.println("Implemented method");
		
	}
	//non implemented method
	abstract
	public abstract void nupurmethod();

}
