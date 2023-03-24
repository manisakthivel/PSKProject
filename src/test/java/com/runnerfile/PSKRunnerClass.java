package com.runnerfile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Manikandan Sakthivel\\eclipse-workspace1\\PSK\\feature\\registration.feature" },		 
		dryRun = !true,
		glue = "com.stepdefinition",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty", 
			    "html:report" 
			    },
		tags = "@smoke"
		
		)

public class PSKRunnerClass {

}
