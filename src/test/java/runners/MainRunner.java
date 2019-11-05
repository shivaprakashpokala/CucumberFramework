package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/resources/features/"},
		glue = {"stepDefinitions"},
		plugin= {"pretty",
				"html:target/SystemTestReports/html"},
				tags = {"@FullTestSuite"},
				dryRun = false,
				monochrome = true
		)
public class MainRunner {

}
