package br.com.b2w.marketplace.RegMktPlaceMaven.cucumberTest;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

public class NavegacaoMeusProdutosTest {
	public static WebDriver driver;
	private WebElement aboutMe;
	
	@Given("^Usuário está na página Meus Produtos$") 
	public void usuarioMeusProdutos() throws Throwable {	
		System.setProperty("webdriver.gecko.driver", "/Users/default/Documents/workspace/RegMktPlaceMaven/src/test/java/Resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://hml.bonmarketplace.back.b2w/#/login");
        System.out.println("Na Página");
	}

	@When("^Usuário faz login na página Meus Produtos$")
	public void pgMeusProdutos() throws Throwable {
		driver.findElement(By.xpath("//*[@id='access']/a")).click();
		System.out.println("No login");
	}

	@When("^usuário digita usuário e senha Meus Produtos$")
	public void pgMeusProdutosusuario() throws Throwable {
		driver.findElement(By.id("loginname")).sendKeys("sub_ti_herbert"); 	 
	    driver.findElement(By.id("loginpwd")).sendKeys("dwr9980");
	    driver.findElement(By.xpath("//*[@id='access']/form/fieldset[1]/div[3]/button")).click();
	    System.out.println("Acessei");
	}

	@Then("^exibe mensagem de sucesso do login Meus Produtos$")
	public void sucessouserprod() throws Throwable {
	    new Select(driver.findElement(By.xpath("//div[@id='customers']/select"))).selectByVisibleText("MONTELLA123");
	    driver.findElement(By.id("menu-cadastro")).click();
	    System.out.println("Login Successfully Produtos");
	}

	@Then("^usuário navega até o menu Meus Produtos$")
	public void navegaprod() throws Throwable {
		driver.get("http://hml.bonmarketplace.back.b2w/v2/#/itens/meus");
		System.out.println("Estou nos meus produtos");
	}
	
	@Then("^usuário valida itens da tela e seus acessos Meus Produtos$")
	public void validaitens() throws Throwable {
		
		//texto 1
		WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/a[1]"));
		String strng1 = element1.getText();
		Assert.assertEquals("Vejas as dicas na FAQ", strng1);
		System.out.println(strng1);
		
		//texto 2		
		WebElement element2 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/a[2]")); 		
		String strng2 = element2.getText();
		Assert.assertEquals("Estrutura e departamentos da B2W", strng2);	
		System.out.println(strng2);
		
		//texto 3
		WebElement element3 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[4]/div[1]/div[2]/div/div[1]/div/label"));
		String strng3 = element3.getText();
		Assert.assertEquals("Cadastrados", strng3);		
		System.out.println(strng3);
		
		//texto 4
		WebElement element4 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[4]/div[1]/div[2]/div/div[2]/div/label"));
		String strng4 = element4.getText();
		Assert.assertEquals("Inativos", strng4);		
		System.out.println(strng4);
		
		//texto 5
		WebElement element5 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[4]/div[2]/div[3]/div/div[1]/label"));
		String strng5 = element5.getText();
		Assert.assertEquals("Reprovado Produção", strng5);
		System.out.println(strng5);
		
		//texto 6
		WebElement element6 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[4]/div[2]/div[3]/div/div[2]/label"));
		String strng6 = element6.getText();
		Assert.assertEquals("Confirm. de Preço", strng6);
		System.out.println(strng6);
		
		//texto 7
		WebElement element7 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[4]/div[2]/div[4]/div/label"));
		String strng7 = element7.getText();
		Assert.assertEquals("Pendência Interna", strng7);
		System.out.println(strng7);
		
		//texto 8
		WebElement element8 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[4]/div[2]/div[5]/div/label"));
		String strng8 = element8.getText();
		Assert.assertEquals("Publicados", strng8);
		System.out.println(strng8);
		
		System.out.println("Asserts realizados com sucesso meus produtos");
		
	}

	@When("^usuário efetua logout Meus Produtos$")
	public void usuariorealizalogout() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.findElement(By.cssSelector(".usuario > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")).click();
        driver.findElement(By.linkText("Sair")).click();
        System.out.println("Logout com sucesso meus produtos");
	}


	@Then("^mensagem ao usuário informando o logout com sucesso Meus Produtos$") 
	public void mensagemsucessologout() throws Throwable {
        System.out.println("LogOut Successfully");
        driver.quit();
        System.out.println("Driver quit Successfully meus produtos");
	}

	public WebElement getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(WebElement aboutMe) {
		this.aboutMe = aboutMe;
	}
}
