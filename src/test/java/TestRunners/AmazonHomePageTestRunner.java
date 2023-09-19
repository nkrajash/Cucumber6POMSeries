package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"E:\\Data\\Selenium-workspace\\Cucumber6POMSeries\\src\\test\\java\\AppFeatures\\AmazonHome.feature"},
		glue = {"stepDefinitions", "MyHooks"},
		tags = "@All",
		plugin = {"pretty"},
		monochrome = true
)

public class AmazonHomePageTestRunner {

}
