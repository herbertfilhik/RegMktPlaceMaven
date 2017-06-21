package br.com.b2w.marketplace.RegMktPlaceMaven.cucumberTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;
import Resources.GlobalResources;
import cucumber.api.java.en.*;

public class PromoCarFinanceTest {

	public static WebDriver driver;
    @Given("^usuario está na pagina de promocao Cartão Finance$")
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
    
    @And("^navega e preenche dados na tela de promocao Cartão Finance$")
	public void usernavpromofrtgratis() throws Throwable {
    	System.out.println("Cadastrando a Promoção de Cartão Finance");
	    driver.findElement(By.id("promotionName")).clear();
	    driver.findElement(By.id("promotionName")).sendKeys("21062017112701_Car_Finance");
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
    	System.out.println("Selecionei Cartão Finance");
   	    //new Select(driver.findElement(By.id("promotionType5"))).selectByVisibleText("Cartão Finance");
    	driver.findElement(By.xpath("/html/body/div[1]/main/div/div[5]/div/form/div[2]/div/div[2]/div/select/option[4]")).click();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("option[value=\"cartao finance\"]")).click();
        driver.findElement(By.id("paymentDescountPercentage")).clear();
        driver.findElement(By.id("paymentDescountPercentage")).sendKeys("12");    	
        driver.findElement(By.id("promotionType2")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);        
        driver.findElement(By.xpath("//span[2]/div/label")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	System.out.println("Configurando Cartão Finance");
        new Select(driver.findElement(By.id("department"))).selectByVisibleText("CDS & DVDS MUSICAIS");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("option[value=\"17\"]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        new Select(driver.findElement(By.id("department"))).selectByVisibleText("CDS & DVDS MUSICAIS");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("option[value=\"17\"]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".btn-sm")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div[5]/div/form/div[5]/div/button[4]")).click();        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Salvei a Promoção de Cartão Finance");
    }
    
    @And("^realizar o logout Cartão Finance$")
	public void userpromofrtgratislogout() throws Throwable {
    	System.out.println("Realizando o logout");
	    driver.findElement(By.cssSelector("b.caret")).click();
	    driver.findElement(By.linkText("Sair")).click();
	    driver.quit();
    	System.out.println("Finalizei o teste");
    }    
}
