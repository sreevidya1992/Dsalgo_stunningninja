package testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty","json:cucumber.json","html:target/MyReports/cucumber.html"}, //reporting purpose
			monochrome=false,  //console output color
			//tags = "@HomePage or @RegisterTS01 or @LoginTS02 or @DataStructuresTS03 or @stackFeature or @queueFeature or @Array or @LinkedList", //tags from feature file
			features = {"src/test/resources/featurefiles"}, //location of feature files
			glue= {"StepDefinition",},
			publish=true
			) //location of step definition files


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    }


}
