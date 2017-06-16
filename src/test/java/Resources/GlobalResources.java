package Resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GlobalResources {
	
	public static WebDriver driver;
	static String login = "sub_ti_herbert";
	static String passw = "dwr9980";
	
	public static void logarnoportal(){
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/default/Documents/workspace/RegMktPlaceMaven/src/test/java/Resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://hml.bonmarketplace.back.b2w/#/login");
        driver.findElement(By.xpath("//*[@id='access']/a")).click();
        driver.findElement(By.id("loginname")).sendKeys(login); 	 
	    driver.findElement(By.id("loginpwd")).sendKeys(passw);
	    driver.findElement(By.xpath("//*[@id='access']/form/fieldset[1]/div[3]/button")).click();      
	}
	
	
}
