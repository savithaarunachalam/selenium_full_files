package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

		@CucumberOptions(features = {"src/test/resources/Savitha/Savitha.feature"},glue= {"Defination"},tags = "@PositiveTesting")
		public class test_runner extends AbstractTestNGCucumberTests  {
		}




