package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoTest {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Index.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("supattra_pong@hotmail.com");

		driver.findElement(By.id("abcd")).click();;
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Suphattha");;
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Siamseranee");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("4351 via dr. Fairfax Va 22030");
	
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("suphattha.pong@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("5716456149");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		
		driver.findElement(By.id("checkbox2")).click();
		
		driver.findElement(By.id("msdd")).click();
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul")).click();
		
		driver.findElement(By.xpath("/html/body")).click();
		
		driver.findElement(By.id("Skills")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[6]")).click();
		
		driver.findElement(By.xpath("/html/body")).click();
		
		driver.findElement(By.id("countries")).click();
		
		driver.findElement(By.xpath("//*[@id=\"countries\"]/option[6]")).click();
		
		driver.findElement(By.xpath("/html/body")).click();
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
		
		driver.findElement(By.xpath("/html/body")).click();
		
		driver.findElement(By.id("yearbox")).click();
		
		driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[6]")).click();
		
		driver.findElement(By.xpath("/html/body")).click();
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")).click();
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[5]")).click();
		
		driver.findElement(By.xpath("/html/body")).click();
		
		driver.findElement(By.id("daybox")).click();
		
		driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[6]")).click();
		
		driver.findElement(By.xpath("/html/body")).click();
		
		driver.findElement(By.id("firstpassword")).sendKeys("Zxcvbn12345");
		
		driver.findElement(By.id("secondpassword")).sendKeys("Zxcvbn12345");
		
		driver.findElement(By.id("submitbtn")).click();
		
	}

}
