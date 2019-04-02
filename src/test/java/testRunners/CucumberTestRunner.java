package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="classpath:features",
		glue="stepDefinitions",
		tags="@regression",
		plugin = {"pretty", "html:target/CucumberReports/cucumber-reports", "json:target/CucumberReports/cucumber.json", "junit:target/CucumberReports/cucumber.xml"}
	)

public class CucumberTestRunner {

}
