package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue= "stepDefinition",
		plugin= {"html: target/Destination"},
		//tags="@tag",
		dryRun= false)

public class ShopTestRunner {

}
