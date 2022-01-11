package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/googleSearch.feature",glue= {"StepDefinitions"} 
, monochrome=true, plugin={"pretty","junit:target/xmlReports/reports.xml", "json:target/jsonReports/report.json", "html:target/htmlReports/reports.html"})

public class GoogleSearchFunctionalityTestRunner {

}
