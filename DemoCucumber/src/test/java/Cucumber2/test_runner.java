package Cucumber2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features = {"src/test/resources/Login.feature"},glue= {"Defination"},tags = "@PositiveTesting")
	public class test_runner extends AbstractTestNGCucumberTests  {
	}

