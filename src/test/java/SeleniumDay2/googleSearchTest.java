package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearchTest {

	public static void main(String[] args) {
		

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("JAVA",Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
		
		String searchResult = driver.findElement(By.id("result-stats")).getText();
		
		System.out.println(searchResult);
		
		driver.close();

	}

}
