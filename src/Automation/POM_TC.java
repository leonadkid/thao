package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import PageObjects.*;

public class POM_TC {

	public static void main(String[] args) {
		
		String url = "https://www.eply.com/login/index.aspx";
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\trongtin\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);		
		
		PageObjects.Login_Page.txt_username(driver).sendKeys("eply");;
		PageObjects.Login_Page.txt_password(driver).sendKeys("demo1234");
		PageObjects.Login_Page.txt_login(driver).click(); 	
	
	}

}
