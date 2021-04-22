package SeleniumDay3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElement_Links {

	public static void main(String[] args) {
		
		//find how many link in this page
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://www.youtube.com");
		
		driver.manage().window().maximize();
		
		int xpathCount= driver.findElements(By.tagName("a")).size();
		System.out.println(xpathCount);
		
		List<WebElement> links = new ArrayList <WebElement>(); 
		
		links.addAll(driver.findElements(By.tagName("a")));
		
		for (WebElement link : links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
			System.out.println(" ");
		}
		
		driver.close();
		
		
		
		

	}

}
