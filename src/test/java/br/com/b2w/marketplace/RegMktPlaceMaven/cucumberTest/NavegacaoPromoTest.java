package br.com.b2w.marketplace.RegMktPlaceMaven.cucumberTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;
import Resources.GlobalResources;
import cucumber.api.java.en.*;

public class NavegacaoPromoTest {

    public static WebDriver driver;
    @Given("^usuario está na pagina de promocao$")
	public void usernapagpromocao() throws Throwable {
		Resources.GlobalResources.driverbrowserfirefox();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Acessei o Portal");
	    driver.get("http://hml.bonmarketplace.back.b2w/#/login");
	    driver.findElement(By.linkText("Acesso ao portal")).click();
		driver.findElement(By.id("loginname")).sendKeys(GlobalResources.LOGIN); 	 
	    driver.findElement(By.id("loginpwd")).sendKeys(GlobalResources.PASSW);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    System.out.println("Loguei no Portal");
	    new Select(driver.findElement(By.xpath("//div[@id='customers']/select"))).selectByVisibleText("MONTELLA123");
	    System.out.println("Acessando a tela de promoções");
	    driver.findElement(By.id("menu-vendas")).click();
	    driver.findElement(By.linkText("Promoções")).click();
	}
    
    @And("^navega pela tela de promocao$")
    public void navtelapromo() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	System.out.println("Navegando pela tela de promoção")
    	;
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.id("status.id")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".btn-default")).click();
        driver.findElement(By.cssSelector(".dropdown-menu > li:nth-child(2) > a:nth-child(1)")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".btn-default")).click();
        driver.findElement(By.cssSelector(".dropdown-menu > li:nth-child(3) > a:nth-child(1)")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".btn-default")).click();
        driver.findElement(By.cssSelector(".dropdown-menu > li:nth-child(4) > a:nth-child(1)")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".btn-default")).click();
        driver.findElement(By.cssSelector("#filtersContainer > div.row.mt-10 > div.col-md-2.filter-by-status > div > div > div > button > span:nth-child(1)")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".btn-default")).click();
        driver.findElement(By.cssSelector(".dropdown-menu > li:nth-child(5) > a:nth-child(1)")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".btn-default")).click();
        driver.findElement(By.cssSelector(".dropdown-menu > li:nth-child(6) > a:nth-child(1)")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".btn-default")).click();
        driver.findElement(By.cssSelector(".dropdown-menu > li:nth-child(7) > a:nth-child(1)")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".btn-default")).click();
        driver.findElement(By.cssSelector(".dropdown-menu > li:nth-child(8) > a:nth-child(1)")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("Navegando pela tela de promoção");
	    driver.findElement(By.xpath("//div[@id='filtersContainer']/div[2]/div/div/div/ul/li/button")).click();
	    driver.findElement(By.xpath("//*[@id='filtersContainer']/div[2]/div[2]/div/div/div/button")).click();
	    driver.findElement(By.id("status.id")).click();
	    driver.findElement(By.xpath("//div[@id='filtersContainer']/div[2]/div/div/div/ul/li[2]/button")).click();
	    driver.findElement(By.xpath("//div[@id='filtersContainer']/div[2]/div/div/div/ul/li[3]/button")).click();
	    driver.findElement(By.xpath("//div[@id='filtersContainer']/div[2]/div/div/div/ul/li[4]/button")).click();
	    driver.findElement(By.xpath("//div[@id='filtersContainer']/div[2]/div/div/div/ul/li/button")).click();
	    System.out.println("Navegando pela tela de promoção");
	    driver.findElement(By.cssSelector("span.icon-brands-promotion.icon-suba")).click();
	    driver.findElement(By.cssSelector("span.icon-brands-promotion.icon-shop")).click();
	    driver.findElement(By.cssSelector("span.icon-brands-promotion.icon-suba")).click();
	    driver.findElement(By.cssSelector("span.icon-brands-promotion.icon-acom")).click();
	    driver.findElement(By.cssSelector("span.icon-brands-promotion.icon-shop")).click();
	    driver.findElement(By.cssSelector("span.icon-brands-promotion.icon-suba")).click();
	    driver.findElement(By.cssSelector("span.icon-brands-promotion.icon-acom")).click();
	    driver.findElement(By.cssSelector("span.icon-brands-promotion.icon-suba")).click();	    
    }
    
    @Then("^deve acessar os elementos$")
    public void acessaelempromo() throws Throwable {
    	driver.findElement(By.linkText("Nova Promoção")).click();
	    driver.findElement(By.linkText("Promoção")).click();
	    System.out.println("Naveguei pela tela de promoção");
    }
    
    @Then("^realizar o logout$")
    public void promologout() throws Throwable {
    	System.out.println("Realizando o logout");
	    driver.findElement(By.cssSelector("b.caret")).click();
	    driver.findElement(By.linkText("Sair")).click();
	    driver.quit();
    	System.out.println("Finalizei o teste");
    }   
}
