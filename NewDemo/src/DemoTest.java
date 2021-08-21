import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/rahul-shar/AppData/Local/Programs/Python/Python36/Scripts/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("www.google.com");
		
		
		
	}

}
