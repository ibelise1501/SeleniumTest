package Scripts;
 
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\TOOLS\\DESARROLLO\\WORKSPACE\\SeleniumTest\\libs\\chromedriver78.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\TOOLS\\DESARROLLO\\WORKSPACE\\SeleniumTest\\libs\\geckodriver.exe");

		
		WebDriver myDriver = new ChromeDriver();
		//WebDriver myDriver = new FirefoxDriver();
		
		myDriver.get("http://www.google.com");
		myDriver.manage().window().maximize();
		myDriver.findElement(By.name("q")).sendKeys("Hello world");
		
		//Para dar un enter en el elemento
		//WebElement commands = myDriver.findElement(By.name("q"));
		//commands.sendKeys(Keys.ENTER);

	}

}
