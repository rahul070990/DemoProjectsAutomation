package DemoProjectSelenium.DemoProjectSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Action;

public class DropdownInteractions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//WebDriver driver1 =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul-shar\\chromedriver_win32 (17)\\chromedriver.exe");
		
		//Method to open URL
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
		//Element which needs to be dragged from the place
		//WebElement oldMenu= driver.findElement(By.xpath("//*[@id='oldSelectMenu']"));
		
		WebElement multiSelect= driver.findElement(By.xpath("//*[@id='cars']"));
		
		
		
		//Select selectMenu= new Select(oldMenu);
		Select multiMenu= new Select(multiSelect);
//		Thread.sleep(2000);
//		selectMenu.selectByIndex(1);
//		Thread.sleep(2000);
//		selectMenu.selectByValue("2");
//		Thread.sleep(2000);
//		selectMenu.selectByVisibleText("Yellow");
//		Thread.sleep(2000);
		
		
		
		
		if(multiMenu.isMultiple()) {
			multiMenu.selectByIndex(3);
			Thread.sleep(1000);
			multiMenu.selectByValue("saab");
			Thread.sleep(1000);
			multiMenu.selectByVisibleText("Opel");
			Thread.sleep(1000);
			
		}
		
		List<WebElement> eleList= multiMenu.getOptions();
		for(int i=0;i<eleList.size();i++) {
		
			System.out.println(eleList.get(i).getText());
		}
		
		
		Thread.sleep(2000);
		
	  
		driver.close();

	}

}
