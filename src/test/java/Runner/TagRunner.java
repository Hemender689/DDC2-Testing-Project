package Runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\training_d2.03.07\\eclipse-workspace\\cucumber_Demo\\My Features\\TagDemo.feature"
 ,glue={"stepDefinitions",tags = {@smoke,}}
 )



public class TagRunner {

}
