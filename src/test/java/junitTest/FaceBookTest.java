package junitTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookTest {

	@Test
	public void FaceBook() {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
		Boolean loginButton = driver.findElement(By.name("login")).isDisplayed();
		
		assertTrue("find facebook login button",loginButton);
		
	}
		
	@Test
	public void checkIftheLoginButtonIsExist() {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com"); //url of website we like to test
		
		assertTrue("Checking if the Login buton is exist",isElementPresent(driver,By.xpath("//button[@data-testid='royal_login_button' ]")));
		driver.close();
	}
		public boolean isElementPresent(WebDriver driver, By locatorKey) {
		    try {
		        driver.findElement(locatorKey);
		        return true;
		    } catch (org.openqa.selenium.NoSuchElementException e) {
		        return false;
		    }
		

	}
}
