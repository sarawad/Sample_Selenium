package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features/Login.feature",
		glue="stepdefinitions",
		plugin= {"pretty","html:test-output","junit:junit_folder/junit_report.xml"},
		monochrome=true,
		tags= {"@CauseAndEffect,@StateTransition"},
		dryRun=false
		)
public class LoginRunners {

}
