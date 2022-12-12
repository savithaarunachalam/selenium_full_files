package Cucumber1;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Login/Login.feature"},dryRun = false,glue = {"Defination"},tags ="@PositiveTesting")
 
public class test_runner extends AbstractTestNGCucumberTests  {

}
