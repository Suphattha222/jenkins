package SeleniumDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openAndVerify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		 // open browser
		driver.get("http://www.youtobe.com");
		
		//maximizes my brower
		driver.manage().window().maximize();
		
		//get title and store it into a String variable
		String actualTitle = driver.getTitle();
		
		//prints my title
		System.out.println("Actual Title is : "+actualTitle);
		
		String expectedTitle = "amazon";
		
		System.out.println("Expected Title is : " + expectedTitle);
		
		if (expectedTitle.endsWith(actualTitle)) {
			System.out.println("Pass");
		}else {
			System.out.println("FAILED");
			System.out.println("I expected to see " + expectedTitle);
			System.out.println("The Driver got " + actualTitle);
			System.out.println("-------------------");
		}
		
		driver.navigate().to("http://www.amazon.com");
		actualTitle = driver.getTitle();
		
		if (expectedTitle.endsWith(actualTitle)) {
			System.out.println("Pass");
		}else {
			System.out.println("FAILED");
			System.out.println("I expected to see " + expectedTitle);
			System.out.println("The Driver got " + actualTitle);
			System.out.println("-------------------");
		}
		// make it slow
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		actualTitle = driver.getTitle();
		System.out.println(actualTitle);
	}

}
