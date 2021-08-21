
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Cricket Australia\\Automation\\CAUITestAutomation\\CAUITestAutomation\\src\\test\\resources\\drivers\\chromedriver.exe");
	driver.get("https://www.google.com");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	driver.findElement(By.xpath("//a[@href='https://www.my.commbiz.commbank.com.au/registration/client/registration/RegSelectionDoAction.aspx']")).click();
	
	
	//driver.findElement(By.xpath("//div[@class='Register_logIn']/a[contains(text(),'Register online now ')]")).click();
	
	driver.findElement(By.name("btnNext")).click();
	driver.findElement(By.xpath("//input[@id='chkTerms']")).click();
	driver.findElement(By.id("btnSubmit")).click();
	driver.findElement(By.name("txtUserName")).sendKeys("RahulSharma");
	
	driver.findElement(By.name("txtPassword")).sendKeys("JhalakNagpal");
	driver.findElement(By.name("txtReenterPassword")).sendKeys("JhalakNagpal");
	
	Select sDropdown= new Select(driver.findElement(By.id("ddlSecret1")));
	sDropdown.selectByValue("ObjItem0");
	
	driver.findElement(By.name("txtSecret1")).sendKeys("Red");
	
	
	Select sDropdown1= new Select(driver.findElement(By.id("ddlSecret2")));
	sDropdown1.selectByValue("ObjItem1");
	
	driver.findElement(By.name("txtSecret2")).sendKeys("kumar");
	
	driver.findElement(By.xpath("//input[@name='btnSubmit']")).click();
	
	driver.close();
		
		
	
	}

}