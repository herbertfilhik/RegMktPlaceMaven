package br.com.b2w.marketplace.RegMktPlaceMaven.cucumberTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;
import Resources.GlobalResources;
import cucumber.api.java.en.*;

public class AdesaoPromoMeioPgtoAmerTest {

	public static WebDriver driver;
    @Given("^usuario está na pagina de promocao AdesaoPromoMeioPgtoAmerTest$")
	public void userpromocaomeiopgtoamer() throws Throwable {
		Resources.GlobalResources.driverbrowserfirefox();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Acessei o Mkt Portal Adesao");
	    driver.get("http://campaign-admin-v1.staging-b2w.atlas.b2w/new-discount-range");
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div/form/div[1]/div/input")).sendKeys("dimitri.lameri");
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div/form/div[2]/div/input")).sendKeys("Bwjessy12306");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/ul/li[4]/a/span")).click();
	    
    }
    
    @And("^navega e preenche dados na tela de promocao AdesaoPromoMeioPgtoAmerTest$")
	public void usernavpromomeiopgtoamer() throws Throwable {
    	System.out.println("Cadastrando a AdesaoPromoMeioPgtoTest");
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/button")).click();
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[1]/section/div/div/div[1]/div/div/input")).sendKeys("MeioPgtoAmericanas");
    	//Americanas
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[1]/section/div/div/div[2]/div/div/select/option[2]")).click();
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[1]/section/div/div/div[3]/div/div/input")).sendKeys("MeioPgtoAmericanas");
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[1]/section/div/div/div[4]/div/div/div/div/div/div[1]/div/select/option[2]")).click();
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[1]/section/div/div/div[4]/div/div/div/div/div/div[2]/div/input")).sendKeys("12,00");
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[1]/section/div/div/div[5]/div/div[1]/div/div/div[1]/input")).sendKeys(" 21/06/2017 15:00");
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[1]/section/div/div/div[5]/div/div[2]/div/div/div[1]/input")).sendKeys("221/06/2018 15:00");
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[1]/section/div/div/div[6]/div/div[1]/div/div/input")).click();
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[1]/section/div/div/div[6]/div/div[2]/div/div/input")).click();
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[1]/section/div/div/div[6]/div/div[3]/div/div/input")).sendKeys("1.111");
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[2]/section/div/div/div/div/div/input")).sendKeys("15");
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[4]/section/div/div/div[1]/div/div/div/div/input")).sendKeys("20000750");
    	WebElement webElement = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[4]/section/div/div/div[1]/div/div/div/div/input"));
    	//webElement.sendKeys(Keys.TAB);
    	webElement.sendKeys(Keys.ENTER);
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[5]/section/div/div/div[3]/div/div/input")).click();
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[5]/section/div/div/div[1]/div/div/div/div/select/option[6]")).click();
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[6]/section/div/div/div[1]/div/div/div/div/input")).sendKeys("1");
    	WebElement webElement2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div/div/div[6]/section/div/div/div[1]/div/div/div/div/input"));
    	//webElement.sendKeys(Keys.TAB);
    	webElement2.sendKeys(Keys.ENTER);
    	//driver.findElement(By.cssSelector("html body div div div.layout_wrapper_2SpXq div.layout_wrapper-page_3_ctF.layout_wrapper--openMenu_10_oj div.layout_page_1-9TL div.layout_page-content_2X1zi div form.form_form_SCTr2 div.grid_container_2dTZC div.grid-row_row_1kqjs.grid-row_start-xs_B5bDg div.grid-col_col_3CpM-.grid-col_col-xs-12_1g8x-.grid-col_col-md-10_3Ajy_.grid-col_col-lg-8_1cssY.grid-col_col-md-offset-1_19PxK.grid-col_col-lg-offset-2_3-j19 div div.grid-col_col_3CpM-.grid-col_col-xs-12_1g8x-.grid-col_col-sm-12_1nQWS.grid-col_col-md-12_1Pk7N.grid-col_col-lg-12_3NNFz section.panel_panel_3EVqV div.panel_panel-content_jDKFA div.grid-row_row_1kqjs.grid-row_start-xs_B5bDg div.grid-col_col_3CpM-.grid-col_col-xs-12_1g8x-.grid-col_col-sm-12_1nQWS.grid-col_col-md-6_2EAzk.grid-col_col-lg-6_1jfgN div.grid-row_row_1kqjs.grid-row_start-xs_B5bDg div.grid-col_col_3CpM-.grid-col_col-xs-12_1g8x-.grid-col_col-sm-12_1nQWS.grid-col_col-md-6_2EAzk.grid-col_col-lg-6_1jfgN div.form-group_form-group_2o3ri.form-group_has-error_1sus-.form-group_form-group--checkbox_3wlBy.form-group_form-group--withoutTopLabel_2sudU div.form-control_form-addon_32LYd input#aQbcukFomv.form-control_form-field--checkbox_1gblq")).click();
    	//driver.findElement(By.cssSelector("html body div div div.layout_wrapper_2SpXq div.layout_wrapper-page_3_ctF.layout_wrapper--openMenu_10_oj div.layout_page_1-9TL div.layout_page-content_2X1zi div form.form_form_SCTr2 div.grid_container_2dTZC div.grid-row_row_1kqjs.grid-row_start-xs_B5bDg div.grid-col_col_3CpM-.grid-col_col-xs-12_1g8x-.grid-col_col-md-10_3Ajy_.grid-col_col-lg-8_1cssY.grid-col_col-md-offset-1_19PxK.grid-col_col-lg-offset-2_3-j19 div div.grid-col_col_3CpM-.grid-col_col-xs-12_1g8x-.grid-col_col-sm-12_1nQWS.grid-col_col-md-12_1Pk7N.grid-col_col-lg-12_3NNFz section.panel_panel_3EVqV div.panel_panel-content_jDKFA div.grid-row_row_1kqjs.grid-row_start-xs_B5bDg div.grid-col_col_3CpM-.grid-col_col-xs-12_1g8x-.grid-col_col-sm-12_1nQWS.grid-col_col-md-6_2EAzk.grid-col_col-lg-6_1jfgN div.grid-row_row_1kqjs.grid-row_start-xs_B5bDg div.grid-col_col_3CpM-.grid-col_col-xs-12_1g8x-.grid-col_col-sm-12_1nQWS.grid-col_col-md-6_2EAzk.grid-col_col-lg-6_1jfgN div.form-group_form-group_2o3ri.form-group_has-error_1sus-.form-group_form-group--checkbox_3wlBy.form-group_form-group--withoutTopLabel_2sudU div.form-control_form-addon_32LYd input#PlbTbDdcqg.form-control_form-field--checkbox_1gblq")).click();    	
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	//driver.findElement(By.cssSelector("html body div div div.layout_wrapper_2SpXq div.layout_wrapper-page_3_ctF.layout_wrapper--openMenu_10_oj div.layout_page_1-9TL div.layout_page-header_1IlQp header.header_header_3WNse div.grid_container_2dTZC div.grid-row_row_1kqjs div.grid-col_col_3CpM-.grid-col_col-xs-12_1g8x- div.header_header-support_Sktp0 div.header_header-logout_rFe4h button.button_default_3CS61.button_medium_1Me-L")).click();
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    	
    
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div/div[3]/div/div/button")).click();
    	System.out.println("Cliquei em Salvar");
    	driver.findElement(By.cssSelector("html body div div div.layout_wrapper_2SpXq div.layout_wrapper-page_3_ctF.layout_wrapper--openMenu_10_oj div.layout_page_1-9TL div.layout_page-content_2X1zi div form.form_form_SCTr2 div.grid_container_2dTZC div.grid-row_row_1kqjs.grid-row_start-xs_B5bDg div.grid-col_col_3CpM-.grid-col_col-xs-12_1g8x-.grid-col_col-md-10_3Ajy_.grid-col_col-lg-8_1cssY.grid-col_col-md-offset-1_19PxK.grid-col_col-lg-offset-2_3-j19 div.form-actions_form-group-actions_2exH5 button.button_primary_2b89h.button_large_21Uuk")).click();  
    	System.out.println("Cliquei em Salvar");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	System.out.println("Cadastrei a AdesaoPromoFxDescTest");
    	driver.findElement(By.cssSelector(".form_form_SCTr2 > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(2)")).click();
    
    }
    
    @And("^realizar o logout AdesaoPromoMeioPgtoAmerTest$")
	public void userpromomeiopgtoamerlogout() throws Throwable {
    	System.out.println("Realizando o logout");
	    driver.quit();
    	System.out.println("Finalizei o teste");
    }    
}
