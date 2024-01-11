package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags = "@smoke and @regression or @perf and not @security",
		features = {"src/test/resources/FeatureWithTags"},
		glue = {"StepDefinitions"},
		plugin = {"pretty", "html:target/htmlreport2.html", "json:target/cucumber2.json"}
		)

public class CucumberTestRunnerForTags extends AbstractTestNGCucumberTests{

}
