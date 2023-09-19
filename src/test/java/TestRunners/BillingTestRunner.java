package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"E:\\Data\\Selenium-workspace\\Cucumber6POMSeries\\src\\test\\java\\AppFeatures\\Billing.feature"},
		glue = {"stepDefinitions", "MyHooks"},
		plugin = {"pretty"},
		monochrome = true
		)

public class BillingTestRunner {

}
