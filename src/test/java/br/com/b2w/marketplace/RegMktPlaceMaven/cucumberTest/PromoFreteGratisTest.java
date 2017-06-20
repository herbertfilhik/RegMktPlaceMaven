package br.com.b2w.marketplace.RegMktPlaceMaven.cucumberTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;
import Resources.GlobalResources;
import cucumber.api.java.en.*;

public class PromoFreteGratisTest {

	public static WebDriver driver;
    @Given("^usuario está na pagina de promocao Frete Gratis$")
	public void userpromocaofrtgratis() throws Throwable {
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
	    driver.findElement(By.linkText("Nova Promoção")).click();
    }
    
    @And("^navega e preenche dados na tela de promocao Frete Gratis$")
	public void usernavpromofrtgratis() throws Throwable {
    	System.out.println("Cadastrando a Promoção de Frete Grátis");
	    driver.findElement(By.id("promotionName")).clear();
	    driver.findElement(By.id("promotionName")).sendKeys("200620171743");
	    driver.findElement(By.id("start")).click();
	    driver.findElement(By.xpath("//th[3]")).click();
	    driver.findElement(By.xpath("//th[3]")).click();
	    driver.findElement(By.xpath("//th[3]")).click();
	    driver.findElement(By.xpath("//th[3]")).click();
	    driver.findElement(By.id("start")).clear();
	    driver.findElement(By.id("start")).sendKeys("1 de Janeiro de 2018 00:00");
	    driver.findElement(By.id("end")).clear();
	    driver.findElement(By.id("end")).sendKeys("1 de Dezembro de 2018 00:00");
   	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector((".promotion-detail > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"))).click();
   	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("promotionType5"))).selectByVisibleText("Frete grátis");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("radio1")).click();
	    driver.findElement(By.id("productValueMinimum")).clear();
	    driver.findElement(By.id("productValueMinimum")).sendKeys("0,01");
	    driver.findElement(By.id("radio2")).click();
	    driver.findElement(By.id("productAmountMinimum")).clear();
	    driver.findElement(By.id("productAmountMinimum")).sendKeys("1");
	    driver.findElement(By.id("rc")).click();
	    driver.findElement(By.id("promotionType1")).click();
	    System.out.println("Salvei a Promoção de Frete Grátis");
    }
    
    @And("^realizar o logout Frete Gratis$")
	public void userpromofrtgratislogout() throws Throwable {
    	System.out.println("Realizando o logout");
	    driver.findElement(By.cssSelector("b.caret")).click();
	    driver.findElement(By.linkText("Sair")).click();
	    driver.quit();
    	System.out.println("Finalizei o teste");
    }    
}
