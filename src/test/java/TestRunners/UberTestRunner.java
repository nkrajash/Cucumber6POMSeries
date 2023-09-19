package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = 
	{"E:\\Data\\Selenium-workspace\\Cucumber6POMSeries\\src\\test\\java\\AppFeatures\\Uber.feature"},
		glue = {"stepDefinitions", "MyHooks"},
		tags = "@All",
		plugin = {"pretty",
					"json:target/MyReports/report.json",
					"junit:target/MyReports/report.xml"
					},
		monochrome = true,
		dryRun = false
		//strict = true
		
		)

public class UberTestRunner {

}





