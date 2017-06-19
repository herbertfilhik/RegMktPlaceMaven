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
	    driver.findElement(By.id("loginpwd")).clear();
		driver.findElement(By.id("loginname")).sendKeys(GlobalResources.LOGIN); 	 
	    driver.findElement(By.id("loginname")).clear();
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
    	System.out.println("Navegando pela tela de promoção");
	    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	    driver.findElement(By.linkText("Ativas 126")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	    driver.findElement(By.linkText("Em Aprovação 1091")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	    driver.findElement(By.linkText("Finalizadas")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	    driver.findElement(By.linkText("Encerradas")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	    driver.findElement(By.linkText("Canceladas")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	    driver.findElement(By.linkText("Expiradas")).click();
	    System.out.println("Navegando pela tela de promoção");
	    driver.findElement(By.xpath("//div[@id='filtersContainer']/div[2]/div/div/div/ul/li/button")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
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
    	System.out.println("Finalizei o teste");
    }   
}
