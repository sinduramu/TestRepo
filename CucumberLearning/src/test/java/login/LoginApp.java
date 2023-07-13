package login;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/java/testrunner/login.feature",
		dryRun=!true,
		snippets= SnippetType.CAMELCASE,
		glue = "runnersteps",
		monochrome = true
		)
public class LoginApp extends AbstractTestNGCucumberTests{
	
	

}
