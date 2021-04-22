package junitTest;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTest {

	
	@Test
	public void test() {
		
	WebDriver driver;
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	driver.get("https://amazon.com");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[contains(@id, 'twotabsearchtextbox')]")).sendKeys("clear ice make");
	
	driver.findElement(By.xpath("//input[contains(@id, 'nav-search-submit-button')]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/h2/a/span")).click();
	String productName = driver.findElement(By.id("productTitle")).getText();
	String price = driver.findElement(By.id("priceblock_ourprice")).getText();
	
	System.out.println(productName +" is cost " +price);

	}

}
