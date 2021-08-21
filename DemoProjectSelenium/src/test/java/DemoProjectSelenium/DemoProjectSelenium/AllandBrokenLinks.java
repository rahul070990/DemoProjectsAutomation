package DemoProjectSelenium.DemoProjectSelenium;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllandBrokenLinks {
	public static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		
		driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul-shar\\chromedriver_win32 (17)\\chromedriver.exe");
		
		driver.get("https://demoqa.com/links");
		
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> iterator=allLinks.iterator();
		while(iterator.hasNext()) {
			
			String urlText=iterator.next().getAttribute("href");
			
			System.out.println(urlText);
			links(urlText);
		}
		driver.quit();
	}
		
		
		public static void links(String LinksText){
			try {
			URL url=new URL(LinksText);
			HttpURLConnection httpConnect=(HttpURLConnection)url.openConnection();
			httpConnect.setConnectTimeout(3000);
			httpConnect.connect();
			if(httpConnect.getResponseCode()>=400) {
				System.out.println(LinksText +"--" +httpConnect.getResponseMessage() + " is a broken link");
			}else {
				
				System.out.println(LinksText +"--" +httpConnect.getResponseMessage() + " Link is working fine");
			}
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}
		

	}


