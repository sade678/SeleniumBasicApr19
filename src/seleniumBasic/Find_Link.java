package seleniumBasic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Find_Link {
	
	public class Class1Basics {
	     @Test
			public void setup() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Webdriver\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadeq\\OneDrive\\Desktop\\JAVA\\SeleniumBasicApr19\\Webdriver.exe);
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https:\\www.facebook.com");
			driver.manage().window().maximize();
			
			 List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		        
		        System.out.println(driver.findElement(By.xpath("//*[@id='js_0']/ul/li[1]/a")).getText());
		        System.out.println(allLinks.size());
		        List<String> txtLinks= new ArrayList<>();
		        for(int i=0;i<allLinks.size();i++) {
		            txtLinks.add(allLinks.get(i).getText());
		            System.out.println(txtLinks.get(i));
		        driver.close();
		        
			
			
			//driver.get("https:\\www.ballooningnesteggs.com");
			
					
			//List<WebElement> allLinks= driver.findElement(arg0)
			
		}
	     }
	}
}

	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
