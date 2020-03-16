package newpackage;

//import java.awt.List;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.ls.LSInput;
import org.openqa.selenium.support.ui.Select;

//https://www.federico-toledo.com/sitios-de-prueba-para-practicar/

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//From PC WORK
		//System.setProperty("webdriver.chrome.driver", "D:\\TOOLS\\DESARROLLO\\WORKSPACE\\SeleniumTest\\libs\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\TOOLS\\DESARROLLO\\WORKSPACE\\SeleniumTest\\libs\\geckodriver.exe");

		//FROM PC HOME
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daymel\\eclipse-workspace\\SeleniumTest\\libs\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\TOOLS\\DESARROLLO\\WORKSPACE\\SeleniumTest\\libs\\geckodriver.exe");

		
		WebDriver myDriver = new ChromeDriver();
		//WebDriver myDriver = new FirefoxDriver();
		
		/*
		myDriver.get("https://www.w3schools.com/");
		myDriver.manage().window().maximize();
		myDriver.findElement(By.xpath("//div[@class='w3-right']//a[1]//i[1]")).sendKeys("JavaScript");
		
		//Para dar un enter en el elemento
		WebElement commands = myDriver.findElement(By.xpath("//div[@class='w3-right']//a[1]//i[1]"));
		commands.sendKeys(Keys.ENTER);
		myDriver.findElement(By.xpath("//div[@class='gsc-results-close-btn gsc-results-close-btn-visible']")).click();
		*/
		
		//Frame testing
		/*myDriver.get("https://testpages.herokuapp.com/styled/frames/frames-test.html");
		myDriver.manage().window().maximize();
		myDriver.switchTo().frame("left");
		System.out.println(myDriver.findElement(By.id("left1")).getText());
		*/
		
		//Form test
		myDriver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		myDriver.findElement(By.name("username")).sendKeys("ibelise");
		myDriver.findElement(By.xpath("//input[@name='password']")).sendKeys("Testing123");;
		myDriver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("This is my fisrt test");
		myDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/table[1]/tbody[1]/tr[5]/td[1]/input[2]")).click(); 
		myDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/table[1]/tbody[1]/tr[5]/td[1]/input[3]")).click(); 
		myDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/table[1]/tbody[1]/tr[6]/td[1]/input[1]")).click();
		Select element = new Select(myDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/table[1]/tbody[1]/tr[7]/td[1]/select[1]")));
		element.selectByVisibleText("Selection Item 1");
		element.selectByVisibleText("Selection Item 3");
		element.deselectByVisibleText("Selection Item 4");
		
		Select dropdown = new Select(myDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/table[1]/tbody[1]/tr[8]/td[1]/select[1]")));
		dropdown.selectByIndex(5);
		
		myDriver.findElement(By.xpath("//tr[9]//td[1]//input[2]")).click();
	}

}
