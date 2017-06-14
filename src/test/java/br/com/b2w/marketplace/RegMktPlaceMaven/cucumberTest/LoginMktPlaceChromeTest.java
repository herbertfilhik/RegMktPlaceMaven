package br.com.b2w.marketplace.RegMktPlaceMaven.cucumberTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.*;

public class LoginMktPlaceChromeTest{
	
	public static WebDriver driver;
	@Given("^User is on Home Page Chrome$")
	public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/default/Documents/workspace/RegMktPlaceMaven/src/test/java/Resources/chromedriver");
        driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://hml.bonmarketplace.back.b2w/#/login");
       
	}

	@When("^User Navigate to LogIn Page Chrome$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.xpath("//*[@id='access']/a")).click();
		}

	@When("^User enters UserName and Password Chrome$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.id("loginname")).sendKeys("sub_ti_herbert"); 	 
	    driver.findElement(By.id("loginpwd")).sendKeys("dwr9980");
	    driver.findElement(By.xpath("//*[@id='access']/form/fieldset[1]/div[3]/button")).click();
		}

	@Then("^Message displayed Login Successfully Chrome$")
	public void message_displayed_Login_Successfully() throws Throwable {
		equals(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
	    new Select(driver.findElement(By.xpath("//div[@id='customers']/select"))).selectByVisibleText("MONTELLA123");
	    driver.findElement(By.id("menu-cadastro")).click();
	    System.out.println("Login Successfully Chrome");
	}

	@When("^User LogOut from the Application Chrome$")
	public void user_LogOut_from_the_Application() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.findElement(By.xpath("//*[@id='business-units']/a/strong")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='sair']/a")).click();
    }

	@Then("^Message displayed Logout Successfully Chrome$")
	public void message_displayed_Logout_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
        driver.quit();
        System.out.println("Driver quit Successfully Chrome");
	}
}