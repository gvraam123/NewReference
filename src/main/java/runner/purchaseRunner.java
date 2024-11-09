package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
		features="./feature/Purchase.feature",
				glue="stepDefinition")

public class purchaseRunner extends AbstractTestNGCucumberTests {

}
