package Runner_class;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\s.arul.mozhi.udaiyar\\week3.1\\Mydemo_01_Cucumber\\Features99\\BCDC_demo_01.feature",
glue="bdc_step_definition",tags= {"@Sanity","@Regression"},
plugin= {"pretty","html:target/cucumber-html-report","JSON:target/sarmidemo-JSON-report"})

public class bdcrunner {

 

}
