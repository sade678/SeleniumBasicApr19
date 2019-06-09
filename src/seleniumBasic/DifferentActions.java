package seleniumBasic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DifferentActions {
	WebDriver driver;
	
	public void initiateBrowser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Webdriver\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\ashif\\eclipse-workspace\\SelniumBasicClassBronx19\\Drivers\\chromrdriver.exe");
        
        
        WebDriver driver = new ChromeDriver();
    driver.get("https:\\www.facebook.com");
    driver.manage().window().maximize();
    }
    
    @Test
    public void clickLink() {
        initiateBrowser();
    /* */
//    driver.findElement(By.linkText("Log In")).click();
    List<WebElement> allLinks= driver.findElements(By.tagName("a"));
    List<String> txtLinks= new ArrayList<>();
    
    for(int i=0;i<allLinks.size();i++) {
       txtLinks.add(allLinks.get(i).getText());
       if (txtLinks.get(i) =="Log In") {
           allLinks.get(i).click();
       }
       System.out.println(txtLinks.get(i));
   }
   driver.quit();

}
    @Test
    public void clickRadioButton() {
    	driver.findElement(By.xpath("//*[@id='u_0_9']")).click();
        
        
    }
}
