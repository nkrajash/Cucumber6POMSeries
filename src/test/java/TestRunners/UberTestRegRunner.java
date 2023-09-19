package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"E:\\Data\\Selenium-workspace\\Cucumber6POMSeries\\src\\test\\java\\AppFeatures\\Registration.feature"},
		glue = {"stepDefinitions", "AppHooks"},
		plugin = {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml"
		},
		monochrome = false,
		dryRun = false //since Cucumber1.0 -tells which step is missing against the feature file.
)

public class UberTestRegRunner {

}
