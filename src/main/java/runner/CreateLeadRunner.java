package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/main/java/features/CreateLead.feature",
					glue="steps",monochrome=true,
					dryRun=true,snippets=SnippetType.CAMELCASE)
public class CreateLeadRunner extends AbstractTestNGCucumberTests {

}
