package SeleniumDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {

	public static void main(String[] args) {
		
//	1) Open the browser

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//	2) Enter the URL “http://practice.automationtesting.in/”
		
		driver.get("http://practice.automationtesting.in/");
		
//	3) Click on My Account Menu
		
		driver.findElement(By.xpath("//li[contains(@id,'menu-item-50')]")).click();
		
//	4) Enter registered username in username textbox
		
		
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("supattra_pong@hotmail.com");
//	5) Enter password in password textbox
		
		// asdfaweasdf1232-123!!
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("asdfaweasdf1232-123!!");
		
//	6) Click on login button
		
		driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
		
//	7) User must successfully login to the web page
		
		 if (driver.getCurrentUrl().equals("http://practice.automationtesting.in/my-account/"))
	            System.out.println("Successfully logIn");
	        else System.out.println("Fail");

	//	 driver.close();
		 
	}

}
