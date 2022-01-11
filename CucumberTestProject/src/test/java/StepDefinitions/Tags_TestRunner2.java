package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesWithTags/Tags.feature",
glue= {"StepDefinitions"},
tags="@smokeTest"
)


//only the tests matching the tags will run scenario level or feature level
//plugin={"pretty","junit:target/junitReports/report.json"}
//plugin={"pretty","junit:target/JunitReports/report.xml"}
public class Tags_TestRunner2 {

}
