package com.OrangeHRM.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features"
		,glue={"com.OrangeHRM.StepDefinitions"}
		,monochrome=true
		,strict=true		
		,plugin= {"pretty","junit:target/Reports/userReport.xml"
				,"json:target/Reports/userReport.json"
				,"html:target/Reports"}
		
		)
public class TestRunner {

}
