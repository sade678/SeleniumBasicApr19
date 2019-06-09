package seleniumBasic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Class1Basics {
     @Test
		public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Webdriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadeq\\OneDrive\\Desktop\\JAVA\\SeleniumBasicApr19\\Webdriver.exe);
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https:\\www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sade678@yahoo.com");
		System.out.println(driver.findElement(By.xpath("//*[@id=\'content\']/div/div/div/div/div[2]/h2")).getText());
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("ishita2007");
		driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
		Thread.sleep(2000l);
		
		driver.findElement(By.cssSelector("#u_0_c")).sendKeys("Shaju");
		driver.findElement(By.cssSelector("#u_0_e")).sendKeys("Rah");
		driver.findElement(By.xpath("//*[@id='u_0_h']")).sendKeys("selenium1@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'u_0_k\']")).sendKeys("selenium1@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("java2019");
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("12");
		Select day= new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("10");
		Select year= new Select(driver.findElement(By.id("year")));
			year.selectByValue("1975");
			//driver.findElement(By.cssSelector("input[id='u"
//					+ "_0_a']")).click();
			//driver.findElement(By.xpath("//*[@id=\'u_0_u\']")).click();
			
			 /*driver.findElement(By.name("firstname")).click();
		        driver.findElement(By.name("firstname")).clear();
		        driver.findElement(By.name("firstname")).sendKeys("Ashif");*/
	
			
			
			driver.close();
		
		
		
		
		//driver.get("https:\\www.ballooningnesteggs.com");
		
				
		//List<WebElement> allLinks= driver.findElement(arg0)
		
	}
     }
	
	

