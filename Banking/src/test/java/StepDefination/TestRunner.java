package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/java/Featurefile",
		glue= {"StepDefination"},
		tags="@test2",
		dryRun=false,
		monochrome=false,
		plugin= {
				"pretty","html:target/HtmlReport/index.html",
				"json:target/CucumberReports/cucumber.json"
				
		}
		
	
		
		
		)






public class TestRunner {

}
