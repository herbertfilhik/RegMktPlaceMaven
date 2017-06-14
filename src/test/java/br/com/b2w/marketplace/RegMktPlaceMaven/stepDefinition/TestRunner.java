package br.com.b2w.marketplace.RegMktPlaceMaven.stepDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java",
				 glue = {""}, monochrome = true, dryRun = false)

public class TestRunner {

}
