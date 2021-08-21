package DemoProjectSelenium.DemoProjectSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class ElementElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//input[@name='name']
		//input[@value='Yes'], //input[@value='No']

		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver1 =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul-shar\\chromedriver_win32 (17)\\chromedriver.exe");
		
		//Method to open URL
		driver.get("http://demo.guru99.com/test/ajax.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		/*List<WebElement> ele=driver.findElements(By.xpath("//input[@name='name']"));
		
		Thread.sleep(1000);

		for(int i=0;i<ele.size();i++) {
			System.out.println(ele.get(i).getAttribute("id"));
			
		}*/
		
		Boolean result= driver.findElement(By.xpath("//input[@value='Reset']")).isDisplayed();
		
		System.out.println(result);
		
		Boolean result1= driver.findElement(By.xpath("//input[@id='buttoncheck']")).isEnabled();
		
		System.out.println(result1);
		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ajay Saini");
//		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("RockStar");
//		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
		
	
		
		
		driver.close();

	}

}
