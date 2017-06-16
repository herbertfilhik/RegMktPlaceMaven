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
		  
	    driver.findElement(By.id("partnerId")).sendKeys(data.get(0).get(1).toString());
	    driver.findElement(By.id("company")).sendKeys(data.get(1).get(1).toString());
	    driver.findElement(By.id("municipalRegister")).sendKeys(data.get(2).get(1).toString());
	    System.out.println("Preenchendo dados");
	    driver.findElement(By.id("trade")).sendKeys(data.get(3).get(1).toString());
	    driver.findElement(By.id("stateRegister")).sendKeys(data.get(4).get(1).toString());
	    driver.findElement(By.id("site")).sendKeys(data.get(5).get(1).toString());
	    new Select(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/form/fieldset[1]/article/div/div/div/div[8]/span[1]/select"))).selectByVisibleText(data.get(6).get(1).toString());
	    System.out.println("Preenchendo dados");
	    driver.findElement(By.cssSelector("#income > option[value=\"4\"]")).click();
	    driver.findElement(By.id("nome")).sendKeys(data.get(7).get(1).toString());
	    driver.findElement(By.id("document")).sendKeys(data.get(8).get(1).toString());
	    driver.findElement(By.id("phone")).sendKeys(data.get(9).get(1).toString());
	    driver.findElement(By.id("mail")).click();
	    System.out.println("Preenchendo dados");
	    driver.findElement(By.id("mail")).sendKeys(data.get(10).get(1).toString());
	    new Select(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/form/fieldset[5]/article/div/div/div/div[1]/span[1]/select"))).selectByVisibleText(data.get(11).get(1).toString());
	    //driver.findElement(By.cssSelector("#plataform > option[value=\"9\"]")).click();
	    driver.findElement(By.id("integrator")).click();
	    new Select(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/form/fieldset[5]/article/div/div/div/div[2]/span[1]/select"))).selectByVisibleText(data.get(12).get(1).toString());
	    //driver.findElement(By.cssSelector("#integrator > option[value=\"11\"]")).click();
	    driver.findElement(By.id("cep")).clear();
	    System.out.println("Preenchendo dados");
	    driver.findElement(By.id("cep")).sendKeys(data.get(13).get(1).toString());
	    driver.findElement(By.id("endereco")).sendKeys(data.get(14).get(1).toString());
	    driver.findElement(By.id("bairro")).sendKeys(data.get(15).get(1).toString());
	    driver.findElement(By.id("numero")).sendKeys(data.get(16).get(1).toString());
	    driver.findElement(By.id("comp")).sendKeys(data.get(17).get(1).toString());
	    new Select(driver.findElement(By.id("idEstado"))).selectByVisibleText(data.get(18).get(1).toString());
	    new Select(driver.findElement(By.id("idMunicipio"))).selectByVisibleText(data.get(19).get(1).toString());
	    driver.findElement(By.cssSelector("option[value=\"Carapicuiba\"]")).click();
	    new Select(driver.findElement(By.id("activity"))).selectByVisibleText(data.get(20).get(1).toString());
	    System.out.println("Salvando o cadastro");
	    driver.findElement(By.cssSelector("option[value=\"38\"]")).click();
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	    System.out.println("Finalizei o cadastro");
	  }
}
