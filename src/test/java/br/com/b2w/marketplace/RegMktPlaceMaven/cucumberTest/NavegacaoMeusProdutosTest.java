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
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Atualize seu catálogo, preço e estoque']"));
		String strng1 = element1.getText();
		Assert.assertEquals("Atualize seu catálogo, preço e estoque", strng1);
		System.out.println(strng1);
		
		//texto 2		
		WebDriverWait wait = new WebDriverWait(driver,20);
		setAboutMe(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Aumente suas vendas com frete grátis ou desconto']"))));
		
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Aumente suas vendas com frete grátis ou desconto']")); 		
		String strng2 = element2.getText();
		Assert.assertEquals("Aumente suas vendas com frete grátis ou desconto", strng2);	
		System.out.println(strng2);
		
		//texto 3
		WebElement element3 = driver.findElement(By.xpath("//span[text()='Veja seus novos pedidos e atualize os status']"));
		String strng3 = element3.getText();
		Assert.assertEquals("Veja seus novos pedidos e atualize os status", strng3);		
		System.out.println(strng3);
		
		//texto 4
		WebElement element4 = driver.findElement(By.xpath("//span[text()='Acompanhe e responda aos chamados dos clientes']"));
		String strng4 = element4.getText();
		Assert.assertEquals("Acompanhe e responda aos chamados dos clientes", strng4);		
		System.out.println(strng4);
		
		//texto 5
		WebElement element5 = driver.findElement(By.xpath("//span[text()='Veja seu saldo e valores das suas vendas']"));
		String strng5 = element5.getText();
		Assert.assertEquals("Veja seu saldo e valores das suas vendas", strng5);
		System.out.println(strng5);
		
		System.out.println("Asserts realizados com sucesso meus produtos");
		
	}

	@When("^usuário efetua logout Meus Produtos$")
	public void usuariorealizalogout() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.findElement(By.cssSelector("strong.ng-binding")).click();
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
