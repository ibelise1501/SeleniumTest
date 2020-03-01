package Scripts;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daymel\\eclipse-workspace\\Selenium\\libs\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Daymel\\eclipse-workspace\\Selenium\\libs\\geckodriver.exe");

		
		//	WebDriver myDriver = new ChromeDriver();
		
		WebDriver myDriver = new FirefoxDriver();
		myDriver.get("https://www.google.com");

	}

}
