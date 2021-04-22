package SeleniumDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.primefaces.org/showcase/ui/ajax/dropdown.xhtml?jfwid=28ae1");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//label[contains(@id,'country_label')]")).click();
		
		driver.findElement(By.xpath("//li[contains(@data-label,'USA')]")).click();
		
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//label[contains(@id,'city_label')]")).click();
		
		driver.findElement(By.xpath("//li[contains(@data-label,'San Francisco')]")).click();
		
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		
		Thread.sleep(4000);
		 
		Boolean message = driver.findElement(By.xpath("//div[contains(@id,'msgs_container')]")).isDisplayed();
	
		if(message == true) {
			System.out.println("Message is display");
		}else {
			System.out.println("Message is not display");
		}
		
		Thread.sleep(9000);
		
		Boolean message2 = driver.findElement(By.xpath("//div[contains(@id,'msgs_container')]")).isDisplayed();
		
		if(message2 == true) {
			System.out.println("Message is display");
		}else {
			System.out.println("Message is not display");
		}
		
	}

}
