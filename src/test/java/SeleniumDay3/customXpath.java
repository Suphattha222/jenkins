package SeleniumDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class customXpath {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.kayak.com/horizon/sem/hotels/general?lang=en&skipapp=true&destination=c14189&kw=-1&gclid=CjwKCAjw07qDBhBxEiwA6pPbHvWUeTo-l9NPE7tVwI9BhWppd_OybiiFGrjKGX6WDU39RqrnwMdtUBoC-uAQAvD_BwE&g_kw=kayak&aid=103175289976");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[contains(@aria-label,'Search hotels')])[1]\n")).click();
		
		driver.close();
		
		
	}
	
}
