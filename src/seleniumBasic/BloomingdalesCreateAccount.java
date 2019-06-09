package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BloomingdalesCreateAccount {

	 @Test
		public void setup() throws InterruptedException {
	

	

	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Webdriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	  driver.get("https://www.bloomingdales.com/account/createaccount?cm_sp=my_account-_"
	  		+ "create_account");
	  driver.manage().window().maximize();
	  
	 System.out.println(driver.findElement(By.xpath("//*[@id=\'create-account\']/h1")).getText());//print txt on consule
	  
	driver.findElement(By.id("ca-profile-firstname")).click();
	driver.findElement(By.id("ca-profile-firstname")).clear();
	driver.findElement(By.id("ca-profile-firstname")).sendKeys("SHAJU");
	
	driver.findElement(By.id("ca-profile-lastname")).click();
	driver.findElement(By.id("ca-profile-lastname")).clear();
	driver.findElement(By.id("ca-profile-lastname")).sendKeys("RAHMAN");
	
	driver.findElement(By.name("email")).click();
	driver.findElement(By.name("email")).clear();
	driver.findElement(By.name("email")).sendKeys("test123@gmail.com");
	
	driver.findElement(By.xpath("//*[@id=\'ca-profile-password\']")).click();
	driver.findElement(By.xpath("//*[@id='ca-profile-password']")).clear();
	driver.findElement(By.xpath("//*[@id='ca-profile-password']")).sendKeys("1234abc!");
	

	driver.findElement(By.xpath("//*[@id=\'ca-show-pass-btn\']")).click();
	//driver.findElement(By.xpath("//*[@id=ca-show-pass-btn']")).click();
	

	Select month= new Select(driver.findElement(By.id("ca-profile-birth-month")));
	month.selectByValue("12");
	
	Select day = new Select(driver.findElement(By.id("ca-profile-birth-day")));
	day.selectByIndex(10);
	
	Select year = new Select(driver.findElement(By.id("ca-profile-birth-year")));
	year.selectByVisibleText("1976");
	
	driver.findElement(By.xpath("//*[@id='ca-profile-send-email']")).click();
	driver.findElement(By.id("ca-profile-text-msg")).isSelected();
	System.out.println(driver.findElements(By.xpath("//*[@id='ca-profile-send-email']")).size());
	
	Thread.sleep(5000);
	
	driver.findElement(By.id("ca-profile-submit")).click();
	
	
	
	

	
	
	
	  
	
	//driver.close();
	}	
}
