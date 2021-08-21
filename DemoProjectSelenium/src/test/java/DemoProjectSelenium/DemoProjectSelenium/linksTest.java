package DemoProjectSelenium.DemoProjectSelenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul-shar\\chromedriver_win32 (17)\\chromedriver.exe");
		
		driver.get("https://demoqa.com/links");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++) {
			
			String urlLinks=links.get(i).getAttribute("href");
			System.out.println(urlLinks);
			String text=links.get(i).getText();
			//System.out.println(text);
			
			//verifyLinks(urlLinks);
			
		}
		driver.close();
		

	}
	
	public static void verifyLinks(String linnksURL) throws IOException {
		
		URL url= new URL(linnksURL);
		HttpURLConnection httpconnect=(HttpURLConnection)url.openConnection();
		
		httpconnect.connect();
		
		if(httpconnect.getResponseCode()>=400) {
			
			System.out.println(linnksURL + "is a broken link");
			
		}
		
		else {
			
			System.out.println(linnksURL + "is a working fine");
			
		}
		
		
		
	}
	
	

}
