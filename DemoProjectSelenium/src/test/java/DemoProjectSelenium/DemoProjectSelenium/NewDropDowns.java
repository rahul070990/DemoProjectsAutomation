package DemoProjectSelenium.DemoProjectSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver1 =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul-shar\\chromedriver_win32 (17)\\chromedriver.exe");
		
		//div[@class='mt-2 row'][1]/div/div/div/div[2]
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.print("Nothing found");
		
		//div[@id='withOptGroup']/div/div/div[@class=' css-1wa3eu0-placeholder']
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@class='mt-2 row'][1]/div/div/div/div[2]")));
		
		System.out.println("Clicked performed");
		
		
		driver.findElement(By.xpath("//div[@id='withOptGroup']/div/div[@class=' css-1hwfws3']/following-sibling::div")).click();
//		List<WebElement> ele= driver.findElements(By.xpath("//div[@id='withOptGroup']/div/div/div[1]"));
//		System.out.print("List found");
//		for(WebElement e:ele) {
//			if(e.getText().contains("Select Option")) {
//				e.click();
//			}
//			else {
//				System.out.print("Unable to find the ele");
//			}
//		}
		
		
		
		
//		WebDriverWait wait= new WebDriverWait(driver,20);
//		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='mt-2 row'][1]/div/div/div/div[2]"))).sendKeys("Group");
//		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='withOptGroup']/div/div"))).click();
//		
//		driver.findElement(By.xpath("//div[text()='Select Option']")).sendKeys(Keys.DOWN);
//		driver.findElement(By.xpath("//div[text()='Select Option']")).sendKeys(Keys.ENTER);
//		//driver.findElement(By.xpath("//div[@class='mt-2 row'][1]/div/div/div/div[2]")).click();
//		System.out.print("dropd click found");
//		Thread.sleep(1000);
//		List<WebElement> dropele=  driver.findElements(By.xpath("//div[@class='mt-2 row']/div/div/div[@class=' css-yk16xz-control']/div[1]/div[@class=' css-1uccc91-singleValue']"));
//		Thread.sleep(1000);
//		for(int i=0;i<dropele.size();i++) {
//			System.out.println(dropele.get(i).getText());
//		}
		driver.close();
	}

}
