package SeleniumDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openURL_Practise {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://www.youtobe.com");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		
		String pageSource = driver.getPageSource();
		
		System.out.println(url);
		System.out.println(pageSource);
		
		//driver.close();
		
		driver.quit();

	}

}
