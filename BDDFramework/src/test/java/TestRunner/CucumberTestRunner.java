package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags = "",
		features = {"src/test/resources/Features"},
		glue = {"StepDefinitions"},
		plugin = {"pretty", "html:target/htmlreport1.html", "json:target/cucumber.json"}
		)

public class CucumberTestRunner extends AbstractTestNGCucumberTests{

}
