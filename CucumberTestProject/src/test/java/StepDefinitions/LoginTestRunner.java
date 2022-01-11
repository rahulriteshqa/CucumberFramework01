package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/login.feature",glue= {"StepDefinitions"} 
, monochrome=true, plugin={"pretty","junit:target/xmlReports/reports.xml", "json:target/jsonReports/report.json", "html:target/htmlReports/reports.html"}, tags="@SmokeTest")


//only the tests matching the tags will run scenario level or feature level
//plugin={"pretty","junit:target/junitReports/report.json"}
//plugin={"pretty","junit:target/JunitReports/report.xml"}
public class LoginTestRunner {

}
