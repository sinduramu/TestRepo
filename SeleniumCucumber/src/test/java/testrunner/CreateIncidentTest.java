package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features/CreateIncident.feature", 
glue = "stepdefinition")
public class CreateIncidentTest extends AbstractTestNGCucumberTests{

}
