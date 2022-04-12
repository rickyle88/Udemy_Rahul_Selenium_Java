import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelfIntroduction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Invoking browser
		// Chrome - Chrome Driver class help to automate in Chrome Browser -> Methods (find elements, click...)
		//, Firefox - Firefox Driver
		// WebDriver close() get()
		
		// ChromeDriver class implements WebDriver methods + ChromeDriver methods
//		ChromeDriver driver = new ChromeDriver();
		// Selenium invoke chromedriver.exe -> Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		// Firefox
		System.setProperty("webdriver.gecko.driver", "./resources/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		//MS Edge
		System.setProperty("webdriver.edge.driver", "./resources/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		// Open website
		driver.get("https://rahulshettyacademy.com");
		
		// Get title and log
		System.out.println(driver.getTitle());
		
		// Get url and log
		System.out.println(driver.getCurrentUrl());
		
		// Close current window
//		driver.close();
		
		driver.quit();
	}

}
