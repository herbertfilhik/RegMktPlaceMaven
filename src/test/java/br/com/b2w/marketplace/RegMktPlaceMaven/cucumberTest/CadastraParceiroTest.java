package br.com.b2w.marketplace.RegMktPlaceMaven.cucumberTest;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import Resources.GlobalResources;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class CadastraParceiroTest {
	
	  public static WebDriver driver;

	  @Given("^Que esteja na página Cadastra Parceiro$")
	  public void cadastraparceiro() throws Exception {
	     Resources.GlobalResources.driverbrowserfirefox();
		 driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("http://hml.bonmarketplace.back.b2w/#/cadastro-parceiro");
	     driver.findElement(By.id("partnerId")).clear();
	     System.out.println("Estou no cadastro");
	  }  
	   
	  @Then("^Cadastro o novo parceiro$")
	  public void inputdedados(DataTable userData) throws Exception {
		  
		List<List<String>> data = userData.raw();
		for (int i=0; i<data.size();i++){
			System.out.println(data.get(i).toString());
		}
		  
	    //driver.findElement(By.id("partnerId")).sendKeys("40.276.534/0001-61");
	    driver.findElement(By.id("partnerId")).sendKeys(data.get(0).get(1).toString());
	    //driver.findElement(By.id("company")).clear();
	    //driver.findElement(By.id("company")).sendKeys("40276534000161");
	    driver.findElement(By.id("company")).sendKeys(data.get(1).get(1).toString());
	    //driver.findElement(By.id("municipalRegister")).clear();
	    //driver.findElement(By.id("municipalRegister")).sendKeys("40276534000161");
	    driver.findElement(By.id("municipalRegister")).sendKeys(data.get(2).get(1).toString());
	    //driver.findElement(By.id("trade")).clear();
	    System.out.println("Preenchendo dados");
	    //driver.findElement(By.id("trade")).sendKeys("40276534000161");
	    driver.findElement(By.id("trade")).sendKeys(data.get(3).get(1).toString());
	    //driver.findElement(By.id("stateRegister")).clear();
	    driver.findElement(By.id("stateRegister")).sendKeys("40276534000161");
	    driver.findElement(By.id("stateRegister")).sendKeys(data.get(4).get(1).toString());
	    //driver.findElement(By.id("site")).clear();
	    driver.findElement(By.id("site")).sendKeys("www.40276534000161.com.br");
	    driver.findElement(By.id("site")).sendKeys(data.get(5).get(1).toString());
	    //new Select(driver.findElement(By.id("income"))).selectByVisibleText("Acima de R$ 3.610.000,00");
	    new Select(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/form/fieldset[1]/article/div/div/div/div[8]/span[1]/select"))).selectByVisibleText("De R$ 1.200.000,00 até R$ 3.600.000,00");
	    System.out.println("Preenchendo dados");
	    driver.findElement(By.cssSelector("#income > option[value=\"4\"]")).click();
	    //driver.findElement(By.id("nome")).clear();
	    driver.findElement(By.id("nome")).sendKeys("40276534000161");
	    //driver.findElement(By.id("document")).clear();
	    driver.findElement(By.id("document")).sendKeys("402.765.340-00");
	    //driver.findElement(By.id("phone")).click();
	    //driver.findElement(By.id("phone")).clear();
	    driver.findElement(By.id("phone")).sendKeys("(40) 2765-34000");
	    driver.findElement(By.id("mail")).click();
	    //driver.findElement(By.id("mail")).clear();
	    System.out.println("Preenchendo dados");
	    driver.findElement(By.id("mail")).sendKeys("herbert.lima@b2wdigital.com");
	    new Select(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/form/fieldset[5]/article/div/div/div/div[1]/span[1]/select"))).selectByVisibleText("VTEX");
	    driver.findElement(By.cssSelector("#plataform > option[value=\"9\"]")).click();
	    driver.findElement(By.id("integrator")).click();
	    new Select(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/form/fieldset[5]/article/div/div/div/div[2]/span[1]/select"))).selectByVisibleText("VTEX");
	    driver.findElement(By.cssSelector("#integrator > option[value=\"11\"]")).click();
	    driver.findElement(By.id("cep")).clear();
	    System.out.println("Preenchendo dados");
	    driver.findElement(By.id("cep")).sendKeys("40276-534");
	    //driver.findElement(By.id("endereco")).click();
	    //driver.findElement(By.id("endereco")).clear();
	    driver.findElement(By.id("endereco")).sendKeys("40276534000161");
	    //driver.findElement(By.id("bairro")).clear();
	    driver.findElement(By.id("bairro")).sendKeys("40276534000161");
	    //driver.findElement(By.id("numero")).clear();
	    driver.findElement(By.id("numero")).sendKeys("100");
	    //driver.findElement(By.id("comp")).clear();
	    driver.findElement(By.id("comp")).sendKeys("40276534000161");
	    new Select(driver.findElement(By.id("idEstado"))).selectByVisibleText("Sao Paulo");
	    new Select(driver.findElement(By.id("idMunicipio"))).selectByVisibleText("Carapicuiba");
	    driver.findElement(By.cssSelector("option[value=\"Carapicuiba\"]")).click();
	    new Select(driver.findElement(By.id("activity"))).selectByVisibleText("TELEFONIA");
	    System.out.println("Salvando o cadastro");
	    driver.findElement(By.cssSelector("option[value=\"38\"]")).click();
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	    System.out.println("Finalizei o cadastro");
	  }
}
