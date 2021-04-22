package junitTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class morgageTest {

	@Test
	public void MorgageTest() {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.mortgagecalculator.org");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("homeval")).sendKeys("400000");
		
		driver.findElement(By.id("downpayment")).sendKeys("30000");
		
		driver.findElement(By.id("loanamt")).clear();
	
		driver.findElement(By.id("loanamt")).sendKeys("450000");
		
		driver.findElement(By.id("intrstsrate")).sendKeys("3.2");
		
		driver.findElement(By.id("loanterm")).sendKeys("32");
		
		driver.findElement(By.name("param[start_month]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[8]/select/option[8]")).click();
		
		driver.findElement(By.id("start_year")).sendKeys("2022");
		
		driver.findElement(By.id("pptytax")).sendKeys("2500");
		
		driver.findElement(By.id("pmi")).sendKeys("0.6");
		
		driver.findElement(By.id("hoi")).sendKeys("1500");
		
		driver.findElement(By.id("hoa")).sendKeys("300");
		
		driver.findElement(By.name("param[milserve]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[13]/select/option[3]")).click();
		
		driver.findElement(By.name("param[refiorbuy]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[16]/select/option[2]")).click();
		
		driver.findElement(By.name("cal")).click();
		
		
		
	}
}
