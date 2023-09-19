package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"E:\\Data\\Selenium-workspace\\Cucumber6POMSeries\\src\\test\\java\\AppFeatures\\Search.feature"},
		glue = {"stepDefinitions", "MyHooks"},
		tags = "@Smoke or @Regression",
		plugin = {"pretty"},
		monochrome = true
)

public class AmazonTestRunner {

}
