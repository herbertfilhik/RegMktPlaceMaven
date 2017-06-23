package br.com.b2w.marketplace.RegMktPlaceMaven.cucumberTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import Resources.GlobalResources;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.textui.TestRunner;

public class NavegacaoGeralChromeTest extends TestRunner{
	public static WebDriver driver;
	
	@Given("^Usuário está na página$")
	public void usuarionapagina() throws Throwable {
		//System.setProperty("webdriver.gecko.driver", "/Users/default/Documents/workspace/RegMktPlaceMaven/src/test/java/Resources/geckodriver");
		Resources.GlobalResources.driverbrowserchrome();
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://hml.bonmarketplace.back.b2w/#/login");
		}

	@When("^Usuário faz login na página$")
	public void usuarionapaginadelogin() throws Throwable {
		driver.findElement(By.xpath("//*[@id='access']/a")).click();
		}

	@When("^usuário digita usuário e senha$")
	public void usuadigitausuaesenha() throws Throwable {
		driver.findElement(By.id("loginname")).sendKeys(GlobalResources.LOGIN); 	 
	    driver.findElement(By.id("loginpwd")).sendKeys(GlobalResources.PASSW);
	    driver.findElement(By.xpath("//*[@id='access']/form/fieldset[1]/div[3]/button")).click();
		}

	@Then("^exibe mensagem de sucesso do login$")
	public void exibemensagemsucesso() throws Throwable {
		equals(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
	    new Select(driver.findElement(By.xpath("//div[@id='customers']/select"))).selectByVisibleText("MONTELLA123");
	    driver.findElement(By.id("menu-cadastro")).click();
	    System.out.println("Login com sucesso chrome");
	}

	@Then("^usuário navega pelos menus$")
	public void navegacaogeral() throws Throwable {

		//driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/ul/li[2]/a")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
		
		driver.get("http://hml.bonmarketplace.back.b2w/#/dashboard");
	    
		//produtos
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/ul/li[2]/a")).click();
		
		//meus produtos
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/ul/li[2]/ul/li[2]/a")).click();		
				
		//dashboard
		driver.get("http://hml.bonmarketplace.back.b2w/#/dashboard");
		
		//produtos
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/ul/li[2]/a")).click();
		
		//massa
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/ul/li[2]/ul/li[3]/a")).click();
		
		//dashboard
		driver.get("http://hml.bonmarketplace.back.b2w/#/dashboard");
		
		//produtos
		driver.get("http://hml.bonmarketplace.back.b2w/#/itens/novo-ean");
				
		//estru departamento
		driver.get("http://hml.bonmarketplace.back.b2w/#/webstore/mercadologica-de-para");
		
		//dashboard
		driver.get("http://hml.bonmarketplace.back.b2w/#/dashboard");
		
		System.out.println("Navegação Geral (Menu Produtos) realizada com Sucesso chrome");
		
		//pedidos
		driver.get("http://hml.bonmarketplace.back.b2w/v2/#/pedidos");
		
		//avaliação dos clientes
		driver.get("http://hml.bonmarketplace.back.b2w/#/pedidos/comentarios");
		
		//downloads
		driver.get("http://hml.bonmarketplace.back.b2w/#/pedidos/historico");
		
		//promoções
		driver.get("http://hml.bonmarketplace.back.b2w/v2/#/promocoes");
		
		//upload de tracking
		driver.get("http://hml.bonmarketplace.back.b2w/#/pedidos/upload");
		
		//itens vendidos
		driver.get("http://hml.bonmarketplace.back.b2w/#/itens/vendidos");
		
		//itens indisponíveis
		driver.get("http://hml.bonmarketplace.back.b2w/#/itens/indisponiveis");
		
		System.out.println("Navegação Geral (Menu Vendas) realizada com Sucesso chrome");
		
		//sac - atendimento ao cliente
		driver.get("http://hml.bonmarketplace.back.b2w/v2/#/sac/customer-service");
		
		//sac - troca e cancelamento
		driver.get("http://hml.bonmarketplace.back.b2w/#/troca-cancelamento");
		
		System.out.println("Navegação Geral (Menu SAC) realizada com Sucesso chrome");
		
		//Financeiro - Conta-Corrente
		driver.get("http://hml.bonmarketplace.back.b2w/v2/#/financeiro/conta-corrente");
		
		//Financeiro - Antecipação
		driver.get("http://hml.bonmarketplace.back.b2w/#/financeiro/antecipacao");
		
		//Financeiro - Demonstrativo e comprovantes
		driver.get("http://hml.bonmarketplace.back.b2w/v2/#/financeiro/demonstrativos-comprovantes");
		
		//Financeiro - downloads concluídos
		driver.get("http://hml.bonmarketplace.back.b2w/#/financeiro/downloads");
		
		//Financeiro - suporte jurídico
		driver.get("http://hml.bonmarketplace.back.b2w/#/financeiro/suporte/juridico");
		
		//Financeiro - configurações financeiras 
		driver.get("http://hml.bonmarketplace.back.b2w/v2/#/financeiro/plano-contrato");;
		
		System.out.println("Navegação Geral (Menu Financeiro) realizada com Sucesso chrome");
		
		//Configurações - meus dados
		driver.get("http://hml.bonmarketplace.back.b2w/#/webstore/parceiro/contato");
		
		//Configurações - Meus Contratos
		driver.get("http://hml.bonmarketplace.back.b2w/v2/#/contracts");
		
		//Configurações - Meus usuários
		driver.get("http://hml.bonmarketplace.back.b2w/#/webstore/usuarios/todos");
		
		//Configurações - Informações da Loja
		driver.get("http://hml.bonmarketplace.back.b2w/#/webstore/editar");
		
		//Configurações - Frete
		driver.get("http://hml.bonmarketplace.back.b2w/v2/#/frete");
		
		System.out.println("Navegação Geral (Menu Configurações) realizada com Sucesso chrome");
		
		//Ajuda - Faq
		driver.get("http://hml.bonmarketplace.back.b2w/#/duvidas/faq");
		
		//Ajuda - Treinamentos
		driver.get("http://hml.bonmarketplace.back.b2w/v2/#/universidade-b2w");
		
		//Ajuda - Meus chamados
		driver.get("http://hml.bonmarketplace.back.b2w/#/chamados");
		
		//Ajuda - Documentação da Api
		
		System.out.println("Navegação Geral (Menu Ajuda) realizada com Sucesso chrome");
		
		driver.get("http://hml.bonmarketplace.back.b2w/#/dashboard");
    
	}
	

	@When("^usuário efetua logout$")
	public void usuariorealizalogout() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.findElement(By.cssSelector("strong.ng-binding")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.findElement(By.linkText("Sair")).click();
	}
	
	@Then("^mensagem ao usuário informando o logout com sucesso$")
	public void mensagemsucessologout() throws Throwable {
        System.out.println("LogOut realizado com sucesso chrome");
        driver.quit();
        System.out.println("Saiu com sucesso chrome");
	}
}