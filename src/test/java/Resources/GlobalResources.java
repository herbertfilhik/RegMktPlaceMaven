package Resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GlobalResources {
	
	public static WebDriver driver;
	public static String login = "sub_ti_herbert";
	public static String passw = "dwr9980";
	
	public static void driverbrowserfirefox(){
		System.setProperty("webdriver.gecko.driver", "./src/test/java/Resources/geckodriver");
	}
	
	public static void driverbrowserchrome(){
		System.setProperty("webdriver.chrome.driver", "./src/test/java/Resources/chromedriver");
	}
	
	public static void logarnoportalfirefox(){
		WebDriver driver;
		driverbrowserfirefox();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://hml.bonmarketplace.back.b2w/#/login");
        driver.findElement(By.xpath("//*[@id='access']/a")).click();
        driver.findElement(By.id("loginname")).sendKeys(login); 	 
	    driver.findElement(By.id("loginpwd")).sendKeys(passw);
	    driver.findElement(By.xpath("//*[@id='access']/form/fieldset[1]/div[3]/button")).click();      
	}
	
	public static void user(){
	    driver.findElement(By.id("loginname")).sendKeys(login);	
	}
	
	public static void passwd(){
	    driver.findElement(By.id("loginpwd")).sendKeys(passw);	
	}
}
