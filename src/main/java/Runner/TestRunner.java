package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "F:\\HybridFramework\\BDDFrameWork\\src\\main\\java\\Features\\taggedhooks.feature", //the path of the feature files
			glue={"stepDefinitions"}, //the path of the step definition files
			format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_otput/cucumber.xml"},//result file
			dryRun=false, //step definition mapping if its value is true
			monochrome=true //display cosole output in readable format
			//tags = {"~@SmokeTest","@RegressionTest"}
			)
public class TestRunner {

}
	//OR  means tags = {"@SmokeTest,"@RegressionTest"} excute the test tagged with smoke or regression test
	
	//And Meanstags = {"@SmokeTest","@RegressionTest"} execute the test both smoke and regression 
	
	//~ is used to ignore the test case tags = {"~@SmokeTest,@RegressionTest"}, smoke test will be ignored
