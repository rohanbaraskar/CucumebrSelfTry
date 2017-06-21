package Test_Runner;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;


/**
 * Created by kaival on 29/11/2016.
 */



@CucumberOptions(  monochrome = true,

        features = "src/test/resources/features",
        format = { "pretty","html: cucumber-html-reports",
                "json: cucumber-html-reports/cucumber.json" },
        dryRun = false,
        glue = "Test_Runner/Steps")


public class TestRunner extends AbstractTestNGCucumberTests{
	
}
