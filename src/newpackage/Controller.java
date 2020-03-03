package newpackage;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver; 

//import javax.rmi.CORBA.Util;
//import okhttp3.internal.Util;

public class Controller {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Daymel\\eclipse-workspace\\SeleniumCourse\\lib\\chromedriver.exe");
	
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://localhost:3000/");
		 driver.manage().window().maximize();
	
	}
	
	

 

}
